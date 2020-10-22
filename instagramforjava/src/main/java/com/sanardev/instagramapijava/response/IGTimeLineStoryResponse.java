package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.story.Tray;

import java.util.List;

public class IGTimeLineStoryResponse extends BaseResponse{

    @SerializedName("tray")
    @Expose
    private List<Tray> tray = null;
    @SerializedName("story_ranking_token")
    @Expose
    private String storyRankingToken;
    @SerializedName("broadcasts")
    @Expose
    private List<Object> broadcasts = null;
    @SerializedName("sticker_version")
    @Expose
    private Long stickerVersion;
    @SerializedName("face_filter_nux_version")
    @Expose
    private Long faceFilterNuxVersion;
    @SerializedName("stories_viewer_gestures_nux_eligible")
    @Expose
    private Boolean storiesViewerGesturesNuxEligible;
    @SerializedName("has_new_nux_story")
    @Expose
    private Boolean hasNewNuxStory;
    @SerializedName("refresh_window_ms")
    @Expose
    private Long refreshWindowMs;
    @SerializedName("response_timestamp")
    @Expose
    private Long responseTimestamp;

    public List<Tray> getTray() {
        return tray;
    }

    public void setTray(List<Tray> tray) {
        this.tray = tray;
    }

    public String getStoryRankingToken() {
        return storyRankingToken;
    }

    public void setStoryRankingToken(String storyRankingToken) {
        this.storyRankingToken = storyRankingToken;
    }

    public List<Object> getBroadcasts() {
        return broadcasts;
    }

    public void setBroadcasts(List<Object> broadcasts) {
        this.broadcasts = broadcasts;
    }

    public Long getStickerVersion() {
        return stickerVersion;
    }

    public void setStickerVersion(Long stickerVersion) {
        this.stickerVersion = stickerVersion;
    }

    public Long getFaceFilterNuxVersion() {
        return faceFilterNuxVersion;
    }

    public void setFaceFilterNuxVersion(Long faceFilterNuxVersion) {
        this.faceFilterNuxVersion = faceFilterNuxVersion;
    }

    public Boolean getStoriesViewerGesturesNuxEligible() {
        return storiesViewerGesturesNuxEligible;
    }

    public void setStoriesViewerGesturesNuxEligible(Boolean storiesViewerGesturesNuxEligible) {
        this.storiesViewerGesturesNuxEligible = storiesViewerGesturesNuxEligible;
    }

    public Boolean getHasNewNuxStory() {
        return hasNewNuxStory;
    }

    public void setHasNewNuxStory(Boolean hasNewNuxStory) {
        this.hasNewNuxStory = hasNewNuxStory;
    }

    public Long getRefreshWindowMs() {
        return refreshWindowMs;
    }

    public void setRefreshWindowMs(Long refreshWindowMs) {
        this.refreshWindowMs = refreshWindowMs;
    }

    public Long getResponseTimestamp() {
        return responseTimestamp;
    }

    public void setResponseTimestamp(Long responseTimestamp) {
        this.responseTimestamp = responseTimestamp;
    }
}
