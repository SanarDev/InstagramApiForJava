package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User  extends TinyUser{

    @SerializedName("has_anonymous_profile_picture")
    private boolean hasAnonymousProfilePicture;
    @SerializedName("biography")
    private String biography;
    @SerializedName("can_link_entities_in_bio")
    private boolean canLinkEntitiesInBio;
    @SerializedName("biography_with_entities")
    private BiographyWithEntities biographyWithEntities;
    @SerializedName("external_url")
    private String externalUrl;
    @SerializedName("can_boost_post")
    @Expose
    private boolean canBoostPost;
    @SerializedName("can_see_organic_insights")
    @Expose
    private boolean canSeeOrganicInsights;
    @SerializedName("show_insights_terms")
    @Expose
    private boolean showInsightsTerms;
    @SerializedName("hd_profile_pic_versions")
    @Expose
    private List<HdProfilePicVersion> hdProfilePicVersions;
    @SerializedName("hd_profile_pic_url_info")
    @Expose
    private HdProfilePicUrlInfo hdProfilePicUrlInfo;
    @SerializedName("show_conversion_edit_entry")
    @Expose
    private boolean showConversionEditEntry;
    @SerializedName("allowed_commenter_type")
    @Expose
    private String allowedCommenterType;
    @SerializedName("account_badges")
    @Expose
    private List<Object> accountBadges = null;

    public boolean isHasAnonymousProfilePicture() {
        return hasAnonymousProfilePicture;
    }

    public void setHasAnonymousProfilePicture(boolean hasAnonymousProfilePicture) {
        this.hasAnonymousProfilePicture = hasAnonymousProfilePicture;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public boolean isCanLinkEntitiesInBio() {
        return canLinkEntitiesInBio;
    }

    public void setCanLinkEntitiesInBio(boolean canLinkEntitiesInBio) {
        this.canLinkEntitiesInBio = canLinkEntitiesInBio;
    }

    public BiographyWithEntities getBiographyWithEntities() {
        return biographyWithEntities;
    }

    public void setBiographyWithEntities(BiographyWithEntities biographyWithEntities) {
        this.biographyWithEntities = biographyWithEntities;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
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

    public List<HdProfilePicVersion> getHdProfilePicVersions() {
        return hdProfilePicVersions;
    }

    public void setHdProfilePicVersions(List<HdProfilePicVersion> hdProfilePicVersions) {
        this.hdProfilePicVersions = hdProfilePicVersions;
    }

    public HdProfilePicUrlInfo getHdProfilePicUrlInfo() {
        return hdProfilePicUrlInfo;
    }

    public void setHdProfilePicUrlInfo(HdProfilePicUrlInfo hdProfilePicUrlInfo) {
        this.hdProfilePicUrlInfo = hdProfilePicUrlInfo;
    }

    public boolean isShowConversionEditEntry() {
        return showConversionEditEntry;
    }

    public void setShowConversionEditEntry(boolean showConversionEditEntry) {
        this.showConversionEditEntry = showConversionEditEntry;
    }

    public String getAllowedCommenterType() {
        return allowedCommenterType;
    }

    public void setAllowedCommenterType(String allowedCommenterType) {
        this.allowedCommenterType = allowedCommenterType;
    }

    public List<Object> getAccountBadges() {
        return accountBadges;
    }

    public void setAccountBadges(List<Object> accountBadges) {
        this.accountBadges = accountBadges;
    }
}
