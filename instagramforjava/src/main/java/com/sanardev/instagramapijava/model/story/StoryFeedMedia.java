package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class StoryFeedMedia extends BaseStoryItem {

    @SerializedName("media_id")
    private String mediaId;
    @SerializedName("product_type")
    private String productType;
    @SerializedName("media_code")
    private String mediaCode;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getMediaCode() {
        return mediaCode;
    }

    public void setMediaCode(String mediaCode) {
        this.mediaCode = mediaCode;
    }
}
