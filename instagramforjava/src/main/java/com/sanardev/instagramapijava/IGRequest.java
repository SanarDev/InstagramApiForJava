package com.sanardev.instagramapijava;

import android.content.Context;
import android.os.Build;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.network.ProgressRequestBody;
import com.sanardev.instagramapijava.response.IGUploadImageResponse;
import com.sanardev.instagramapijava.response.IGUploadFinishResponse;
import com.sanardev.instagramapijava.utils.InstaHashUtils;
import com.sanardev.instagramapijava.utils.MediaUtils;
import com.sanardev.instagramapijava.utils.StorageUtils;
import com.sanardev.instagramapijava.utils.Utilities;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class IGRequest {

    private final Context context;
    private final IGRemote remote;
    private final Gson gson;
    private final String password;
    private final String username;
    private IGLoggedUser loggedUser;
    private Cookie cookie;
    private HashMap<String,String> headers;

    public IGRequest(Context context,String username,String password) {
        this.context = context;
        this.username = username;
        this.password = password;
        invalidData();
        GsonBuilder gsonBuilder = new GsonBuilder().setLenient();
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(IGConstants.BASE_API_URL)
                .client(getOkHttp())
                .build();
        remote = retrofit.create(IGRemote.class);
        gson = new GsonBuilder().create();
    }

    private OkHttpClient getOkHttp() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.MINUTES)
                .connectTimeout(30, TimeUnit.SECONDS).build();
        return httpClient;
    }

    public Context getContext() {
        return context;
    }

    public IGRemote getRemote() {
        return remote;
    }

    public Gson getGson() {
        return gson;
    }

    public IGLoggedUser getLoggedUser() {
        return loggedUser;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void invalidData() {
        this.cookie = StorageUtils.getCookie(context,this.username);
        this.loggedUser = StorageUtils.getUserData(context,this.username);
        this.headers = generateHeaders();
    }

    public HashMap<String, String> generateHeaders() {
        HashMap<String, String> headers = new HashMap();
        headers.put(IGConstants.X_DEVICE_ID, cookie.getDeviceID());
        headers.put(IGConstants.X_IG_DEVICE_LOCALE, IGConstants.LOCALE);
        headers.put(IGConstants.X_IG_MAPPED_LOCALE, IGConstants.LOCALE);
        headers.put(IGConstants.X_PIGEON_SESSION_ID, UUID.randomUUID().toString());
        headers.put(IGConstants.X_PIGEON_RAWCLIENT_TIEM, String.valueOf(System.currentTimeMillis()));
        headers.put(IGConstants.X_IG_CONNECTION_SPEED, "-1kbps");
        headers.put(IGConstants.X_IG_BANDWIDTH_SPEED_KBPS, "1665");
        headers.put(IGConstants.X_IG_BANDWIDTH_TOTALBYTES_B, "465691");
        headers.put(IGConstants.X_IG_BAND_WIDTH_TOTALTIME_MS, "3322");
        headers.put(IGConstants.X_IG_APP_STARTUP_COUNTRY, "IR");
        headers.put(IGConstants.X_BLOKS_VERSION_ID, IGConstants.BLOKS_VERSION_ID);

        headers.put(IGConstants.X_IG_WWW_CLAIM, "0");
        headers.put(IGConstants.X_BLOKS_IS_LAYOUT_RTL, String.valueOf(false));
        headers.put(IGConstants.X_BLOKS_ENABLE_RENDER_CORE, String.valueOf(false));
        headers.put(IGConstants.X_IG_DEVICE_ID, cookie.getDeviceID());
        headers.put(IGConstants.X_IG_ANDROID_ID, "android-2d397713fddd2a9d");
        headers.put(IGConstants.X_IG_CONNECTION_TYPE, "WIFI");
        headers.put(IGConstants.X_IG_CAPABILITIES, IGConstants.DEVICE_CAPABILITIES);

        headers.put(IGConstants.X_IG_APP_ID, IGConstants.APP_ID);
        headers.put(IGConstants.X_USER_AGENT, "Instagram 130.0.0.31.121 Android (29/10; 408dpi; 1080x2038; Xiaomi/xiaomi; Mi A2; jasmine_sprout; qcom; en_US; 200396019)");
        headers.put(IGConstants.ACCEPT_LANGUAGE, IGConstants.LOCALE);
        headers.put(IGConstants.COOKIE,
                String.format("mid=%s; csrftoken=%s;sessionid=%s;dc_user=%s;dc_user_id=%s;",
                        cookie.getMid(),
                        cookie.getCsrftoken(),
                        cookie.getSessionID(),
                        loggedUser == null ? "" : loggedUser.getUsername(),
                        loggedUser == null ? "0" : loggedUser.getPk()));

        headers.put(IGConstants.X_MID, cookie.getMid() == null ? "" : cookie.getMid());
        headers.put(IGConstants.ACCEPT, "application/json");
        headers.put(IGConstants.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put(IGConstants.HOST, "i.instagram.com");
        headers.put(IGConstants.X_FB_HTTP_ENGINE, "Liger");
        headers.put(IGConstants.CONNECTION, "keep-alive");
        return headers;
    }


    public Observable<IGUploadImageResponse> uploadImage(long userId, String filePath) {
        String uploadId = InstaHashUtils.getClientContext();
        File imageFile = new File(filePath);
        if (!imageFile.exists()) {
            throw new RuntimeException("filePath does not exist");
        }
        int hashCode = imageFile.getName().hashCode();
        String uploadName = String.format("%s_0_%d", uploadId, hashCode);

        HashMap<String, Object> igRuploadParam = new HashMap();
        igRuploadParam.put(IGConstants.XSHAREING_USER_IDS, String.format("[%d]", userId));
        igRuploadParam.put(IGConstants.UPLOAD_ID, uploadId);
        igRuploadParam.put(IGConstants.RETRY_CONTEXT, InstaHashUtils.getRetryContext());
        igRuploadParam.put(IGConstants.MEDIA_TYPE, 1);

        HashMap<String, String> imageCompression = new HashMap();
        imageCompression.put("lib_name", "moz");
        imageCompression.put("lib_version", "3.1.m");
        imageCompression.put("quality", "0");
        igRuploadParam.put(IGConstants.IMAGE_COMPRESSION, gson.toJson(imageCompression));

        HashMap<String, String> headers = getHeaders();
        headers.put(IGConstants.X_INSTAGRAM_RUPLOAD_PARAMS, gson.toJson(igRuploadParam));
        headers.put(IGConstants.X_FB_VIDEO_WATERFALL_ID, UUID.randomUUID().toString());
        return remote.getMediaImageUploadUrl(headers, uploadName)
                .flatMap(responseBody -> {
                    headers.put(IGConstants.X_ENTITY_LENGTH, String.valueOf(imageFile.length()));
                    headers.put(IGConstants.X_ENTITY_NAME, uploadName);
                    headers.put(IGConstants.X_ENTITY_TYPE, MediaUtils.getMimeType(filePath));
                    headers.put(IGConstants.OFFSET, String.valueOf(0));
                    headers.put(IGConstants.ACCEPT_ENCODING, IGConstants.GZIP);
                    headers.put(IGConstants.CONTENT_TYPE, IGConstants.OCTET_STREAM_TYPE);
                    return remote.uploadMediaImage(headers, uploadName, getMediaRequestBody(imageFile));
                });
    }

    public Observable<IGUploadFinishResponse> uploadVideo(long userId, String filePath) {
        String uploadId = InstaHashUtils.getClientContext();
        File videoFile = new File(filePath);
        if (!videoFile.exists()) {
            throw new RuntimeException("filePath does not exist");
        }
        int hashCode = videoFile.getName().hashCode();
        String uploadName = String.format("%s-0-%d", uploadId, hashCode);
        int[] mediaWidthHeight = MediaUtils.getMediaWidthAndHeight(filePath);
        int mediaDuration = MediaUtils.getMediaDuration(getContext(), filePath);

        HashMap<String, Object> igRuploadParam = new HashMap();
        igRuploadParam.put(IGConstants.XSHAREING_USER_IDS, String.format("[%d]", userId));
        igRuploadParam.put(IGConstants.DIRECT_V2, true);
        igRuploadParam.put(IGConstants.ROTATE, false);
        igRuploadParam.put(IGConstants.UPLOAD_MEDIA_WIDTH, mediaWidthHeight[0]);
        igRuploadParam.put(IGConstants.UPLOAD_MEDIA_HEIGHT, mediaWidthHeight[1]);
        igRuploadParam.put(IGConstants.HFLIP, false);
        igRuploadParam.put(IGConstants.UPLOAD_MEDIA_DURATION_MS, mediaDuration);
        igRuploadParam.put(IGConstants.UPLOAD_ID, uploadId);
        igRuploadParam.put(IGConstants.RETRY_CONTEXT, InstaHashUtils.getRetryContext());
        igRuploadParam.put(IGConstants.MEDIA_TYPE, 2);
        HashMap<String, String> headers = getHeaders();
        headers.put(IGConstants.X_INSTAGRAM_RUPLOAD_PARAMS, gson.toJson(igRuploadParam));
        headers.put(IGConstants.X_FB_VIDEO_WATERFALL_ID, UUID.randomUUID().toString());
        return remote.getMediaUploadUrl(headers, uploadName)
                .subscribeOn(Schedulers.io())
                .flatMap(responseBody -> {
                    headers.put(IGConstants.X_ENTITY_LENGTH, String.valueOf(filePath.length()));
                    headers.put(IGConstants.X_ENTITY_NAME, uploadName);
                    headers.put(IGConstants.X_ENTITY_TYPE, MediaUtils.getMimeType(filePath));
                    headers.put(IGConstants.OFFSET, String.valueOf(0));
                    headers.put(IGConstants.ACCEPT_ENCODING, IGConstants.GZIP);
                    headers.put(IGConstants.CONTENT_TYPE, IGConstants.OCTET_STREAM_TYPE);
                    return remote.uploadMedia(headers, uploadName, getMediaRequestBody(videoFile));
                })
                .flatMap(responseBody -> {
                    HashMap data = new HashMap();
                    data.put("timezone_offset", Utilities.getTimeZoneOffset());
                    data.put("_csrftoken", cookie.getCsrftoken());
                    data.put("source_type", 4);
                    data.put("_uid", loggedUser.getPk());
                    data.put("device_id", cookie.getDeviceID());
                    data.put("video_result", "");
                    data.put("_uuid", cookie.getAdid());
                    data.put("upload_id", uploadId);
                    data.put("length", 3.066f);

                    HashMap device = new HashMap<>();
                    device.put("manufacturer", Build.MANUFACTURER);
                    device.put("model", Build.MODEL);
                    device.put("android_release", Build.VERSION.RELEASE);
                    device.put("android_version", Build.VERSION.SDK_INT);
                    data.put("device", device);

                    HashMap clips = new HashMap<>();
                    clips.put("length", 3.066f);
                    clips.put("source_type", 4);
                    data.put("clips", clips);

                    HashMap extra = new HashMap<>();
                    extra.put("source_width", mediaWidthHeight[0]);
                    extra.put("source_height", mediaWidthHeight[1]);
                    data.put("extra", extra);

                    data.put("audio_muted", false);
                    data.put("poster_frame_index", 0);

                    HashMap<String, String> headersUploadFinish = getHeaders();
                    headersUploadFinish.put("retry_context", gson.toJson(InstaHashUtils.getRetryContext()));
                    return remote.uploadFinish(headersUploadFinish, getSignaturePayload(data));
                })
                .map((Function<IGUploadFinishResponse, IGUploadFinishResponse>) igUploadFinishResponse -> {
                    igUploadFinishResponse.setUploadId(uploadId);
                    return igUploadFinishResponse;
                });

    }

    public Observable<IGUploadFinishResponse> uploadVoice(long userId, String filePath) {
        String uploadId = InstaHashUtils.getClientContext();
        File videoFile = new File(filePath);
        if (!videoFile.exists()) {
            throw new RuntimeException("filePath does not exist");
        }
        int hashCode = videoFile.getName().hashCode();
        int mediaDuration = MediaUtils.getMediaDuration(getContext(), filePath);
        String uploadName = String.format("%s_0_%d", uploadId, hashCode);

        HashMap<String, Object> igRuploadParam = new HashMap();
        igRuploadParam.put(IGConstants.XSHAREING_USER_IDS, String.format("[%d]", userId));
        igRuploadParam.put(IGConstants.IS_DIRECT_VOICE, true);
        igRuploadParam.put(IGConstants.UPLOAD_MEDIA_DURATION_MS, mediaDuration);
        igRuploadParam.put(IGConstants.UPLOAD_ID, uploadId);
        igRuploadParam.put(IGConstants.RETRY_CONTEXT, InstaHashUtils.getRetryContext());
        igRuploadParam.put(IGConstants.MEDIA_TYPE, 11);
        HashMap<String, String> headers = getHeaders();
        headers.put(IGConstants.X_INSTAGRAM_RUPLOAD_PARAMS, gson.toJson(igRuploadParam));
        headers.put(IGConstants.X_FB_VIDEO_WATERFALL_ID, UUID.randomUUID().toString());
        return remote.getMediaUploadUrl(headers, uploadName)
                .subscribeOn(Schedulers.io())
                .flatMap(responseBody -> {
                    headers.put(IGConstants.X_ENTITY_LENGTH, String.valueOf(filePath.length()));
                    headers.put(IGConstants.X_ENTITY_NAME, uploadName);
                    headers.put(IGConstants.X_ENTITY_TYPE, "audio/mp4");
                    headers.put(IGConstants.OFFSET, String.valueOf(0));
                    headers.put(IGConstants.ACCEPT_ENCODING, IGConstants.GZIP);
                    headers.put(IGConstants.CONTENT_TYPE, IGConstants.OCTET_STREAM_TYPE);
                    return remote.uploadMedia(headers, uploadName, getMediaRequestBody(videoFile));
                })
                .flatMap(responseBody -> {
                    HashMap data = new HashMap();
                    data.put("timezone_offset", Utilities.getTimeZoneOffset());
                    data.put("_csrftoken", cookie.getCsrftoken());
                    data.put("source_type", 4);
                    data.put("_uid", loggedUser.getPk());
                    data.put("device_id", cookie.getDeviceID());
                    data.put("_uuid", cookie.getAdid());
                    data.put("upload_id", uploadId);

                    HashMap device = new HashMap<>();
                    device.put("manufacturer", Build.MANUFACTURER);
                    device.put("model", Build.MODEL);
                    device.put("android_release", Build.VERSION.RELEASE);
                    device.put("android_version", Build.VERSION.SDK_INT);
                    data.put("device", device);

                    HashMap<String, String> headersUploadFinish = getHeaders();
                    headersUploadFinish.put("retry_context", gson.toJson(InstaHashUtils.getRetryContext()));
                    return remote.uploadFinish(headersUploadFinish, getSignaturePayload(data));
                })
                .map((Function<IGUploadFinishResponse, IGUploadFinishResponse>) igUploadFinishResponse -> {
                    igUploadFinishResponse.setUploadId(uploadId);
                    return igUploadFinishResponse;
                });

    }

    public String getMediaString(int MediaType) {
        String strMedia;
        switch (MediaType) {
            case IGConstants.MEDIA_TYPE_VIDEO: {
                strMedia = "video";
                break;
            }
            case IGConstants.MEDIA_TYPE_IMAGE: {
                strMedia = "photo";
                break;
            }
            case IGConstants.MEDIA_TYPE_CAROUSEL_MEDIA: {
                strMedia = "";
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + MediaType);
        }
        return strMedia;
    }

    private RequestBody getMediaRequestBody(File file) {
        return RequestBody.create(
                okhttp3.MediaType.parse("application/octet-stream"),
                MediaUtils.getFileByteArray(file)
        );
    }

    private RequestBody getProgressiveRequestBody(File file, ObservableEmitter<IGUploadImageResponse> emitter) {
        RequestBody requestBody = getMediaRequestBody(file);
        return new ProgressRequestBody(requestBody, percentage -> emitter.onNext(IGUploadImageResponse.progress(percentage)));
    }

    public RequestBody formUrlEncode(HashMap<Object, Object> obj) {
        String parsedData = InstaHashUtils.urlEncodeUTF8(obj);
        return RequestBody.create(
                okhttp3.MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"),
                parsedData
        );
    }

    public RequestBody getSignaturePayload(Object obj) {
        String payload = gson.toJson(obj);
        payload = InstaHashUtils.generateSignature(payload);
        return RequestBody.create(
                okhttp3.MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"),
                payload
        );
    }

}
