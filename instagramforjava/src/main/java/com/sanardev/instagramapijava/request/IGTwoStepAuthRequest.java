package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IGTwoStepAuthRequest extends BaseRequest {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("phone_id")
    @Expose
    private String phoneId;
    @SerializedName("_csrftoken")
    @Expose
    private String csrfToken;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("adid")
    @Expose
    private String adid;
    @SerializedName("device_id")
    @Expose
    private String deviceId;
    @SerializedName("verification_code")
    @Expose
    private String verificationCode;
    @SerializedName("two_factor_identifier")
    @Expose
    private String twoFactorIndentifier;
    @SerializedName("login_attempt_account")
    @Expose
    private int loginAttempAccount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getTwoFactorIndentifier() {
        return twoFactorIndentifier;
    }

    public void setTwoFactorIndentifier(String twoFactorIndentifier) {
        this.twoFactorIndentifier = twoFactorIndentifier;
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
