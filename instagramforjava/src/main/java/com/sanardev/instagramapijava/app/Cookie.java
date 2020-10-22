package com.sanardev.instagramapijava.app;

import com.google.gson.annotations.SerializedName;

public class Cookie {

    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("phone_id")
    private String phoneID;
    @SerializedName("device_id")
    private String deviceID;
    @SerializedName("mid")
    private String mid;
    @SerializedName("rur")
    private String rur;
    @SerializedName("guid")
    private String guid;
    @SerializedName("adid")
    private String adid;
    @SerializedName("csrftoken")
    private String csrftoken;
    @SerializedName("session_id")
    private String sessionID;
    @SerializedName("enc_pub")
    private String encPub;
    @SerializedName("enc_key")
    private String encKey;
    @SerializedName("two_factor_identifier")
    private String twoFactorIdentifier;

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

    public String getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(String phoneID) {
        this.phoneID = phoneID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getRur() {
        return rur;
    }

    public void setRur(String rur) {
        this.rur = rur;
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

    public String getCsrftoken() {
        return csrftoken;
    }

    public void setCsrftoken(String csrftoken) {
        this.csrftoken = csrftoken;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getEncPub() {
        return encPub;
    }

    public void setEncPub(String encPub) {
        this.encPub = encPub;
    }

    public String getEncKey() {
        return encKey;
    }

    public void setEncKey(String encKey) {
        this.encKey = encKey;
    }

    public String getTwoFactorIdentifier() {
        return twoFactorIdentifier;
    }

    public void setTwoFactorIdentifier(String twoFactorIdentifier) {
        this.twoFactorIdentifier = twoFactorIdentifier;
    }
}
