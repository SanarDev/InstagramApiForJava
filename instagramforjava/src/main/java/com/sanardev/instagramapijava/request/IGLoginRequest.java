package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGLoginRequest extends BaseRequest {

    @SerializedName("username")
    private String username;
    @SerializedName("phone_id")
    private String phoneId;
    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("guid")
    private String guid;
    @SerializedName("adid")
    private String adid;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("password")
    private String password;
    @SerializedName("country_codes")
    private String countryCode = "[{\"country_code\":\"1\",\"source\":[\"default\"]},{\"country_code\":\"7\",\"source\":[\"uig_via_phone_id\"]}]";
    @SerializedName("login_attemp_account")
    private int loginAttempAccount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAdid() {
        return adid;
    }

    public void setAdid(String adid) {
        this.adid = adid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getLoginAttempAccount() {
        return loginAttempAccount;
    }

    public void setLoginAttempAccount(int loginAttempAccount) {
        this.loginAttempAccount = loginAttempAccount;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
