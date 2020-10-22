package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGUnFollowRequest extends BaseRequest{

    @SerializedName("surface")
    private String surface;
    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("user_id")
    private long userId;
    @SerializedName("radio_type")
    private String radioType;
    @SerializedName("uid")
    private long uid;
    @SerializedName("_uuid")
    private String uuid;

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
