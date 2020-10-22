package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("error_title")
    @Expose
    private String errorTitle;
    @SerializedName("error_body")
    @Expose
    private String errorBody;
    @SerializedName("error_type")
    @Expose
    private String errorType;
    @SerializedName("checkpoint_url")
    @Expose
    private String checkpointUrl;
    @SerializedName("spam")
    @Expose
    private boolean spam;
    @SerializedName("lock")
    @Expose
    private boolean lock;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }

    public String getErrorBody() {
        return errorBody;
    }

    public void setErrorBody(String errorBody) {
        this.errorBody = errorBody;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getCheckpointUrl() {
        return checkpointUrl;
    }

    public void setCheckpointUrl(String checkpointUrl) {
        this.checkpointUrl = checkpointUrl;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }
}
