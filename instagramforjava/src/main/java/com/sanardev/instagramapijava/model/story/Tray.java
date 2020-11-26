package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class Tray {


    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("latest_reel_media")
    @Expose
    private Long latestReelMedia;
    @SerializedName("expiring_at")
    @Expose
    private Long expiringAt;
    @SerializedName("seen")
    @Expose
    private Long seen;
    @SerializedName("can_reply")
    @Expose
    private Boolean canReply;
    @SerializedName("can_gif_quick_reply")
    @Expose
    private Boolean canGifQuickReply;
    @SerializedName("can_reshare")
    @Expose
    private Boolean canReshare;
    @SerializedName("reel_type")
    @Expose
    private String reelType;
    @SerializedName("is_sensitive_vertical_ad")
    @Expose
    private Boolean isSensitiveVerticalAd;
    @SerializedName("user")
    @Expose
    private UserTray user;
    @SerializedName("ranked_position")
    @Expose
    private Long rankedPosition;
    @SerializedName("seen_ranked_position")
    @Expose
    private Long seenRankedPosition;
    @SerializedName("muted")
    @Expose
    private Boolean muted;
    @SerializedName("prefetch_count")
    @Expose
    private Long prefetchCount;
    @SerializedName("has_besties_media")
    @Expose
    private Boolean hasBestiesMedia;
    @SerializedName("latest_besties_reel_media")
    @Expose
    private Double latestBestiesReelMedia;
    @SerializedName("media_count")
    @Expose
    private Long mediaCount;
    @SerializedName("media_ids")
    @Expose
    private List<Long> mediaIds = null;
    @SerializedName("has_pride_media")
    @Expose
    private Boolean hasPrideMedia;
    @SerializedName("items")
    @Expose
    private List<Story> items = null;
    private HashMap<Object,Object> bundle = new HashMap<>();

    public HashMap<Object, Object> getBundle() {
        return bundle;
    }

    public void setBundle(HashMap<Object, Object> bundle) {
        this.bundle = bundle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLatestReelMedia() {
        return latestReelMedia;
    }

    public void setLatestReelMedia(Long latestReelMedia) {
        this.latestReelMedia = latestReelMedia;
    }

    public Long getExpiringAt() {
        return expiringAt;
    }

    public void setExpiringAt(Long expiringAt) {
        this.expiringAt = expiringAt;
    }

    public Long getSeen() {
        return seen;
    }

    public void setSeen(Long seen) {
        this.seen = seen;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public Boolean getCanGifQuickReply() {
        return canGifQuickReply;
    }

    public void setCanGifQuickReply(Boolean canGifQuickReply) {
        this.canGifQuickReply = canGifQuickReply;
    }

    public Boolean getCanReshare() {
        return canReshare;
    }

    public void setCanReshare(Boolean canReshare) {
        this.canReshare = canReshare;
    }

    public String getReelType() {
        return reelType;
    }

    public void setReelType(String reelType) {
        this.reelType = reelType;
    }

    public Boolean getSensitiveVerticalAd() {
        return isSensitiveVerticalAd;
    }

    public void setSensitiveVerticalAd(Boolean sensitiveVerticalAd) {
        isSensitiveVerticalAd = sensitiveVerticalAd;
    }

    public UserTray getUser() {
        return user;
    }

    public void setUser(UserTray user) {
        this.user = user;
    }

    public Long getRankedPosition() {
        return rankedPosition;
    }

    public void setRankedPosition(Long rankedPosition) {
        this.rankedPosition = rankedPosition;
    }

    public Long getSeenRankedPosition() {
        return seenRankedPosition;
    }

    public void setSeenRankedPosition(Long seenRankedPosition) {
        this.seenRankedPosition = seenRankedPosition;
    }

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public Long getPrefetchCount() {
        return prefetchCount;
    }

    public void setPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    public Boolean getHasBestiesMedia() {
        return hasBestiesMedia;
    }

    public void setHasBestiesMedia(Boolean hasBestiesMedia) {
        this.hasBestiesMedia = hasBestiesMedia;
    }

    public Double getLatestBestiesReelMedia() {
        return latestBestiesReelMedia;
    }

    public void setLatestBestiesReelMedia(Double latestBestiesReelMedia) {
        this.latestBestiesReelMedia = latestBestiesReelMedia;
    }

    public Long getMediaCount() {
        return mediaCount;
    }

    public void setMediaCount(Long mediaCount) {
        this.mediaCount = mediaCount;
    }

    public List<Long> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<Long> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public Boolean getHasPrideMedia() {
        return hasPrideMedia;
    }

    public void setHasPrideMedia(Boolean hasPrideMedia) {
        this.hasPrideMedia = hasPrideMedia;
    }

    public List<Story> getItems() {
        return items;
    }

    public void setItems(List<Story> items) {
        this.items = items;
    }
}
