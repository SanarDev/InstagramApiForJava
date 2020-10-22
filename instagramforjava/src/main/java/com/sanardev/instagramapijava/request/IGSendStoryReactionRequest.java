package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGSendStoryReactionRequest extends BaseRequest {

    @SerializedName("action")
    private String action;
    @SerializedName("recipient_users")
    private String recipientUsers;
    @SerializedName("thread_ids")
    private String threadIds;
    @SerializedName("client_context")
    private String clientContext;
    @SerializedName("media_id")
    private String mediaId;
    @SerializedName("_csrftoken")
    private String csrftoken;
    @SerializedName("_uid")
    private long uid;
    @SerializedName("text")
    private String text;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("mutationToken")
    private String mutationToken;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("entry")
    private String entry;
    @SerializedName("reaction_emoji")
    private String reactionEmoji;
    @SerializedName("reel_id")
    private long reelId;
    @SerializedName("offline_threading_id")
    private String offlineThreadingId;

    public String getThreadIds() {
        return threadIds;
    }

    public void setThreadIds(String threadIds) {
        this.threadIds = threadIds;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getClientContext() {
        return clientContext;
    }

    public String getRecipientUsers() {
        return recipientUsers;
    }

    public void setRecipientUsers(String recipientUsers) {
        this.recipientUsers = recipientUsers;
    }

    public void setMutationToken(String mutationToken) {
        this.mutationToken = mutationToken;
    }

    public void setOfflineThreadingId(String offlineThreadingId) {
        this.offlineThreadingId = offlineThreadingId;
    }

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
        this.mutationToken = clientContext;
        this.offlineThreadingId = clientContext;
    }

    public String getMutationToken() {
        return mutationToken;
    }

    public String getOfflineThreadingId() {
        return offlineThreadingId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getCsrftoken() {
        return csrftoken;
    }

    public void setCsrftoken(String csrftoken) {
        this.csrftoken = csrftoken;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getReactionEmoji() {
        return reactionEmoji;
    }

    public void setReactionEmoji(String reactionEmoji) {
        this.reactionEmoji = reactionEmoji;
    }

    public long getReelId() {
        return reelId;
    }

    public void setReelId(long reelId) {
        this.reelId = reelId;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
