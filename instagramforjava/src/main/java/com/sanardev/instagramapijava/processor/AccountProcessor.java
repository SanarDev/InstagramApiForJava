package com.sanardev.instagramapijava.processor;

import com.sanardev.instagramapijava.IGConstants;
import com.sanardev.instagramapijava.IGRequest;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.model.login.IGTwoFactorInfo;
import com.sanardev.instagramapijava.model.user.User;
import com.sanardev.instagramapijava.request.IGChangePasswordRequest;
import com.sanardev.instagramapijava.request.IGLoginRequest;
import com.sanardev.instagramapijava.request.IGLogoutRequest;
import com.sanardev.instagramapijava.request.IGSetProfileInformation;
import com.sanardev.instagramapijava.request.IGSetPublicAccount;
import com.sanardev.instagramapijava.request.IGTwoStepAuthRequest;
import com.sanardev.instagramapijava.response.IGCurrentUserResponse;
import com.sanardev.instagramapijava.response.IGLoginResponse;
import com.sanardev.instagramapijava.utils.InstaHashUtils;
import com.sanardev.instagramapijava.utils.StorageUtils;

import java.lang.reflect.Type;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

public class AccountProcessor {

    private final IGRequest igRequest;

    public AccountProcessor(IGRequest igRequest){
        this.igRequest = igRequest;
    }

    public Observable<IGLoginResponse> login() {
        return igRequest.getRemote().getCsrfToken()
                .subscribeOn(Schedulers.io())
                .flatMap((Function<Response<ResponseBody>, ObservableSource<?>>) responseBodyResponse -> {
                    Headers headers = responseBodyResponse.headers();
                    String csrftoken = StorageUtils.findParamFromCookie(headers, IGConstants.CSRFTOKEN);
                    String mid = StorageUtils.findParamFromCookie(headers, IGConstants.MID);
                    Cookie cookie = StorageUtils.getCookie(igRequest.getContext(),igRequest.getUsername());
                    cookie.setCsrftoken(csrftoken);
                    cookie.setMid(mid);
                    cookie.setDeviceID(InstaHashUtils.generateDeviceId(igRequest.getUsername(), igRequest.getPassword()));
                    StorageUtils.saveCookie(igRequest.getContext(), cookie,igRequest.getUsername());

                    IGLoginRequest request = new IGLoginRequest();
                    request.setUsername(igRequest.getUsername());
                    request.setPassword(igRequest.getPassword());
                    request.setPhoneId(cookie.getPhoneID());
                    request.setCsrfToken(csrftoken);
                    request.setGuid(cookie.getGuid());
                    request.setAdid(cookie.getAdid());
                    request.setDeviceId(cookie.getDeviceID());
                    igRequest.invalidData();
                    return igRequest.getRemote().login(igRequest.getHeaders(), igRequest.getSignaturePayload(request));
                })
                .map(o -> {
                    Response<IGLoginResponse> rs = (Response<IGLoginResponse>) o;
                    Headers headers = rs.headers();
                    Cookie cookie = igRequest.getCookie();
                    cookie.setEncPub(headers.values(IGConstants.IG_SET_PASSWORD_ENCRYPTION_PUB_KEY).get(0));
                    cookie.setEncKey(headers.values(IGConstants.IG_SET_PASSWORD_ENCRYPTION_KEY_ID).get(0));
                    cookie.setRur(StorageUtils.findParamFromCookie(headers, "rur"));
                    cookie.setSessionID(StorageUtils.findParamFromCookie(headers, "sessionid"));
                    cookie.setCsrftoken(StorageUtils.findParamFromCookie(headers, "csrftoken"));
                    StorageUtils.saveCookie(igRequest.getContext(), cookie,igRequest.getUsername());

                    if(!rs.isSuccessful()){
                        IGLoginResponse errorBody = igRequest.getGson().fromJson(rs.errorBody().string(), (Type) IGLoginResponse.class);
                        if(errorBody.isTwoFactorRequired()){
                            StorageUtils.saveTwoFactorInfo(igRequest.getContext(),igRequest.getUsername(),errorBody.getTwoFactorInfo());
                            errorBody.setErrorType(IGConstants.Errors.LOGIN_REQUIRE_TWO_STEP_AUTH);
                        }
                        return errorBody;
                    }
                    IGLoginResponse loginResponse = rs.body();
                    StorageUtils.saveUserData(igRequest.getContext(), loginResponse.getLoggedInUser());
                    StorageUtils.setCurrentUser(igRequest.getContext(),igRequest.getUsername(),igRequest.getPassword());
                    igRequest.invalidData();
                    return loginResponse;
                })
                .onErrorResumeNext(throwable -> {
                    if (throwable instanceof HttpException) {
                        ResponseBody body = ((HttpException) throwable).response().errorBody();
                        return Observable.just(igRequest.getGson().fromJson(body.string(), (Type) IGLoginResponse.class));
                    }
                    return Observable.error(throwable);
                });
    }


