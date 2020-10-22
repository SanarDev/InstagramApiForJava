package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGGetTimelineStory extends BaseRequest {

    @SerializedName("reason")
    private String reason;
    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("_uuid")
    private String uuid;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean signaturePayload() {
        return false;
    }
}
