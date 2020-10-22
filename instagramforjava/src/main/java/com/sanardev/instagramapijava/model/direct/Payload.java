package com.sanardev.instagramapijava.model.direct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {


    @SerializedName("client_context")
    @Expose
    private String clientContext;
    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("thread_id")
    @Expose
    private String threadId;

    public String getClientContext() {
        return clientContext;
    }

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
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

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }
}