    public IGTwoFactorInfo getTwoStepAuthInfo(){
        return StorageUtils.getTwoFactorInfo(igRequest.getContext(),igRequest.getUsername());
    }

    public Observable<IGLoginResponse> twoStepAuth(String code) {
        Cookie cookie = igRequest.getCookie();
        IGTwoFactorInfo twoFactorInfo = getTwoStepAuthInfo();
        IGTwoStepAuthRequest request = new IGTwoStepAuthRequest();
        request.setAdid(cookie.getAdid());
        request.setCsrfToken(cookie.getCsrftoken());
        request.setDeviceId(cookie.getDeviceID());
        request.setUsername(igRequest.getUsername());
        request.setPassword(igRequest.getPassword());
        request.setPhoneId(cookie.getPhoneID());
        request.setVerificationCode(code);
        request.setTwoFactorIndentifier(twoFactorInfo.getTwoFactorIdentifier());
        return igRequest.getRemote().twoFactorLogin(igRequest.getHeaders(),igRequest.getSignaturePayload(request))
                .subscribeOn(Schedulers.io())
                .map((Function<Response<IGLoginResponse>, IGLoginResponse>) igLoginResponseResponse -> {
                    Response<IGLoginResponse> rs = (Response<IGLoginResponse>) igLoginResponseResponse;
                    if(!rs.isSuccessful()){
                        IGLoginResponse errorBody = igRequest.getGson().fromJson(rs.errorBody().string(), (Type) IGLoginResponse.class);
                        return errorBody;
                    }
                    IGLoginResponse loginResponse = rs.body();
                    StorageUtils.saveUserData(igRequest.getContext(), loginResponse.getLoggedInUser());
                    StorageUtils.setCurrentUser(igRequest.getContext(),igRequest.getUsername(),igRequest.getPassword());
                    igRequest.invalidData();
                    return loginResponse;
                })
                .onErrorResumeNext(throwable -> {
                    if (throwable instanceof HttpException) {
                        ResponseBody body = ((HttpException) throwable).response().errorBody();
                        return Observable.just(igRequest.getGson().fromJson(body.string(), (Type) IGLoginResponse.class));
                    }
                    return Observable.error(throwable);
                });
    }

