package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IGUploadFinishResponse extends BaseResponse {

    @SerializedName("upload_id")
    @Expose
    private String uploadId;

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }
}
