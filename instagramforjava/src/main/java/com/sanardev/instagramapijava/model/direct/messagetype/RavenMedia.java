package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RavenMedia {

    @SerializedName("url_expire_at_secs")
    @Expose
    private Long urlExpireAtSecs;
    @SerializedName("playback_duration_secs")
    @Expose
    private int playbackDurationSecs;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("seen_user_ids")
    @Expose
    private List<Long> seenUserIds = null;
    @SerializedName("view_mode")
    @Expose
    private String viewMode;
    @SerializedName("seen_count")
    @Expose
    private int seenCount;
    @SerializedName("replay_expiring_at_us")
    @Expose
    private Object replayExpiringAtUs;

    public Long getUrlExpireAtSecs() {
        return urlExpireAtSecs;
    }

    public void setUrlExpireAtSecs(Long urlExpireAtSecs) {
        this.urlExpireAtSecs = urlExpireAtSecs;
    }

    public int getPlaybackDurationSecs() {
        return playbackDurationSecs;
    }

    public void setPlaybackDurationSecs(int playbackDurationSecs) {
        this.playbackDurationSecs = playbackDurationSecs;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public List<Long> getSeenUserIds() {
        return seenUserIds;
    }

    public void setSeenUserIds(List<Long> seenUserIds) {
        this.seenUserIds = seenUserIds;
    }

    public String getViewMode() {
        return viewMode;
    }

    public void setViewMode(String viewMode) {
        this.viewMode = viewMode;
    }

    public int getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    public Object getReplayExpiringAtUs() {
        return replayExpiringAtUs;
    }

    public void setReplayExpiringAtUs(Object replayExpiringAtUs) {
        this.replayExpiringAtUs = replayExpiringAtUs;
    }
}