    public Observable<IGCurrentUserResponse> editProfile(String firstName, String username, String email, String website, String bio) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        IGSetProfileInformation igSetProfileInformation = new IGSetProfileInformation();
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        igSetProfileInformation.setDeviceId(cookie.getDeviceID());
        igSetProfileInformation.setExternalUrl(website);
        igSetProfileInformation.setFirstName(firstName);
        igSetProfileInformation.setUsername(username);
        igSetProfileInformation.setEmail(email);
        igSetProfileInformation.setBiography(bio);
        igSetProfileInformation.setUid(loggedUser.getPk());
        igSetProfileInformation.setUuid(cookie.getAdid());
        igSetProfileInformation.setCsrfToken(cookie.getCsrftoken());
        igSetProfileInformation.setPhoneNumber(loggedUser.getPhoneNumber());
        return igRequest.getRemote().editProfile(igRequest.getHeaders(), igRequest.getSignaturePayload(igSetProfileInformation))
                .subscribeOn(Schedulers.io());
    }

    public Observable<User> changeProfilePic(String filePath) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.uploadImage(igRequest.getLoggedUser().getPk(), filePath)
                .subscribeOn(Schedulers.io())
                .flatMap(igUploadImageResponse -> igRequest.getRemote().changeProfilePicture(igRequest.getHeaders(), igRequest.getCookie().getCsrftoken(), igRequest.getCookie().getAdid(), true, igUploadImageResponse.getUploadId()));
    }


    public Observable<IGLogoutRequest> logout() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLogoutRequest igLogoutRequest = new IGLogoutRequest();
        igLogoutRequest.setCsrfToken(cookie.getCsrftoken());
        igLogoutRequest.setDeviceId(cookie.getDeviceID());
        igLogoutRequest.setGuid(cookie.getGuid());
        igLogoutRequest.setPhoneId(cookie.getPhoneID());
        igLogoutRequest.setUuid(cookie.getAdid());
        return igRequest.getRemote().logout(igRequest.getHeaders(), igRequest.getSignaturePayload(igLogoutRequest))
                .subscribeOn(Schedulers.io())
                .map(igLogoutResponse -> {
                    StorageUtils.clear(igRequest.getContext());
                    return igLogoutRequest;
                });
    }



    public Observable<User> setAccountPublic() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGSetPublicAccount igSetPublicAccount = new IGSetPublicAccount();
        igSetPublicAccount.setCsrfToken(cookie.getCsrftoken());
        igSetPublicAccount.setUid(igRequest.getLoggedUser().getPk());
        igSetPublicAccount.setUuid(cookie.getAdid());
        return igRequest.getRemote().setAccountPublic(igRequest.getHeaders(), igRequest.getSignaturePayload(igSetPublicAccount))
                .subscribeOn(Schedulers.io());
    }

    public Observable<User> setAccountPrivate() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGSetPublicAccount igSetPublicAccount = new IGSetPublicAccount();
        igSetPublicAccount.setCsrfToken(cookie.getCsrftoken());
        igSetPublicAccount.setUid(igRequest.getLoggedUser().getPk());
        igSetPublicAccount.setUuid(cookie.getAdid());
        return igRequest.getRemote().setAccountPrivate(igRequest.getHeaders(), igRequest.getSignaturePayload(igSetPublicAccount))
                .subscribeOn(Schedulers.io());
    }



    public Observable<ResponseBody> changePassword(String oldPassword, String newPassword) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGChangePasswordRequest igChangePasswordRequest = new IGChangePasswordRequest();
        igChangePasswordRequest.setCsrftoken(cookie.getCsrftoken());
        igChangePasswordRequest.setUid(loggedUser.getPk());
        igChangePasswordRequest.setUuid(cookie.getAdid());
        igChangePasswordRequest.setOldPassword(oldPassword);
        igChangePasswordRequest.setEnwPassword1(newPassword);
        igChangePasswordRequest.setEnwPassword2(newPassword);
        igChangePasswordRequest.setEncOldPassword(InstaHashUtils.encryptPassword(oldPassword, cookie.getEncKey(), cookie.getEncPub()));
        igChangePasswordRequest.setEncNewPassword1(InstaHashUtils.encryptPassword(newPassword, cookie.getEncKey(), cookie.getEncPub()));
        igChangePasswordRequest.setEncNewPassword2(InstaHashUtils.encryptPassword(newPassword, cookie.getEncKey(), cookie.getEncPub()));
        return igRequest.getRemote().changeAccountPassword(igRequest.getHeaders(),igRequest.getSignaturePayload(igChangePasswordRequest))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGCurrentUserResponse> getCurrentUser(boolean wantToEdit) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getCurrentUser(igRequest.getHeaders(), wantToEdit)
                .subscribeOn(Schedulers.io());
    }
}
