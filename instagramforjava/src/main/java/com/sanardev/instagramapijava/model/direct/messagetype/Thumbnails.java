package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Thumbnails {


    @SerializedName("video_length")
    @Expose
    private double videoLength;
    @SerializedName("thumbnail_width")
    @Expose
    private int thumbnailWidth;
    @SerializedName("thumbnail_height")
    @Expose
    private int thumbnailHeight;
    @SerializedName("thumbnail_duration")
    @Expose
    private double thumbnailDuration;
    @SerializedName("sprite_urls")
    @Expose
    private List<String> spriteUrls = null;
    @SerializedName("thumbnails_per_row")
    @Expose
    private int thumbnailsPerRow;
    @SerializedName("max_thumbnails_per_sprite")
    @Expose
    private int maxThumbnailsPerSprite;
    @SerializedName("sprite_width")
    @Expose
    private int spriteWidth;
    @SerializedName("sprite_height")
    @Expose
    private int spriteHeight;
    @SerializedName("rendered_width")
    @Expose
    private int renderedWidth;

    public double getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(double videoLength) {
        this.videoLength = videoLength;
    }

    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public int getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public double getThumbnailDuration() {
        return thumbnailDuration;
    }

    public void setThumbnailDuration(double thumbnailDuration) {
        this.thumbnailDuration = thumbnailDuration;
    }

    public List<String> getSpriteUrls() {
        return spriteUrls;
    }

    public void setSpriteUrls(List<String> spriteUrls) {
        this.spriteUrls = spriteUrls;
    }

    public int getThumbnailsPerRow() {
        return thumbnailsPerRow;
    }

    public void setThumbnailsPerRow(int thumbnailsPerRow) {
        this.thumbnailsPerRow = thumbnailsPerRow;
    }

    public int getMaxThumbnailsPerSprite() {
        return maxThumbnailsPerSprite;
    }

    public void setMaxThumbnailsPerSprite(int maxThumbnailsPerSprite) {
        this.maxThumbnailsPerSprite = maxThumbnailsPerSprite;
    }

    public int getSpriteWidth() {
        return spriteWidth;
    }

    public void setSpriteWidth(int spriteWidth) {
        this.spriteWidth = spriteWidth;
    }

    public int getSpriteHeight() {
        return spriteHeight;
    }

    public void setSpriteHeight(int spriteHeight) {
        this.spriteHeight = spriteHeight;
    }

    public int getRenderedWidth() {
        return renderedWidth;
    }

    public void setRenderedWidth(int renderedWidth) {
        this.renderedWidth = renderedWidth;
    }
}
