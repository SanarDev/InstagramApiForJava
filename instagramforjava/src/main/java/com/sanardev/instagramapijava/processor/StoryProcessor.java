package com.sanardev.instagramapijava.processor;

import com.sanardev.instagramapijava.IGRequest;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.model.story.Story;
import com.sanardev.instagramapijava.request.IGGetStoryMediaRequest;
import com.sanardev.instagramapijava.request.IGGetTimelineStory;
import com.sanardev.instagramapijava.response.IGSendStoryReactionResponse;
import com.sanardev.instagramapijava.response.IGShareStoryResponse;
import com.sanardev.instagramapijava.response.IGStoryMediaResponse;
import com.sanardev.instagramapijava.response.IGStoryReplyResponse;
import com.sanardev.instagramapijava.response.IGStoryUpdateResponse;
import com.sanardev.instagramapijava.response.IGTimeLineStoryResponse;
import com.sanardev.instagramapijava.utils.InstaHashUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class StoryProcessor {

    private final IGRequest igRequest;

    public StoryProcessor(IGRequest igRequest) {
        this.igRequest = igRequest;
    }


    public Observable<IGTimeLineStoryResponse> getTimelineStory() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGGetTimelineStory timelineStory = new IGGetTimelineStory();
        timelineStory.setCsrfToken(cookie.getCsrftoken());
        timelineStory.setReason("cold_start");
        timelineStory.setUuid(cookie.getAdid());
        return igRequest.getRemote().getTimelineStory(igRequest.getHeaders(), igRequest.getSignaturePayload(timelineStory))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGStoryMediaResponse> getStoryMedia(long userId) {
        ArrayList<Long> userIds = new ArrayList<Long>();
        userIds.add(userId);
        return getStoryMedia(userIds);
    }
    public Observable<IGStoryMediaResponse> getStoryMedia(List<Long> userIds) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGGetStoryMediaRequest getStoryMediaRequest = new IGGetStoryMediaRequest();
        getStoryMediaRequest.setCsrfToken(cookie.getCsrftoken());
        getStoryMediaRequest.setSource("feed_timeline");
        getStoryMediaRequest.setUid(loggedUser.getPk());
        getStoryMediaRequest.setUuid(cookie.getAdid());
        getStoryMediaRequest.setUserIds(userIds);
        return igRequest.getRemote().getStoryMedia(igRequest.getHeaders(), igRequest.getSignaturePayload(getStoryMediaRequest))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGSendStoryReactionResponse> sendStoryReaction(String threadId, String mediaId, String reaction, long reelId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<String, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("thread_ids", String.format("[%s]", threadId));
        data.put("client_context", InstaHashUtils.getClientContext());
        data.put("media_id", mediaId);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uid", loggedUser.getPk());
        data.put("text", reaction);
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("entry", "reel");
        data.put("reaction_emoji", reaction);
        data.put("reel_id", reelId);
        data.put("offline_threading_id", data.get("client_context"));
        return igRequest.getRemote().sendStoryReaction(igRequest.getHeaders(), igRequest.getSignaturePayload(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGSendStoryReactionResponse> sendStoryReaction(Story story, String reaction) {
        return sendStoryReaction(story.getUser().getPk(), story.getId(), reaction, story.getPk());
    }

    public Observable<IGSendStoryReactionResponse> sendStoryReaction(long userId, String mediaId, String reaction, long reelId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<String, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("recipient_users", String.format("[[%s]]", userId));
        data.put("client_context", InstaHashUtils.getClientContext());
        data.put("media_id", mediaId);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uid", loggedUser.getPk());
        data.put("text", reaction);
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("entry", "reel");
        data.put("reaction_emoji", reaction);
        data.put("reel_id", reelId);
        data.put("offline_threading_id", data.get("client_context"));
        return igRequest.getRemote().sendStoryReaction(igRequest.getHeaders(), igRequest.getSignaturePayload(data))
                .subscribeOn(Schedulers.io());
    }


    public Observable<IGStoryReplyResponse> sendStoryReply(Story story, String message) {
        return sendStoryReply(story.getUser().getPk(), story.getId(), message, story.getPk(), story.getMediaType());
    }

    public Observable<IGStoryReplyResponse> sendStoryReply(String threadId, String mediaId, String message, long reelId, int mediaType) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<String, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("thread_ids", String.format("[%s]", threadId));
        data.put("client_context", InstaHashUtils.getClientContext());
        data.put("media_id", mediaId);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uid", loggedUser.getPk());
        data.put("text", message);
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("entry", "reel");
        data.put("reel_id", reelId);
        data.put("offline_threading_id", data.get("client_context"));
        String mediaTypeString = igRequest.getMediaString(mediaType);
        return igRequest.getRemote().sendStoryReplyMessage(igRequest.getHeaders(), igRequest.getSignaturePayload(data), mediaTypeString)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGStoryReplyResponse> sendStoryReply(long userId, String mediaId, String message, long reelId, int mediaType) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<String, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("recipient_users", String.format("[[%d]]", userId));
        data.put("client_context", InstaHashUtils.getClientContext());
        data.put("media_id", mediaId);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uid", loggedUser.getPk());
        data.put("text", message);
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("entry", "reel");
        data.put("reel_id", reelId);
        data.put("offline_threading_id", data.get("client_context"));
        String mediaTypeString = igRequest.getMediaString(mediaType);
        return igRequest.getRemote().sendStoryReplyMessage(igRequest.getHeaders(), igRequest.getSignaturePayload(data), mediaTypeString)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGShareStoryResponse> shareStory(String threadId, String mediaId, int mediaType, long reelId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("action", "send_item");
        if(threadId.contains("[[")){
            data.put("recipient_users", threadId);
        }else{
            data.put("thread_ids", String.format("[%s]",threadId));
        }
        data.put("client_context", InstaHashUtils.getClientContext());
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uid", loggedUser.getPk());
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("reel_id", reelId);
        data.put("containermodule", "reel_feed_timeline");
        data.put("story_media_id", mediaId);
        data.put("offline_threading_id", data.get("client_context"));
        String mediaTypeString = igRequest.getMediaString(mediaType);
        return igRequest.getRemote().shareStory(igRequest.getHeaders(), igRequest.formUrlEncode(data), mediaTypeString)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGShareStoryResponse> shareStory(Story story, long userId) {
        return shareStory(userId, story.getId(), story.getMediaType(), story.getPk());
    }

    public Observable<IGShareStoryResponse> shareStory(long userId, String mediaId, int mediaType, long reelId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("action", "send_item");
        data.put("recipient_users", String.format("[[%d]]", userId));
        data.put("client_context", InstaHashUtils.getClientContext());
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uid", loggedUser.getPk());
        data.put("device_id", cookie.getDeviceID());
        data.put("mutation_token", data.get("client_context"));
        data.put("_uuid", cookie.getAdid());
        data.put("reel_id", reelId);
        data.put("containermodule", "reel_feed_timeline");
        data.put("story_media_id", mediaId);
        data.put("offline_threading_id", data.get("client_context"));
        String mediaTypeString = igRequest.getMediaString(mediaType);
        return igRequest.getRemote().shareStory(igRequest.getHeaders(), igRequest.formUrlEncode(data), mediaTypeString)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGStoryUpdateResponse> voteSlider(float vote, long sliderId, String mediaId){
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("_csrftoken",cookie.getCsrftoken());
        data.put("_uid",loggedUser.getPk());
        data.put("vote",vote);
        data.put("_uuid",cookie.getAdid());
        return igRequest.getRemote().voteSlider(igRequest.getHeaders(),mediaId,sliderId,igRequest.getSignaturePayload(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<ResponseBody> markStoryAsSeen(String id, long tokanAt){
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("_csrftoken",cookie.getCsrftoken());
        data.put("_uid",loggedUser.getPk());
        data.put("_uuid",cookie.getAdid());
        data.put("container_module","feed_timeline");
        data.put("live_vods_skipped",new HashMap());
        data.put("nuxes_skipped",new HashMap());
        data.put("nuxes",new HashMap());
        data.put("reels",new HashMap());

        String storyId = String.format("%s_%s",id,id.split("_")[1]);
        HashMap<Object, Object> reels = new HashMap<>();
        reels.put(storyId,new String[]{String.format("%d_%d",tokanAt,System.currentTimeMillis() / 1000)});
        data.put("reels",reels);
        data.put("live_vods",new HashMap());
        data.put("reel_media_skipped",new HashMap());

        return igRequest.getRemote().markStoriesAsSeen(igRequest.getHeaders(),igRequest.getSignaturePayload(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<ResponseBody> storyQuestionResponse(String mediaId, long questionId,String response){
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("_csrftoken",cookie.getCsrftoken());
        data.put("_uid",loggedUser.getPk());
        data.put("_uuid",cookie.getAdid());
        data.put("client_context",InstaHashUtils.getClientContext());
        data.put("type","text");
        data.put("mutation_token",data.get("_csrftoken"));
        data.put("response",response);
        return igRequest.getRemote().storyQuestionResponse(igRequest.getHeaders(),mediaId,questionId,igRequest.getSignaturePayload(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGStoryUpdateResponse> storyQuizAnswer(String mediaId,long quizId,int answer){
        Cookie cookie = igRequest.getCookie();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("_csrftoken",cookie.getCsrftoken());
        data.put("_uuid",cookie.getAdid());
        data.put("answer",answer);
        return igRequest.getRemote().storyQuizAnswer(igRequest.getHeaders(),mediaId.split("_")[0],quizId,igRequest.formUrlEncode(data))
                .subscribeOn(Schedulers.io());
    }

}
