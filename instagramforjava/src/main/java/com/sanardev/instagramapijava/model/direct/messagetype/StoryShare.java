package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoryShare {



    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("reel_id")
    @Expose
    private String reelId;
    @SerializedName("reel_type")
    @Expose
    private String reelType;
    @SerializedName("is_reel_persisted")
    @Expose
    private Boolean isReelPersisted;
    @SerializedName("story_share_type")
    @Expose
    private String storyShareType;
    @SerializedName("is_linked")
    @Expose
    private boolean isLinked = false;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("reason")
    @Expose
    private int reason;
    @SerializedName("text")
    @Expose
    private String text;

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getReelId() {
        return reelId;
    }

    public void setReelId(String reelId) {
        this.reelId = reelId;
    }

    public String getReelType() {
        return reelType;
    }

    public void setReelType(String reelType) {
        this.reelType = reelType;
    }

    public Boolean getReelPersisted() {
        return isReelPersisted;
    }

    public void setReelPersisted(Boolean reelPersisted) {
        isReelPersisted = reelPersisted;
    }

    public String getStoryShareType() {
        return storyShareType;
    }

    public void setStoryShareType(String storyShareType) {
        this.storyShareType = storyShareType;
    }

    public boolean isLinked() {
        return isLinked;
    }

    public void setLinked(boolean linked) {
        isLinked = linked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
