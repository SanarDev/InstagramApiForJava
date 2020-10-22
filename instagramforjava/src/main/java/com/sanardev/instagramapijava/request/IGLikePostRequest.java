package com.sanardev.instagramapijava.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IGLikePostRequest extends BaseRequest {

    @SerializedName("inventory_source")
    @Expose
    private String inventorySource;
    @SerializedName("media_id")
    @Expose
    private String mediaId;
    @SerializedName("_csrftoken")
    @Expose
    private String csrfToken;
    @SerializedName("radio_type")
    @Expose
    private String radioType;
    @SerializedName("_uid")
    @Expose
    private long uid;
    @SerializedName("_uuid")
    @Expose
    private String uuid;
    @SerializedName("is_carousel_bumped_post")
    @Expose
    private boolean isCarouselBumpedPost;
    @SerializedName("container_module")
    @Expose
    private String containerModule;
    @SerializedName("feed_position")
    @Expose
    private int feedPosition;

    public String getInventorySource() {
        return inventorySource;
    }

    public void setInventorySource(String inventorySource) {
        this.inventorySource = inventorySource;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType;
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

    public boolean isCarouselBumpedPost() {
        return isCarouselBumpedPost;
    }

    public void setCarouselBumpedPost(boolean carouselBumpedPost) {
        isCarouselBumpedPost = carouselBumpedPost;
    }

    public String getContainerModule() {
        return containerModule;
    }

    public void setContainerModule(String containerModule) {
        this.containerModule = containerModule;
    }

    public int getFeedPosition() {
        return feedPosition;
    }

    public void setFeedPosition(int feedPosition) {
        this.feedPosition = feedPosition;
    }

    @Override
    public boolean signaturePayload() {
        return true;
    }
}
