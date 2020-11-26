package com.sanardev.instagramapijava.processor;

import com.sanardev.instagramapijava.IGRequest;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.direct.IGThread;
import com.sanardev.instagramapijava.model.direct.ThreadUser;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.response.IGDirectActionResponse;
import com.sanardev.instagramapijava.response.IGDirectChatResponse;
import com.sanardev.instagramapijava.response.IGDirectsResponse;
import com.sanardev.instagramapijava.response.IGMediaVoiceResponse;
import com.sanardev.instagramapijava.response.IGParticipantsResponse;
import com.sanardev.instagramapijava.response.IGPresenceResponse;
import com.sanardev.instagramapijava.response.IGRecipientsResponse;
import com.sanardev.instagramapijava.utils.InstaHashUtils;
import com.sanardev.instagramapijava.utils.MediaUtils;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;


public class DirectProcessor {

    private final IGRequest igRequest;

    enum InboxReturnType {
        UNSEEN
    }

    public DirectProcessor(IGRequest igRequest) {
        this.igRequest = igRequest;
    }


    public Observable<IGDirectsResponse> getInbox(InboxReturnType visualMessageReturnType, int limit, int threadMessageLimit) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        String strReturnType = "unseen";
        if (visualMessageReturnType == InboxReturnType.UNSEEN) {
            strReturnType = "unseen";
        }
        return igRequest.getRemote().getDirectIndex(igRequest.getHeaders(), strReturnType, threadMessageLimit, true, limit)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectsResponse> getInbox(int limit, int threadMessageLimit) {
        return getInbox(InboxReturnType.UNSEEN, threadMessageLimit, limit);
    }

    public Observable<IGDirectsResponse> getInbox() {
        return getInbox(InboxReturnType.UNSEEN, 20, 20);
    }

    public Observable<IGDirectsResponse> loadMoreInbox(InboxReturnType visualMessageReturnType, int limit, int threadMessageLimit, int seqId, String cursor) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        String strReturnType = "unseen";
        if (visualMessageReturnType == InboxReturnType.UNSEEN) {
            strReturnType = "unseen";
        }
        return igRequest.getRemote().loadMoreDirects(igRequest.getHeaders(), strReturnType, cursor, "older", seqId, 20, true, 20)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectsResponse> loadMoreInbox(int seqId, String cursor) {
        return loadMoreInbox(InboxReturnType.UNSEEN, 20, 20, seqId, cursor);
    }

    public Observable<IGDirectChatResponse> getDirectChats(String threadId, int seqId, InboxReturnType returnType, int limit) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        String strReturnType = "unseen";
        if (returnType == InboxReturnType.UNSEEN) {
            strReturnType = "unseen";
        }
        return igRequest.getRemote().getDirectChats(igRequest.getHeaders(), threadId, strReturnType, limit, seqId)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectChatResponse> getDirectChats(String threadId, int seqId) {
        return getDirectChats(threadId, seqId, InboxReturnType.UNSEEN, 20);
    }


    public Observable<IGDirectChatResponse> getDirectMoreChats(String threadId, int seqId, String cursor, InboxReturnType returnType, int limit) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        String strReturnType = "unseen";
        if (returnType == InboxReturnType.UNSEEN) {
            strReturnType = "unseen";
        }
        return igRequest.getRemote().loadMoreDirectChats(igRequest.getHeaders(), threadId, strReturnType, "older", cursor, limit, seqId)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectChatResponse> getDirectMoreChats(String threadId, int seqId, String cursor) {
        return getDirectMoreChats(threadId, seqId, cursor, InboxReturnType.UNSEEN, 20);
    }

