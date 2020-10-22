package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.media.ImageVersions2;
import com.sanardev.instagramapijava.model.media.VideoVersion;

import java.util.List;

public class Story {



    @SerializedName("taken_at")
    @Expose
    private Long takenAt;
    @SerializedName("pk")
    @Expose
    private Long pk;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("device_timestamp")
    @Expose
    private Long deviceTimestamp;
    @SerializedName("media_type")
    @Expose
    private int mediaType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("client_cache_key")
    @Expose
    private String clientCacheKey;
    @SerializedName("filter_type")
    @Expose
    private Long filterType;
    @SerializedName("image_versions2")
    @Expose
    private ImageVersions2 imageVersions2;
    @SerializedName("original_width")
    @Expose
    private Long originalWidth;
    @SerializedName("original_height")
    @Expose
    private Long originalHeight;
    @SerializedName("is_dash_eligible")
    @Expose
    private Long isDashEligible;
    @SerializedName("video_dash_manifest")
    @Expose
    private String videoDashManifest;
    @SerializedName("video_codec")
    @Expose
    private String videoCodec;
    @SerializedName("number_of_qualities")
    @Expose
    private Long numberOfQualities;
    @SerializedName("video_versions")
    @Expose
    private List<VideoVersion> videoVersions = null;
    @SerializedName("has_audio")
    @Expose
    private Boolean hasAudio;
    @SerializedName("video_duration")
    @Expose
    private Double videoDuration;
    @SerializedName("user")
    @Expose
    private StoryUser user;
    @SerializedName("caption_is_edited")
    @Expose
    private Boolean captionIsEdited;
    @SerializedName("caption_position")
    @Expose
    private Double captionPosition;
    @SerializedName("is_reel_media")
    @Expose
    private Boolean isReelMedia;
    @SerializedName("photo_of_you")
    @Expose
    private Boolean photoOfYou;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private Boolean canSeeInsightsAsBrand;
    @SerializedName("caption")
    @Expose
    private Object caption;
    @SerializedName("can_viewer_save")
    @Expose
    private Boolean canViewerSave;
    @SerializedName("organic_tracking_token")
    @Expose
    private String organicTrackingToken;
    @SerializedName("expiring_at")
    @Expose
    private Long expiringAt;
    @SerializedName("imported_taken_at")
    @Expose
    private Long importedTakenAt;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo sharingFrictionInfo;
    @SerializedName("is_in_profile_grid")
    @Expose
    private Boolean isInProfileGrid;
    @SerializedName("profile_grid_control_enabled")
    @Expose
    private Boolean profileGridControlEnabled;
    @SerializedName("deleted_reason")
    @Expose
    private Long deletedReason;
    @SerializedName("can_reshare")
    @Expose
    private Boolean canReshare;
    @SerializedName("can_reply")
    @Expose
    private Boolean canReply;
    @SerializedName("creative_config")
    @Expose
    private CreativeConfig creativeConfig;
    @SerializedName("supports_reel_reactions")
    @Expose
    private Boolean supportsReelReactions;
    @SerializedName("can_send_custom_emojis")
    @Expose
    private Boolean canSendCustomEmojis;
    @SerializedName("show_one_tap_fb_share_tooltip")
    @Expose
    private Boolean showOneTapFbShareTooltip;

