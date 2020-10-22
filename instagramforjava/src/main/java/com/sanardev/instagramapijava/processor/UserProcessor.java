package com.sanardev.instagramapijava.processor;

import com.sanardev.instagramapijava.IGRequest;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.request.IGFollowRequest;
import com.sanardev.instagramapijava.request.IGUnFollowRequest;
import com.sanardev.instagramapijava.response.IGFollowResponse;
import com.sanardev.instagramapijava.response.IGUnfollowResponse;
import com.sanardev.instagramapijava.response.IGUserInfoResponse;
import com.sanardev.instagramapijava.utils.Utilities;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class UserProcessor {

    private final IGRequest igRequest;

    public UserProcessor(IGRequest igRequest){
        this.igRequest = igRequest;
    }


    public Observable<IGUnfollowResponse> unFollow(long userId){
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGUnFollowRequest unFollowRequest = new IGUnFollowRequest();
        unFollowRequest.setCsrfToken(cookie.getCsrftoken());
        unFollowRequest.setRadioType("wifi-none");
        unFollowRequest.setSurface("profile");
        unFollowRequest.setUid(loggedUser.getPk());
        unFollowRequest.setUuid(cookie.getAdid());
        unFollowRequest.setUserId(userId);
        return igRequest.getRemote().unfollow(igRequest.getHeaders(),userId,igRequest.getSignaturePayload(unFollowRequest))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGFollowResponse> follow(long userId){
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGFollowRequest followRequest = new IGFollowRequest();
        followRequest.setCsrfToken(cookie.getCsrftoken());
        followRequest.setRadioType("wifi-none");
        followRequest.setUid(loggedUser.getPk());
        followRequest.setUuid(cookie.getAdid());
        followRequest.setDeviceId(cookie.getDeviceID());
        followRequest.setUserId(userId);
        return igRequest.getRemote().follow(igRequest.getHeaders(),userId,igRequest.getSignaturePayload(followRequest))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGUserInfoResponse> getUserInfo(long userId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getUserInfo(igRequest.getHeaders(), userId)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGUserInfoResponse> getUserInfoByUsername(String username){
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getUsernameInfo(igRequest.getHeaders(),username,"feed_timeline")
                .subscribeOn(Schedulers.io());
    }
    public Observable<ResponseBody> search(String query, int countOfResult){
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().searchUser(igRequest.getHeaders(),"user_search_page", Utilities.getTimeZoneOffset(),countOfResult,query)
                .subscribeOn(Schedulers.io());
    }
}
