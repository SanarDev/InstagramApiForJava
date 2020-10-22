package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VoiceMedia {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("media_type")
    @Expose
    private Long mediaType;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("audio")
    @Expose
    private Audio audio;
    @SerializedName("organic_tracking_token")
    @Expose
    private String organicTrackingToken;
    @SerializedName("user")
    @Expose
    private Object user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getMediaType() {
        return mediaType;
    }

    public void setMediaType(Long mediaType) {
        this.mediaType = mediaType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public String getOrganicTrackingToken() {
        return organicTrackingToken;
    }

    public void setOrganicTrackingToken(String organicTrackingToken) {
        this.organicTrackingToken = organicTrackingToken;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}

