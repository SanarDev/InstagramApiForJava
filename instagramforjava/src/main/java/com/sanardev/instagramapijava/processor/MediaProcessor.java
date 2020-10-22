package com.sanardev.instagramapijava.processor;

import com.sanardev.instagramapijava.IGConstants;
import com.sanardev.instagramapijava.IGRequest;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.model.timeline.MediaOrAd;
import com.sanardev.instagramapijava.request.IGLikePostRequest;
import com.sanardev.instagramapijava.request.IGTimeLinePostsRequest;
import com.sanardev.instagramapijava.request.IGUnlikePostRequest;
import com.sanardev.instagramapijava.response.IGLikePostResponse;
import com.sanardev.instagramapijava.response.IGMediaResponse;
import com.sanardev.instagramapijava.response.IGShareMediaResponse;
import com.sanardev.instagramapijava.response.IGTimeLinePostsResponse;
import com.sanardev.instagramapijava.response.IGUnlikePostResponse;
import com.sanardev.instagramapijava.utils.InstaHashUtils;
import com.sanardev.instagramapijava.utils.Utilities;

import java.util.HashMap;
import java.util.UUID;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MediaProcessor {

    private final IGRequest igRequest;

    public MediaProcessor(IGRequest igRequest) {
        this.igRequest = igRequest;
    }

    public Observable<IGLikePostResponse> likePost(String mediaId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGLikePostRequest igLikePostRequest = new IGLikePostRequest();
        igLikePostRequest.setInventorySource("media_or_ad");
        igLikePostRequest.setMediaId(mediaId);
        igLikePostRequest.setCsrfToken(cookie.getCsrftoken());
        igLikePostRequest.setRadioType("wifi_none");
        igLikePostRequest.setUid(loggedUser.getPk());
        igLikePostRequest.setUuid(cookie.getAdid());
        igLikePostRequest.setCarouselBumpedPost(false);
        igLikePostRequest.setContainerModule("feed_contextual_profile");
        igLikePostRequest.setFeedPosition(0);
        return igRequest.getRemote().likePost(igRequest.getHeaders(), mediaId, igRequest.getSignaturePayload(igLikePostRequest))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGUnlikePostResponse> unlikePost(String mediaId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGUnlikePostRequest igUnlikePostRequest = new IGUnlikePostRequest();
        igUnlikePostRequest.setInventorySource("media_or_ad");
        igUnlikePostRequest.setMediaId(mediaId);
        igUnlikePostRequest.setCsrfToken(cookie.getCsrftoken());
        igUnlikePostRequest.setRadioType("wifi_none");
        igUnlikePostRequest.setUid(loggedUser.getPk());
        igUnlikePostRequest.setUuid(cookie.getAdid());
        igUnlikePostRequest.setCarouselBumpedPost(false);
        igUnlikePostRequest.setContainerModule("feed_contextual_profile");
        igUnlikePostRequest.setFeedPosition(0);
        return igRequest.getRemote().unlikePost(igRequest.getHeaders(), mediaId, igRequest.getSignaturePayload(igUnlikePostRequest))
                .subscribeOn(Schedulers.io());
    }


    public Observable<IGTimeLinePostsResponse> getTimelinePosts() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGTimeLinePostsRequest igTimeLinePostsRequest = new IGTimeLinePostsRequest();
        igTimeLinePostsRequest.setPhoneId(cookie.getPhoneID());
        igTimeLinePostsRequest.setReason("cold_start_fetch");
        igTimeLinePostsRequest.setBatteryLevel("74");
        igTimeLinePostsRequest.setTimezoneOffset(Utilities.getTimeZoneOffset());
        igTimeLinePostsRequest.setCsrfToken(cookie.getCsrftoken());
        igTimeLinePostsRequest.setDeviceId(cookie.getDeviceID());
        igTimeLinePostsRequest.setRequestId(UUID.randomUUID().toString());
        igTimeLinePostsRequest.setIsPullToRefresh(false);
        igTimeLinePostsRequest.setUuid(cookie.getAdid());
        igTimeLinePostsRequest.setIsCharging(false);
        igTimeLinePostsRequest.setWillSoundOn(false);
        igTimeLinePostsRequest.setSessionId(cookie.getSessionID());
        igTimeLinePostsRequest.setBloksVersioningId(IGConstants.BLOKS_VERSION_ID);
        return igRequest.getRemote().getTimelinePosts(igRequest.getHeaders(), igRequest.getSignaturePayload(igTimeLinePostsRequest))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGShareMediaResponse> shareMedia(String threadId, String mediaId, int mediaType) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        HashMap<String, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("thread_ids", String.format("[%s]", threadId));
        data.put("client_context",InstaHashUtils.getClientContext());
        data.put("media_id", mediaId);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("offline_threading_id", data.get("client_context"));
        String strMediaType = igRequest.getMediaString(mediaType);
        return igRequest.getRemote().shareMedia(igRequest.getHeaders(), igRequest.getSignaturePayload(data), strMediaType)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGShareMediaResponse> shareMedia(long userId, MediaOrAd mediaOrAd) {
        return shareMedia(userId, mediaOrAd.getId(), mediaOrAd.getMediaType());
    }

    public Observable<IGShareMediaResponse> shareMedia(long userId, String mediaId, int mediaType) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("recipient_users", String.format("[[%d]]", userId));
        data.put("client_context",InstaHashUtils.getClientContext());
        data.put("media_id", mediaId);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("offline_threading_id", data.get("client_context"));
        String strMediaType = igRequest.getMediaString(mediaType);
        return igRequest.getRemote().shareMedia(igRequest.getHeaders(), igRequest.formUrlEncode(data), strMediaType)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGMediaResponse> getMediaById(String mediaId){
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getMediaById(igRequest.getHeaders(),mediaId)
                        .subscribeOn(Schedulers.io());
    }


}
