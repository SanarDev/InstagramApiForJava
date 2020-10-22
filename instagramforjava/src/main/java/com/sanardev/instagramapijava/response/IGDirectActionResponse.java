package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.direct.Payload;

public class IGDirectActionResponse extends BaseResponse{

    @SerializedName("action")
    private String action;
    @SerializedName("payload")
    private Payload payload;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
