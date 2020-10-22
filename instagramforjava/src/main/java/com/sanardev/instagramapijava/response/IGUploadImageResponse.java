package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class IGUploadImageResponse extends BaseResponse {

    @SerializedName("upload_id")
    @Expose
    private String uploadId;
    @SerializedName("xsharing_nonces")
    @Expose
    private HashMap<String,String> xsharingNonces;
    private int progress;
    public static IGUploadImageResponse progress(int percentage) {
        IGUploadImageResponse igUploadImageResponse = new IGUploadImageResponse();
        igUploadImageResponse.progress = percentage;
        return igUploadImageResponse;
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public HashMap<String, String> getXsharingNonces() {
        return xsharingNonces;
    }

    public void setXsharingNonces(HashMap<String, String> xsharingNonces) {
        this.xsharingNonces = xsharingNonces;
    }
}
