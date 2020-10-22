package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.media.Caption;
import com.sanardev.instagramapijava.model.media.CarouselMedia;
import com.sanardev.instagramapijava.model.media.ImageVersions2;
import com.sanardev.instagramapijava.model.media.Usertags;
import com.sanardev.instagramapijava.model.media.VideoVersion;

import java.util.List;

public class MediaShare {


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
    @SerializedName("carousel_media_count")
    @Expose
    private int carouselMediaCount;
    @SerializedName("carousel_media")
    @Expose
    private List<CarouselMedia> carouselMedias;
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
    private double videoDuration;
    @SerializedName("view_count")
    @Expose
    private Long viewCount;
    @SerializedName("user")
    @Expose
    private Object user;
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
    private Long maxNumVisiblePreviewComments;
    @SerializedName("can_view_more_preview_comments")
    @Expose
    private Boolean canViewMorePreviewComments;
    @SerializedName("comment_count")
    @Expose
    private Long commentCount;
    @SerializedName("like_count")
    @Expose
    private Long likeCount;
    @SerializedName("has_liked")
    @Expose
    private Boolean hasLiked;
    @SerializedName("photo_of_you")
    @Expose
    private Boolean photoOfYou;
    @SerializedName("usertags")
    @Expose
    private Usertags usertags;
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
    @SerializedName("carousel_share_child_media_id")
    @Expose
    private String carouselShareChildMediaId;

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

    public int getCarouselMediaCount() {
        return carouselMediaCount;
    }

    public void setCarouselMediaCount(int carouselMediaCount) {
        this.carouselMediaCount = carouselMediaCount;
    }

    public List<CarouselMedia> getCarouselMedias() {
        return carouselMedias;
    }

    public void setCarouselMedias(List<CarouselMedia> carouselMedias) {
        this.carouselMedias = carouselMedias;
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

    public double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
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

    public Long getMaxNumVisiblePreviewComments() {
        return maxNumVisiblePreviewComments;
    }

    public void setMaxNumVisiblePreviewComments(Long maxNumVisiblePreviewComments) {
        this.maxNumVisiblePreviewComments = maxNumVisiblePreviewComments;
    }

    public Boolean getCanViewMorePreviewComments() {
        return canViewMorePreviewComments;
    }

    public void setCanViewMorePreviewComments(Boolean canViewMorePreviewComments) {
        this.canViewMorePreviewComments = canViewMorePreviewComments;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Boolean getHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(Boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public Boolean getPhotoOfYou() {
        return photoOfYou;
    }

    public void setPhotoOfYou(Boolean photoOfYou) {
        this.photoOfYou = photoOfYou;
    }

    public Usertags getUsertags() {
        return usertags;
    }

    public void setUsertags(Usertags usertags) {
        this.usertags = usertags;
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

    public String getCarouselShareChildMediaId() {
        return carouselShareChildMediaId;
    }

    public void setCarouselShareChildMediaId(String carouselShareChildMediaId) {
        this.carouselShareChildMediaId = carouselShareChildMediaId;
    }
}
