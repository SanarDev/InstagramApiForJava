package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGChangePasswordRequest extends BaseRequest{

    @SerializedName("old_password")
    private String oldPassword;
    @SerializedName("_csrftoken")
    private String csrftoken;
    @SerializedName("_uid")
    private long uid;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("enw_password1")
    private String enwPassword1;
    @SerializedName("enw_password2")
    private String enwPassword2;
    @SerializedName("enc_old_password")
    private String encOldPassword;
    @SerializedName("enc_new_password1")
    private String encNewPassword1;
    @SerializedName("enc_new_password2")
    private String encNewPassword2;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getCsrftoken() {
        return csrftoken;
    }

    public void setCsrftoken(String csrftoken) {
        this.csrftoken = csrftoken;
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

    public String getEnwPassword1() {
        return enwPassword1;
    }

    public void setEnwPassword1(String enwPassword1) {
        this.enwPassword1 = enwPassword1;
    }

    public String getEnwPassword2() {
        return enwPassword2;
    }

    public void setEnwPassword2(String enwPassword2) {
        this.enwPassword2 = enwPassword2;
    }

    public String getEncOldPassword() {
        return encOldPassword;
    }

    public void setEncOldPassword(String encOldPassword) {
        this.encOldPassword = encOldPassword;
    }

    public String getEncNewPassword1() {
        return encNewPassword1;
    }

    public void setEncNewPassword1(String encNewPassword1) {
        this.encNewPassword1 = encNewPassword1;
    }

    public String getEncNewPassword2() {
        return encNewPassword2;
    }

    public void setEncNewPassword2(String encNewPassword2) {
        this.encNewPassword2 = encNewPassword2;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
