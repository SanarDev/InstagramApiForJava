package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IGGetStoryMediaRequest extends BaseRequest {

    @SerializedName("_csrftoken")
    @Expose
    private String csrfToken;
    @SerializedName("_uid")
    @Expose
    private long uid;
    @SerializedName("_uuid")
    @Expose
    private String uuid;
    @SerializedName("user_ids")
    @Expose
    private List<Long> userIds;
    @SerializedName("source")
    @Expose
    private String source;

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
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

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