    public Observable<IGPresenceResponse> getDirectPresence() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getDirectPresence(igRequest.getHeaders())
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGRecipientsResponse> getRecipient() {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getRecipients(igRequest.getHeaders(), "raven", true)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGRecipientsResponse> getRecipient(String query) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().searchRecipients(igRequest.getHeaders(), "raven", true, query)
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectActionResponse> sendReaction(String itemId, String threadId, String clientContext, String reactionType, String reactionStatus) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("item_type", "reaction");
        data.put("reaction_type", reactionType);
        data.put("action", "send_item");
        data.put("thread_ids", String.format("[%s]", threadId));
        data.put("client_context", clientContext);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("mutation_token", clientContext);
        data.put("_uuid", cookie.getAdid());
        data.put("node_type", "item");
        data.put("reaction_status", reactionStatus);
        data.put("item_id", itemId);
        data.put("device_id", cookie.getDeviceID());
        return igRequest.getRemote().sendReaction(igRequest.getHeaders(), igRequest.formUrlEncode(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectActionResponse> sendReaction(String itemId, String threadId, String reactionType) {
        return sendReaction(itemId, threadId, InstaHashUtils.getClientContext(), reactionType, "created")
                .subscribeOn(Schedulers.io());
    }
    public Observable<ResponseBody> unsendMessage(String itemId, String threadId, String reactionType) {
        Cookie cookie = igRequest.getCookie();
        HashMap data = new HashMap();
        data.put("_uuid",cookie.getAdid());
        data.put("_csrftoken",cookie.getCsrftoken());
        data.put("original_message_client_context",InstaHashUtils.getClientContext());
        return igRequest.getRemote().unsendMessage(igRequest.getHeaders(),itemId, threadId,igRequest.formUrlEncode(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectActionResponse> sendLikeReaction(String itemId, String threadId,String clientContext) {
        return sendReaction(itemId, threadId, clientContext, "like", "created")
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectActionResponse> markAsSeenMessage(String threadId, String itemId, String clientContext) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("thread_id", threadId);
        data.put("action", "mark_seen");
        data.put("client_context", clientContext);
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uuid", cookie.getAdid());
        data.put("offline_threading_id", clientContext);
        return igRequest.getRemote().markAsSeen(igRequest.getHeaders(), threadId, itemId, igRequest.formUrlEncode(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectActionResponse> markAsSeenMessage(String threadId, String itemId) {
        return markAsSeenMessage(threadId, itemId, InstaHashUtils.getClientContext())
                .subscribeOn(Schedulers.io());
    }

    public Observable<ResponseBody> markAsSeenRavenMedia(String threadId, String itemId, String messageClientContext) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        HashMap<Object, Object> data = new HashMap<>();
        data.put("items_id", String.format("[%s]", itemId));
        data.put("_uid", loggedUser.getPk());
        data.put("_csrftoken", cookie.getCsrftoken());
        data.put("_uuid", cookie.getAdid());
        data.put("original_message_client_context", messageClientContext);
        return igRequest.getRemote().markAsSeenRavenMedia(igRequest.getHeaders(), threadId, igRequest.getSignaturePayload(data))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGDirectActionResponse> sendMediaVideo(String threadId, List<Long> userId, String filePath, String clientContext) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        return igRequest.uploadVideo(userId, filePath)
                .subscribeOn(Schedulers.io())
                .flatMap(response -> {
                    HashMap data = new HashMap();
                    data.put("action", "send_item");
                    data.put("thread_ids", String.format("[%s]", threadId));
                    data.put("client_context", clientContext);
                    data.put("_csrftoken", cookie.getCsrftoken());
                    data.put("video_result", "");
                    data.put("device_id", cookie.getDeviceID());
                    data.put("mutation_token", clientContext);
                    data.put("_uuid", cookie.getAdid());
                    data.put("upload_id", response.getUploadId());
                    data.put("offline_threading_id", clientContext);
                    return igRequest.getRemote().sendDirectMediaVideo(igRequest.getHeaders(), igRequest.formUrlEncode(data));
                });
    }

    public Observable<IGDirectActionResponse> sendMediaImage(String threadId, List<Long> userId, String filePath, String clientContext) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        return igRequest.uploadImage(userId, filePath)
                .subscribeOn(Schedulers.io())
                .flatMap(response -> {
                    HashMap<Object,Object> dataRequest = new HashMap();
                    dataRequest.put("action", "send_item");
                    dataRequest.put("thread_ids", String.format("[%s]", threadId));
                    dataRequest.put("client_context", clientContext);
                    dataRequest.put("_csrftoken", cookie.getCsrftoken());
                    dataRequest.put("allow_full_aspect_ratio", true);
                    dataRequest.put("device_id", cookie.getDeviceID());
                    dataRequest.put("mutation_token", clientContext);
                    dataRequest.put("_uuid", cookie.getAdid());
                    dataRequest.put("upload_id", response.getUploadId());
                    dataRequest.put("offline_threading_id", clientContext);
                    return igRequest.getRemote().sendDirectMediaImage(igRequest.getHeaders(), igRequest.formUrlEncode(dataRequest));
                });
    }

    public Observable<IGMediaVoiceResponse> sendMediaVoice(String threadId, List<Long> userId, String filePath, String clientContext) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
//        if(!MediaUtils.getMimeType(filePath).contains("mp4")){
//            throw new IllegalArgumentException("filePath type must be mp4");
//        }
        Cookie cookie = igRequest.getCookie();
        return igRequest.uploadVoice(userId, filePath)
                .subscribeOn(Schedulers.io())
                .flatMap(response -> {
                    HashMap data = new HashMap();
                    data.put("action", "send_item");
                    data.put("thread_ids", String.format("[%s]", threadId));
                    data.put("client_context", clientContext);
                    data.put("_csrftoken", cookie.getCsrftoken());
                    data.put("device_id", cookie.getDeviceID());
                    data.put("waveform","[]");
                    data.put("waveform_sampling_frequency_hz","10");
                    data.put("mutation_token", clientContext);
                    data.put("_uuid", cookie.getAdid());
                    data.put("upload_id", response.getUploadId());
                    data.put("offline_threading_id", clientContext);
                    return igRequest.getRemote().sendDirectMediaVoice(igRequest.getHeaders(), igRequest.formUrlEncode(data));
                });
    }

    public Observable<IGParticipantsResponse> getThreadByParticipants(long userId,int seqId){
        return igRequest.getRemote().getThreadByParticipants(igRequest.getHeaders(),String.format("[[%d]]",userId),seqId,20)
                .subscribeOn(Schedulers.io());
    }

    public IGThread createFakeThread(long userId,String fullname, @Nullable String profileImage) {
        IGThread igThread = new IGThread();
        igThread.setThreadId(String.format("[[%d]]",userId));
        igThread.setThreadTitle(fullname);
        ThreadUser threadUser = new ThreadUser();
        threadUser.setPk(userId);
        threadUser.setProfilePicUrl(profileImage);
        ArrayList<ThreadUser> users = new ArrayList<>();
        users.add(threadUser);
        igThread.setUsers(users);
        return igThread;
    }
}
