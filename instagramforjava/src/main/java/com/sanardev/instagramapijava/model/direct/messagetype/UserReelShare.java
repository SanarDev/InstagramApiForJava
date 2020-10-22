package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserReelShare {


    @SerializedName("pk")
    @Expose
    private long pk;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("is_private")
    @Expose
    private boolean isPrivate;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_pic_id")
    @Expose
    private String profilePicId;
    @SerializedName("has_anonymous_profile_picture")
    @Expose
    private boolean hasAnonymousProfilePicture;
    @SerializedName("can_boost_post")
    @Expose
    private boolean canBoostPost;
    @SerializedName("can_see_organic_insights")
    @Expose
    private boolean canSeeOrganicInsights;
    @SerializedName("show_insights_terms")
    @Expose
    private boolean showInsightsTerms;
    @SerializedName("reel_auto_archive")
    @Expose
    private String reelAutoArchive;
    @SerializedName("is_unpublished")
    @Expose
    private boolean isUnpublished;
    @SerializedName("allowed_commenter_type")
    @Expose
    private String allowedCommenterType;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfilePicId() {
        return profilePicId;
    }

    public void setProfilePicId(String profilePicId) {
        this.profilePicId = profilePicId;
    }

    public boolean isHasAnonymousProfilePicture() {
        return hasAnonymousProfilePicture;
    }

    public void setHasAnonymousProfilePicture(boolean hasAnonymousProfilePicture) {
        this.hasAnonymousProfilePicture = hasAnonymousProfilePicture;
    }

    public boolean isCanBoostPost() {
        return canBoostPost;
    }

    public void setCanBoostPost(boolean canBoostPost) {
        this.canBoostPost = canBoostPost;
    }

    public boolean isCanSeeOrganicInsights() {
        return canSeeOrganicInsights;
    }

    public void setCanSeeOrganicInsights(boolean canSeeOrganicInsights) {
        this.canSeeOrganicInsights = canSeeOrganicInsights;
    }

    public boolean isShowInsightsTerms() {
        return showInsightsTerms;
    }

    public void setShowInsightsTerms(boolean showInsightsTerms) {
        this.showInsightsTerms = showInsightsTerms;
    }

    public String getReelAutoArchive() {
        return reelAutoArchive;
    }

    public void setReelAutoArchive(String reelAutoArchive) {
        this.reelAutoArchive = reelAutoArchive;
    }

    public boolean isUnpublished() {
        return isUnpublished;
    }

    public void setUnpublished(boolean unpublished) {
        isUnpublished = unpublished;
    }

    public String getAllowedCommenterType() {
        return allowedCommenterType;
    }

    public void setAllowedCommenterType(String allowedCommenterType) {
        this.allowedCommenterType = allowedCommenterType;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }
}
