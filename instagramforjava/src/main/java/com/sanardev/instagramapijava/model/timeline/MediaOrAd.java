package com.sanardev.instagramapijava.model.timeline;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.media.Caption;
import com.sanardev.instagramapijava.model.media.CarouselMedia;
import com.sanardev.instagramapijava.model.media.ImageVersions2;
import com.sanardev.instagramapijava.model.media.Location;
import com.sanardev.instagramapijava.model.media.PreviewComment;
import com.sanardev.instagramapijava.model.media.SharingFrictionInfo;
import com.sanardev.instagramapijava.model.media.Usertags;
import com.sanardev.instagramapijava.model.media.VideoVersion;
import com.sanardev.instagramapijava.model.user.ShortUserWithFriendShip;
import com.sanardev.instagramapijava.model.user.TinyUser;

import java.util.List;

public class MediaOrAd {

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
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("user")
    @Expose
    private ShortUserWithFriendShip user;
    @SerializedName("can_viewer_reshare")
    @Expose
    private boolean canViewerReshare;
    @SerializedName("caption_is_edited")
    @Expose
    private boolean captionIsEdited;
    @SerializedName("comment_likes_enabled")
    @Expose
    private boolean commentLikesEnabled;
    @SerializedName("comment_threading_enabled")
    @Expose
    private boolean commentThreadingEnabled;
    @SerializedName("hash_more_comments")
    @Expose
    private boolean hashMoreComments;
    @SerializedName("preview_comments")
    @Expose
    private List<PreviewComment> previewComments;
    @SerializedName("max_num_visible_preview_comments")
    @Expose
    private int maxNumVisiblePreviewComments;
    @SerializedName("can_view_more_preview_comments")
    @Expose
    private boolean canViewMorePreviewComments;
    @SerializedName("comment_count")
    @Expose
    private int commentCount;
    @SerializedName("like_count")
    @Expose
    private int likeCount;
    @SerializedName("inline_composer_display_condition")
    @Expose
    private String inlineComposerDisplayCondition;
    @SerializedName("inline_composer_imp_trigger_time")
    @Expose
    private int inlineComposerImpTriggerTime;
    @SerializedName("has_liked")
    @Expose
    private boolean hasLiked;
    @SerializedName("top_likers")
    @Expose
    private List<String> topLikers;
    @SerializedName("facepile_top_likers")
    @Expose
    private List<TinyUser> facepileTopLikers;
    @SerializedName("photo_of_you")
    @Expose
    private boolean photoOfYou;
    @SerializedName("usertags")
    @Expose
    private Usertags usertags;
    @SerializedName("can_viewer_save")
    @Expose
    private boolean canViewerSave;
    @SerializedName("organic_tracking_token")
    @Expose
    private String organicTrackingToken;
    @SerializedName("is_in_profile_grid")
    @Expose
    private boolean isInProfileGrid;
    @SerializedName("profile_grid_control_enabled")
    @Expose
    private boolean profileGridControlEnabled;
    @SerializedName("caption")
    @Expose
    private Caption caption;
    @SerializedName("parent_comment_id")
    @Expose
    private long parentCommentId;
    @SerializedName("can_see_insights_as_brand")
    @Expose
    private boolean canSeeInsightsAsBrand;
    @SerializedName("should_request_ads")
    @Expose
    private boolean shouldRequestAds;
    @SerializedName("has_more_comments")
    @Expose
    private boolean hasMoreComments;
    @SerializedName("sharing_friction_info")
    @Expose
    private SharingFrictionInfo sharingFrictionInfo;
    @SerializedName("deleted_reason")
    @Expose
    private Long deletedReason;
    @SerializedName("main_feed_carousel_starting_media_id")
    @Expose
    private String mainFeedCarouselStartingMediaId;
    @SerializedName("main_feed_carousel_has_unseen_cover_media")
    @Expose
    private boolean mainFeedCarouselHasUnseenCoverMedia;
    @SerializedName("inventory_source")
    @Expose
    private String inventorySource;
    @SerializedName("is_seen")
    @Expose
    private boolean isSeen;
    @SerializedName("is_eof")
    @Expose
    private boolean isEof;


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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public ShortUserWithFriendShip getUser() {
        return user;
    }

    public void setUser(ShortUserWithFriendShip user) {
        this.user = user;
    }

    public boolean isCanViewerReshare() {
        return canViewerReshare;
    }