    public Long getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Long takenAt) {
        this.takenAt = takenAt;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getDeviceTimestamp() {
        return deviceTimestamp;
    }

    public void setDeviceTimestamp(Long deviceTimestamp) {
        this.deviceTimestamp = deviceTimestamp;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClientCacheKey() {
        return clientCacheKey;
    }

    public void setClientCacheKey(String clientCacheKey) {
        this.clientCacheKey = clientCacheKey;
    }

    public Long getFilterType() {
        return filterType;
    }

    public void setFilterType(Long filterType) {
        this.filterType = filterType;
    }

    public ImageVersions2 getImageVersions2() {
        return imageVersions2;
    }

    public void setImageVersions2(ImageVersions2 imageVersions2) {
        this.imageVersions2 = imageVersions2;
    }

    public Long getOriginalWidth() {
        return originalWidth;
    }

    public void setOriginalWidth(Long originalWidth) {
        this.originalWidth = originalWidth;
    }

    public Long getOriginalHeight() {
        return originalHeight;
    }

    public void setOriginalHeight(Long originalHeight) {
        this.originalHeight = originalHeight;
    }

    public Long getIsDashEligible() {
        return isDashEligible;
    }

    public void setIsDashEligible(Long isDashEligible) {
        this.isDashEligible = isDashEligible;
    }

    public String getVideoDashManifest() {
        return videoDashManifest;
    }

    public void setVideoDashManifest(String videoDashManifest) {
        this.videoDashManifest = videoDashManifest;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public Long getNumberOfQualities() {
        return numberOfQualities;
    }

    public void setNumberOfQualities(Long numberOfQualities) {
        this.numberOfQualities = numberOfQualities;
    }

    public List<VideoVersion> getVideoVersions() {
        return videoVersions;
    }

    public void setVideoVersions(List<VideoVersion> videoVersions) {
        this.videoVersions = videoVersions;
    }

    public Boolean getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public Double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public StoryUser getUser() {
        return user;
    }

    public void setUser(StoryUser user) {
        this.user = user;
    }

    public Boolean getCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(Boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public Double getCaptionPosition() {
        return captionPosition;
    }

    public void setCaptionPosition(Double captionPosition) {
        this.captionPosition = captionPosition;
    }

    public Boolean getReelMedia() {
        return isReelMedia;
    }

    public void setReelMedia(Boolean reelMedia) {
        isReelMedia = reelMedia;
    }

    public Boolean getPhotoOfYou() {
        return photoOfYou;
    }

    public void setPhotoOfYou(Boolean photoOfYou) {
        this.photoOfYou = photoOfYou;
    }

    public Boolean getCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(Boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public Object getCaption() {
        return caption;
    }

    public void setCaption(Object caption) {
        this.caption = caption;
    }

    public Boolean getCanViewerSave() {
        return canViewerSave;
    }

    public void setCanViewerSave(Boolean canViewerSave) {
        this.canViewerSave = canViewerSave;
    }

    public String getOrganicTrackingToken() {
        return organicTrackingToken;
    }

    public void setOrganicTrackingToken(String organicTrackingToken) {
        this.organicTrackingToken = organicTrackingToken;
    }

    public Long getExpiringAt() {
        return expiringAt;
    }

    public void setExpiringAt(Long expiringAt) {
        this.expiringAt = expiringAt;
    }

    public Long getImportedTakenAt() {
        return importedTakenAt;
    }

    public void setImportedTakenAt(Long importedTakenAt) {
        this.importedTakenAt = importedTakenAt;
    }

    public SharingFrictionInfo getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public Boolean getInProfileGrid() {
        return isInProfileGrid;
    }

    public void setInProfileGrid(Boolean inProfileGrid) {
        isInProfileGrid = inProfileGrid;
    }

    public Boolean getProfileGridControlEnabled() {
        return profileGridControlEnabled;
    }

    public void setProfileGridControlEnabled(Boolean profileGridControlEnabled) {
        this.profileGridControlEnabled = profileGridControlEnabled;
    }

    public Long getDeletedReason() {
        return deletedReason;
    }

    public void setDeletedReason(Long deletedReason) {
        this.deletedReason = deletedReason;
    }

    public Boolean getCanReshare() {
        return canReshare;
    }

    public void setCanReshare(Boolean canReshare) {
        this.canReshare = canReshare;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public CreativeConfig getCreativeConfig() {
        return creativeConfig;
    }

    public void setCreativeConfig(CreativeConfig creativeConfig) {
        this.creativeConfig = creativeConfig;
    }

    public Boolean getSupportsReelReactions() {
        return supportsReelReactions;
    }

    public void setSupportsReelReactions(Boolean supportsReelReactions) {
        this.supportsReelReactions = supportsReelReactions;
    }

    public Boolean getCanSendCustomEmojis() {
        return canSendCustomEmojis;
    }

    public void setCanSendCustomEmojis(Boolean canSendCustomEmojis) {
        this.canSendCustomEmojis = canSendCustomEmojis;
    }

    public Boolean getShowOneTapFbShareTooltip() {
        return showOneTapFbShareTooltip;
    }

    public void setShowOneTapFbShareTooltip(Boolean showOneTapFbShareTooltip) {
        this.showOneTapFbShareTooltip = showOneTapFbShareTooltip;
    }
}
