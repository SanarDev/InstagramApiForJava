package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DirectLikeReactions {


    public DirectLikeReactions(long senderId,long timestamp,String clientContext){
        this.senderId = senderId;
        this.timestamp = timestamp;
        this.clientContext = clientContext;
    }
    @SerializedName("sender_id")
    @Expose
    private long senderId;
    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("client_context")
    @Expose
    private String clientContext;

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getClientContext() {
        return clientContext;
    }

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }
}
