package com.sanardev.instagramapijava.model.direct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MessageMetaData {

    @SerializedName("thread_id")
    @Expose
    private String threadId;
    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("client_context")
    @Expose
    private String clientContext;
    @SerializedName("participant_ids")
    @Expose
    private List<Long> participantIds;

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getClientContext() {
        return clientContext;
    }

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    public List<Long> getParticipantIds() {
        return participantIds;
    }

    public void setParticipantIds(List<Long> participantIds) {
        this.participantIds = participantIds;
    }
}
