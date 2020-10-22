package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaData {

    @SerializedName("media")
    @Expose
    private VoiceMedia voiceMedia;
    @SerializedName("expiring_media_action_summary")
    @Expose
    private ExpiringMediaActionSummary expiringMediaActionSummary;
    @SerializedName("seen_user_ids")
    @Expose
    private List<Long> seenUserIds;
    @SerializedName("view_mode")
    @Expose
    private String viewMode;
    @SerializedName("seen_count")
    @Expose
    private int seenCount;
    @SerializedName("reply_expiring_at_us")
    @Expose
    private Object replyExpiringAtUs;

    public VoiceMedia getVoiceMedia() {
        return voiceMedia;
    }

    public void setVoiceMedia(VoiceMedia voiceMedia) {
        this.voiceMedia = voiceMedia;
    }

    public ExpiringMediaActionSummary getExpiringMediaActionSummary() {
        return expiringMediaActionSummary;
    }

    public void setExpiringMediaActionSummary(ExpiringMediaActionSummary expiringMediaActionSummary) {
        this.expiringMediaActionSummary = expiringMediaActionSummary;
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

    public Object getReplyExpiringAtUs() {
        return replyExpiringAtUs;
    }

    public void setReplyExpiringAtUs(Object replyExpiringAtUs) {
        this.replyExpiringAtUs = replyExpiringAtUs;
    }
}
