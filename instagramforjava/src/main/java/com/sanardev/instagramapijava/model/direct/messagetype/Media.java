package com.sanardev.instagramapijava.model.direct.messagetype;

import android.os.Bundle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.media.Caption;
import com.sanardev.instagramapijava.model.media.CarouselMedia;
import com.sanardev.instagramapijava.model.media.ImageVersions2;
import com.sanardev.instagramapijava.model.media.VideoVersion;

import java.util.HashMap;
import java.util.List;

public class Media {


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
    @SerializedName("video_versions")
    @Expose
    private List<VideoVersion> videoVersions;
    @SerializedName("carousel_media_count")
    @Expose
    private int carouselMediaCount;
    @SerializedName("carousel_media")
    @Expose
    private List<CarouselMedia> carouselMedias;
    @SerializedName("original_width")
    @Expose
    private int originalWidth;
    @SerializedName("original_height")
    @Expose
    private int originalHeight;
    @SerializedName("user")
    @Expose
    private UserReelShare user;
    @SerializedName("caption_is_edited")
    @Expose
    private boolean captionIsEdited;
    @SerializedName("comment_likes_enabled")
    @Expose
    private boolean commentLikesEnabled;
    @SerializedName("comment_threading_enabled")
    @Expose
    private boolean commentThreadingEnabled;
    @SerializedName("has_more_comments")
    @Expose
    private boolean hasMoreComments;
    @SerializedName("max_num_visible_preview_comments")
    @Expose
    private int maxNumVisiblePreviewComments;
    @SerializedName("preview_comments")
    @Expose
    private List<Object> previewComments = null;
    @SerializedName("can_view_more_preview_comments")
    @Expose
    private boolean canViewMorePreviewComments;
    @SerializedName("comment_count")
    @Expose
    private int commentCount;
    @SerializedName("caption_position")
    @Expose
    private int captionPosition;
    @SerializedName("is_reel_media")
    @Expose
    private boolean isReelMedia;
    @SerializedName("timezone_offset")
    @Expose
    private int timezoneOffset;
    @SerializedName("like_count")
    @Expose
    private int likeCount;
    @SerializedName("has_liked")
    @Expose
    private boolean hasLiked;
    @SerializedName("likers")
    @Expose
    private List<Object> likers;
    @SerializedName("photo_of_you")
    @Expose
    private boolean photoOfYou;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private boolean canSeeInsightsAsBrand;
    @SerializedName("caption")
    @Expose
    private Caption caption;
    @SerializedName("fb_user_tags")
    @Expose
    private FbUserTags fbUserTags;
    @SerializedName("can_viewer_save")
    @Expose
    private boolean canViewerSave;
    @SerializedName("organic_tracking_token")
    @Expose
    private String organicTrackingToken;
    @SerializedName("expiring_at")
    @Expose
    private long expiringAt;
    @SerializedName("story_is_saved_to_archive")
    @Expose
    private boolean storyIsSavedToArchive;
    private HashMap<Object,Object> bundle;

    public HashMap<Object, Object> getBundle() {
        return bundle;
    }

    public void setBundle(HashMap<Object, Object> bundle) {
        this.bundle = bundle;
    }

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

    public List<VideoVersion> getVideoVersions() {
        return videoVersions;
    }

    public void setVideoVersions(List<VideoVersion> videoVersions) {
        this.videoVersions = videoVersions;
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

    public UserReelShare getUser() {
        return user;
    }

    public void setUser(UserReelShare user) {
        this.user = user;
    }

    public boolean isCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public boolean isCommentLikesEnabled() {
        return commentLikesEnabled;
    }

    public void setCommentLikesEnabled(boolean commentLikesEnabled) {
        this.commentLikesEnabled = commentLikesEnabled;
    }

    public boolean isCommentThreadingEnabled() {
        return commentThreadingEnabled;
    }

    public void setCommentThreadingEnabled(boolean commentThreadingEnabled) {
        this.commentThreadingEnabled = commentThreadingEnabled;
    }

    public boolean isHasMoreComments() {
        return hasMoreComments;
    }

    public void setHasMoreComments(boolean hasMoreComments) {
        this.hasMoreComments = hasMoreComments;
    }

    public int getMaxNumVisiblePreviewComments() {
        return maxNumVisiblePreviewComments;
    }

    public void setMaxNumVisiblePreviewComments(int maxNumVisiblePreviewComments) {
        this.maxNumVisiblePreviewComments = maxNumVisiblePreviewComments;
    }

    public List<Object> getPreviewComments() {
        return previewComments;
    }

    public void setPreviewComments(List<Object> previewComments) {
        this.previewComments = previewComments;
    }

    public boolean isCanViewMorePreviewComments() {
        return canViewMorePreviewComments;
    }

    public void setCanViewMorePreviewComments(boolean canViewMorePreviewComments) {
        this.canViewMorePreviewComments = canViewMorePreviewComments;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getCaptionPosition() {
        return captionPosition;
    }

    public void setCaptionPosition(int captionPosition) {
        this.captionPosition = captionPosition;
    }

    public boolean isReelMedia() {
        return isReelMedia;
    }

    public void setReelMedia(boolean reelMedia) {
        isReelMedia = reelMedia;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public boolean isHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public List<Object> getLikers() {
        return likers;
    }

    public void setLikers(List<Object> likers) {
        this.likers = likers;
    }

    public boolean isPhotoOfYou() {
        return photoOfYou;
    }

    public void setPhotoOfYou(boolean photoOfYou) {
        this.photoOfYou = photoOfYou;
    }

    public boolean isCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public FbUserTags getFbUserTags() {
        return fbUserTags;
    }

    public void setFbUserTags(FbUserTags fbUserTags) {
        this.fbUserTags = fbUserTags;
    }

    public boolean isCanViewerSave() {
        return canViewerSave;
    }

    public void setCanViewerSave(boolean canViewerSave) {
        this.canViewerSave = canViewerSave;
    }

    public String getOrganicTrackingToken() {
        return organicTrackingToken;
    }

    public void setOrganicTrackingToken(String organicTrackingToken) {
        this.organicTrackingToken = organicTrackingToken;
    }

    public long getExpiringAt() {
        return expiringAt;
    }

    public void setExpiringAt(long expiringAt) {
        this.expiringAt = expiringAt;
    }

    public boolean isStoryIsSavedToArchive() {
        return storyIsSavedToArchive;
    }

    public void setStoryIsSavedToArchive(boolean storyIsSavedToArchive) {
        this.storyIsSavedToArchive = storyIsSavedToArchive;
    }
}
