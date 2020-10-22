package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class IGSendCommentRequest extends BaseRequest{

    @SerializedName("feed_position")
    private int feedPosition;
    @SerializedName("container_module")
    private String containerModule;
    @SerializedName("is_carousel_bumped_post")
    private boolean isCarouselBumpedPost;
    @SerializedName("comment_text")
    private String commentText;
    @SerializedName("_uuid")
    private String uuid;
    @SerializedName("_uid")
    private long uid;
    @SerializedName("radio_type")
    private String radioType;
    @SerializedName("_csrftoken")
    private String csrftoken;
    @SerializedName("idempotence_token")
    private String idempotenceToken = UUID.randomUUID().toString();
    @SerializedName("inventory_source")
    private String inventorySource;

    public int getFeedPosition() {
        return feedPosition;
    }

    public void setFeedPosition(int feedPosition) {
        this.feedPosition = feedPosition;
    }

    public String getContainerModule() {
        return containerModule;
    }

    public void setContainerModule(String containerModule) {
        this.containerModule = containerModule;
    }

    public boolean isCarouselBumpedPost() {
        return isCarouselBumpedPost;
    }

    public void setCarouselBumpedPost(boolean carouselBumpedPost) {
        isCarouselBumpedPost = carouselBumpedPost;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType;
    }

    public String getCsrftoken() {
        return csrftoken;
    }

    public void setCsrftoken(String csrftoken) {
        this.csrftoken = csrftoken;
    }

    public String getIdempotenceToken() {
        return idempotenceToken;
    }

    public void setIdempotenceToken(String idempotenceToken) {
        this.idempotenceToken = idempotenceToken;
    }

    public String getInventorySource() {
        return inventorySource;
    }

    public void setInventorySource(String inventorySource) {
        this.inventorySource = inventorySource;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
