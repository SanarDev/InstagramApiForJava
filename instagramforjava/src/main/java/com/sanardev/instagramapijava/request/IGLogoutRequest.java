package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGLogoutRequest extends BaseRequest {

    @SerializedName("phone_id")
    private String phoneId;
    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("guid")
    private String guid;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("_uuid")
    private String uuid;

    @Override
    public boolean signaturePayload() {
        return false;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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
}
