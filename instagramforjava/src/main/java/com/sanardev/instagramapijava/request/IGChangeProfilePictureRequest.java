package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

public class IGChangeProfilePictureRequest extends BaseRequest {

    @SerializedName("_csrftoken")
    private String csrfToken;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("use_fbuploader")
    private boolean userFbUploader;
    @SerializedName("upload_id")
    private String uploadId;

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

    public boolean isUserFbUploader() {
        return userFbUploader;
    }

    public void setUserFbUploader(boolean userFbUploader) {
        this.userFbUploader = userFbUploader;
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    @Override
    public boolean signaturePayload() {
        return false;
    }
}
