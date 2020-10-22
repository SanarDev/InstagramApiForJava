package com.sanardev.instagramapijava.model.media;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CarouselMedia {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("media_type")
    @Expose
    private int mediaType;
    @SerializedName("image_versions2")
    @Expose
    private ImageVersions2 imageVersions2;
    @SerializedName("video_versions")
    @Expose
    private List<VideoVersion> videoVersions;
    @SerializedName("original_width")
    @Expose
    private int originalWidth;
    @SerializedName("original_height")
    @Expose
    private int originalHeight;
    @SerializedName("pk")
    @Expose
    private long pk;
    @SerializedName("carousel_parent_id")
    @Expose
    private String carouselParentId;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private boolean canSeeInsightsAsBrand;
    @SerializedName("usertags")
    @Expose
    private Usertags usertags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public ImageVersions2 getImageVersions2() {
        return imageVersions2;
    }

    public void setImageVersions2(ImageVersions2 imageVersions2) {
        this.imageVersions2 = imageVersions2;
    }

    public List<VideoVersion> getVideoVersions() {
        return videoVersions;
    }

    public void setVideoVersions(List<VideoVersion> videoVersions) {
        this.videoVersions = videoVersions;
    }

    public int getOriginalWidth() {
        return originalWidth;
    }

    public void setOriginalWidth(int originalWidth) {
        this.originalWidth = originalWidth;
    }

    public int getOriginalHeight() {
        return originalHeight;
    }

    public void setOriginalHeight(int originalHeight) {
        this.originalHeight = originalHeight;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public String getCarouselParentId() {
        return carouselParentId;
    }

    public void setCarouselParentId(String carouselParentId) {
        this.carouselParentId = carouselParentId;
    }

    public boolean isCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public Usertags getUsertags() {
        return usertags;
    }

    public void setUsertags(Usertags usertags) {
        this.usertags = usertags;
    }
}