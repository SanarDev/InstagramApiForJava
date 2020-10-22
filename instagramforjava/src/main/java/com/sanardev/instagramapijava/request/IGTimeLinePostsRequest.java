package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGTimeLinePostsRequest extends BaseRequest {

    @SerializedName("phone_id")
    private String phoneId;
    @SerializedName("reason")
    private String reason;
    @SerializedName("battery_level")
    private String batteryLevel;
    @SerializedName("timezone_offset")
    private int timezoneOffset;
    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("request_id")
    private String requestId;
    @SerializedName("is_pull_to_refresh")
    private boolean isPullToRefresh;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("is_charging")
    private boolean isCharging;
    @SerializedName("will_sound_on")
    private boolean willSoundOn;
    @SerializedName("session_id")
    private String sessionId;
    @SerializedName("bloks_versioning_id")
    private String bloksVersioningId;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public boolean getIsPullToRefresh() {
        return isPullToRefresh;
    }

    public void setIsPullToRefresh(boolean isPullToRefresh) {
        this.isPullToRefresh = isPullToRefresh;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean getIsCharging() {
        return isCharging;
    }

    public void setIsCharging(boolean isCharging) {
        this.isCharging = isCharging;
    }

    public boolean getWillSoundOn() {
        return willSoundOn;
    }

    public void setWillSoundOn(boolean willSoundOn) {
        this.willSoundOn = willSoundOn;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getBloksVersioningId() {
        return bloksVersioningId;
    }

    public void setBloksVersioningId(String bloksVersioningId) {
        this.bloksVersioningId = bloksVersioningId;
    }
}