    public void setCanViewerReshare(boolean canViewerReshare) {
        this.canViewerReshare = canViewerReshare;
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

    public boolean isHashMoreComments() {
        return hashMoreComments;
    }

    public void setHashMoreComments(boolean hashMoreComments) {
        this.hashMoreComments = hashMoreComments;
    }

    public List<PreviewComment> getPreviewComments() {
        return previewComments;
    }

    public void setPreviewComments(List<PreviewComment> previewComments) {
        this.previewComments = previewComments;
    }

    public int getMaxNumVisiblePreviewComments() {
        return maxNumVisiblePreviewComments;
    }

    public void setMaxNumVisiblePreviewComments(int maxNumVisiblePreviewComments) {
        this.maxNumVisiblePreviewComments = maxNumVisiblePreviewComments;
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

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String getInlineComposerDisplayCondition() {
        return inlineComposerDisplayCondition;
    }

    public void setInlineComposerDisplayCondition(String inlineComposerDisplayCondition) {
        this.inlineComposerDisplayCondition = inlineComposerDisplayCondition;
    }

    public int getInlineComposerImpTriggerTime() {
        return inlineComposerImpTriggerTime;
    }

    public void setInlineComposerImpTriggerTime(int inlineComposerImpTriggerTime) {
        this.inlineComposerImpTriggerTime = inlineComposerImpTriggerTime;
    }

    public boolean isHasLiked() {
        return hasLiked;
    }

    public void setHasLiked(boolean hasLiked) {
        this.hasLiked = hasLiked;
    }

    public List<String> getTopLikers() {
        return topLikers;
    }

    public void setTopLikers(List<String> topLikers) {
        this.topLikers = topLikers;
    }

    public List<TinyUser> getFacepileTopLikers() {
        return facepileTopLikers;
    }

    public void setFacepileTopLikers(List<TinyUser> facepileTopLikers) {
        this.facepileTopLikers = facepileTopLikers;
    }

    public boolean isPhotoOfYou() {
        return photoOfYou;
    }

    public void setPhotoOfYou(boolean photoOfYou) {
        this.photoOfYou = photoOfYou;
    }

    public Usertags getUsertags() {
        return usertags;
    }

    public void setUsertags(Usertags usertags) {
        this.usertags = usertags;
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

    public boolean isInProfileGrid() {
        return isInProfileGrid;
    }

    public void setInProfileGrid(boolean inProfileGrid) {
        isInProfileGrid = inProfileGrid;
    }

    public boolean isProfileGridControlEnabled() {
        return profileGridControlEnabled;
    }

    public void setProfileGridControlEnabled(boolean profileGridControlEnabled) {
        this.profileGridControlEnabled = profileGridControlEnabled;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public boolean isCanSeeInsightsAsBrand() {
        return canSeeInsightsAsBrand;
    }

    public void setCanSeeInsightsAsBrand(boolean canSeeInsightsAsBrand) {
        this.canSeeInsightsAsBrand = canSeeInsightsAsBrand;
    }

    public boolean isShouldRequestAds() {
        return shouldRequestAds;
    }

    public void setShouldRequestAds(boolean shouldRequestAds) {
        this.shouldRequestAds = shouldRequestAds;
    }

    public boolean isHasMoreComments() {
        return hasMoreComments;
    }

    public void setHasMoreComments(boolean hasMoreComments) {
        this.hasMoreComments = hasMoreComments;
    }

    public SharingFrictionInfo getSharingFrictionInfo() {
        return sharingFrictionInfo;
    }

    public void setSharingFrictionInfo(SharingFrictionInfo sharingFrictionInfo) {
        this.sharingFrictionInfo = sharingFrictionInfo;
    }

    public Long getDeletedReason() {
        return deletedReason;
    }

    public void setDeletedReason(Long deletedReason) {
        this.deletedReason = deletedReason;
    }

    public String getMainFeedCarouselStartingMediaId() {
        return mainFeedCarouselStartingMediaId;
    }

    public void setMainFeedCarouselStartingMediaId(String mainFeedCarouselStartingMediaId) {
        this.mainFeedCarouselStartingMediaId = mainFeedCarouselStartingMediaId;
    }

    public boolean isMainFeedCarouselHasUnseenCoverMedia() {
        return mainFeedCarouselHasUnseenCoverMedia;
    }

    public void setMainFeedCarouselHasUnseenCoverMedia(boolean mainFeedCarouselHasUnseenCoverMedia) {
        this.mainFeedCarouselHasUnseenCoverMedia = mainFeedCarouselHasUnseenCoverMedia;
    }

    public String getInventorySource() {
        return inventorySource;
    }

    public void setInventorySource(String inventorySource) {
        this.inventorySource = inventorySource;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    public boolean isEof() {
        return isEof;
    }

    public void setEof(boolean eof) {
        isEof = eof;
    }
}
