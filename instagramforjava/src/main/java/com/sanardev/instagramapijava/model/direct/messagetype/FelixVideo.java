package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.media.Caption;
import com.sanardev.instagramapijava.model.media.ImageVersions2;
import com.sanardev.instagramapijava.model.media.PreviewComment;
import com.sanardev.instagramapijava.model.media.VideoVersion;
import com.sanardev.instagramapijava.model.user.TinyUser;
import com.sanardev.instagramapijava.model.user.User;

import java.util.List;

public class FelixVideo {

    @SerializedName("taken_at")
    @Expose
    private long takenAt;
    @SerializedName("pk")
    @Expose
    private long pk;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("device_timestamp")
    @Expose
    private long deviceTimestamp;
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
    private int filterType;
    @SerializedName("image_versions2")
    @Expose
    private ImageVersions2 imageVersions2;
    @SerializedName("original_width")
    @Expose
    private int originalWidth;
    @SerializedName("original_height")
    @Expose
    private int originalHeight;
    @SerializedName("is_dash_eligible")
    @Expose
    private int isDashEligible;
    @SerializedName("video_dash_manifest")
    @Expose
    private String videoDashManifest;
    @SerializedName("video_codec")
    @Expose
    private String videoCodec;
    @SerializedName("number_of_qualities")
    @Expose
    private int numberOfQualities;
    @SerializedName("video_versions")
    @Expose
    private List<VideoVersion> videoVersions;
    @SerializedName("has_audio")
    @Expose
    private Boolean hasAudio;
    @SerializedName("video_duration")
    @Expose
    private double videoDuration;
    @SerializedName("view_count")
    @Expose
    private int viewCount;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("can_viewer_reshare")
    @Expose
    private Boolean canViewerReshare;
    @SerializedName("caption_is_edited")
    @Expose
    private Boolean captionIsEdited;
    @SerializedName("comment_likes_enabled")
    @Expose
    private Boolean commentLikesEnabled;
    @SerializedName("comment_threading_enabled")
    @Expose
    private Boolean commentThreadingEnabled;
    @SerializedName("has_more_comments")
    @Expose
    private Boolean hasMoreComments;
    @SerializedName("max_num_visible_preview_comments")
    @Expose
    private int maxNumVisiblePreviewComments;
    @SerializedName("preview_comments")
    @Expose
    private List<PreviewComment> previewComments;
    @SerializedName("can_view_more_preview_comments")
    @Expose
    private Boolean canViewMorePreviewComments;
    @SerializedName("comment_count")
    @Expose
    private int commentCount;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("nearly_complete_copyright_match")
    @Expose
    private Boolean nearlyCompleteCopyrightMatch;
    @SerializedName("media_cropping_info")
    @Expose
    private Object mediaCroppingInfo;
    @SerializedName("thumbnails")
    @Expose
    private Thumbnails thumbnails;
    @SerializedName("is_post_live")
    @Expose
    private Boolean isPostLive;
    @SerializedName("like_count")
    @Expose
    private int likeCount;
    @SerializedName("has_liked")
    @Expose
    private Boolean hasLiked;
    @SerializedName("likers")
    @Expose
    private List<TinyUser> likers;
    @SerializedName("photo_of_you")
    @Expose
    private Boolean photoOfYou;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private Boolean canSeeInsightsAsBrand;
    @SerializedName("caption")
    @Expose
    private Caption caption;
    @SerializedName("can_viewer_save")
    @Expose
    private Boolean canViewerSave;
    @SerializedName("organic_tracking_token")
    @Expose
    private String organicTrackingToken;

    public long getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(long takenAt) {
        this.takenAt = takenAt;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDeviceTimestamp() {
        return deviceTimestamp;
    }

    public void setDeviceTimestamp(long deviceTimestamp) {
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

    public int getFilterType() {
        return filterType;
    }

    public void setFilterType(int filterType) {
        this.filterType = filterType;
    }

    public ImageVersions2 getImageVersions2() {
        return imageVersions2;
    }

    public void setImageVersions2(ImageVersions2 imageVersions2) {
        this.imageVersions2 = imageVersions2;
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

    public int getIsDashEligible() {
        return isDashEligible;
    }

    public void setIsDashEligible(int isDashEligible) {
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

    public int getNumberOfQualities() {
        return numberOfQualities;
    }

    public void setNumberOfQualities(int numberOfQualities) {
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

    public double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getCanViewerReshare() {
        return canViewerReshare;
    }

    public void setCanViewerReshare(Boolean canViewerReshare) {
        this.canViewerReshare = canViewerReshare;
    }

    public Boolean getCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(Boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public Boolean getCommentLikesEnabled() {
        return commentLikesEnabled;
    }

    public void setCommentLikesEnabled(Boolean commentLikesEnabled) {
        this.commentLikesEnabled = commentLikesEnabled;
    }

    public Boolean getCommentThreadingEnabled() {
        return commentThreadingEnabled;
    }

    public void setCommentThreadingEnabled(Boolean commentThreadingEnabled) {
        this.commentThreadingEnabled = commentThreadingEnabled;
    }

    public Boolean getHasMoreComments() {
        return hasMoreComments;
    }

    public void setHasMoreComments(Boolean hasMoreComments) {
        this.hasMoreComments = hasMoreComments;
    }

    public int getMaxNumVisiblePreviewComments() {
        return maxNumVisiblePreviewComments;
    }

    public void setMaxNumVisiblePreviewComments(int maxNumVisiblePreviewComments) {
        this.maxNumVisiblePreviewComments = maxNumVisiblePreviewComments;
    }

    public List<PreviewComment> getPreviewComments() {
        return previewComments;
    }

    public void setPreviewComments(List<PreviewComment> previewComments) {
        this.previewComments = previewComments;
    }

    public Boolean getCanViewMorePreviewComments() {
        return canViewMorePreviewComments;
    }

    public void setCanViewMorePreviewComments(Boolean canViewMorePreviewComments) {
        this.canViewMorePreviewComments = canViewMorePreviewComments;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Boolean getNearlyCompleteCopyrightMatch() {
        return nearlyCompleteCopyrightMatch;
    }

    public void setNearlyCompleteCopyrightMatch(Boolean nearlyCompleteCopyrightMatch) {
        this.nearlyCompleteCopyrightMatch = nearlyCompleteCopyrightMatch;
    }

    public Object getMediaCroppingInfo() {
        return mediaCroppingInfo;
    }

    public void setMediaCroppingInfo(Object mediaCroppingInfo) {
        this.mediaCroppingInfo = mediaCroppingInfo;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    public Boolean getPostLive() {
        return isPostLive;
    }

    public void setPostLive(Boolean postLive) {
        isPostLive = postLive;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public Boolean getHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(Boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public List<TinyUser> getLikers() {
        return likers;
    }

    public void setLikers(List<TinyUser> likers) {
        this.likers = likers;
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

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
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
}
