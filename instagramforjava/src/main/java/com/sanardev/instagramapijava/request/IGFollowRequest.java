package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGFollowRequest extends BaseRequest {

    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("user_id")
    private long userId;
    @SerializedName("radio_type")
    private String radioType;
    @SerializedName("_uid")
    private long uid;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("device_id")
    private String deviceId;

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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
