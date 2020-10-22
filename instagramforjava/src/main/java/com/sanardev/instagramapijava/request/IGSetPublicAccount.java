package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGSetPublicAccount extends BaseRequest {

    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("_uid")
    private long uid;

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

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
