package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class CountDownSticker {

    @SerializedName("countdown_id")
    private long countdownId;
    @SerializedName("end_ts")
    private long endTs;
    @SerializedName("text")
    private String text;
    @SerializedName("text_color")
    private String textColor;
    @SerializedName("start_background_color")
    private String startBackgroundColor;
    @SerializedName("end_background_color")
    private String endBackgroundColor;
    @SerializedName("digit_color")
    private String digitColor;
    @SerializedName("digit_card_color")
    private String digitCardColor;
    @SerializedName("following_enabled")
    private boolean followingEnabled;
    @SerializedName("is_owner")
    private boolean isOwner;
    @SerializedName("attribution")
    private Object attribution;
    @SerializedName("viewer_is_following")
    private boolean viewerIsFollowing;


    public long getCountdownId() {
        return countdownId;
    }

    public void setCountdownId(long countdownId) {
        this.countdownId = countdownId;
    }

    public long getEndTs() {
        return endTs;
    }

    public void setEndTs(long endTs) {
        this.endTs = endTs;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getStartBackgroundColor() {
        return startBackgroundColor;
    }

    public void setStartBackgroundColor(String startBackgroundColor) {
        this.startBackgroundColor = startBackgroundColor;
    }

    public String getEndBackgroundColor() {
        return endBackgroundColor;
    }

    public void setEndBackgroundColor(String endBackgroundColor) {
        this.endBackgroundColor = endBackgroundColor;
    }

    public String getDigitColor() {
        return digitColor;
    }

    public void setDigitColor(String digitColor) {
        this.digitColor = digitColor;
    }

    public String getDigitCardColor() {
        return digitCardColor;
    }

    public void setDigitCardColor(String digitCardColor) {
        this.digitCardColor = digitCardColor;
    }

    public boolean isFollowingEnabled() {
        return followingEnabled;
    }

    public void setFollowingEnabled(boolean followingEnabled) {
        this.followingEnabled = followingEnabled;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public boolean isViewerIsFollowing() {
        return viewerIsFollowing;
    }

    public void setViewerIsFollowing(boolean viewerIsFollowing) {
        this.viewerIsFollowing = viewerIsFollowing;
    }
}
