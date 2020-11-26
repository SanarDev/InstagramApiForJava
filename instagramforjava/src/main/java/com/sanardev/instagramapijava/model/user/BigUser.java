package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BigUser {

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
    @SerializedName("is_verified")
    @Expose
    private boolean isVerified;
    @SerializedName("has_anonymous_profile_picture")
    @Expose
    private boolean hasAnonymousProfilePicture;
    @SerializedName("media_count")
    @Expose
    private Integer mediaCount;
    @SerializedName("geo_media_count")
    @Expose
    private Integer geoMediaCount;
    @SerializedName("follower_count")
    @Expose
    private Integer followerCount;
    @SerializedName("following_count")
    @Expose
    private Integer followingCount;
    @SerializedName("following_tag_count")
    @Expose
    private Integer followingTagCount;
    @SerializedName("biography")
    @Expose
    private String biography;
    @SerializedName("can_link_entities_in_bio")
    @Expose
    private boolean canLinkEntitiesInBio;
    @SerializedName("biography_with_entities")
    @Expose
    private BiographyWithEntities biographyWithEntities;
    @SerializedName("external_url")
    @Expose
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
    @SerializedName("can_convert_to_business")
    @Expose
    private boolean canConvertToBusiness;
    @SerializedName("can_create_sponsor_tags")
    @Expose
    private boolean canCreateSponsorTags;
    @SerializedName("is_allowed_to_create_standalone_personal_fundraisers")
    @Expose
    private boolean isAllowedToCreateStandalonePersonalFundraisers;
    @SerializedName("can_create_new_standalone_personal_fundraiser")
    @Expose
    private boolean canCreateNewStandalonePersonalFundraiser;
    @SerializedName("can_be_tagged_as_sponsor")
    @Expose
    private boolean canBeTaggedAsSponsor;
    @SerializedName("can_see_support_inbox")
    @Expose
    private boolean canSeeSupportInbox;
    @SerializedName("can_see_support_inbox_v1")
    @Expose
    private boolean canSeeSupportInboxV1;
    @SerializedName("total_igtv_videos")
    @Expose
    private Integer totalIgtvVideos;
    @SerializedName("total_clips_count")
    @Expose
    private Integer totalClipsCount;
    @SerializedName("total_ar_effects")
    @Expose
    private Integer totalArEffects;
    @SerializedName("reel_auto_archive")
    @Expose
    private String reelAutoArchive;
    @SerializedName("is_profile_action_needed")
    @Expose
    private boolean isProfileActionNeeded;
    @SerializedName("usertags_count")
    @Expose
    private Integer usertagsCount;
    @SerializedName("usertag_review_enabled")
    @Expose
    private boolean usertagReviewEnabled;
    @SerializedName("is_needy")
    @Expose
    private boolean isNeedy;
    @SerializedName("is_interest_account")
    @Expose
    private boolean isInterestAccount;
    @SerializedName("has_chaining")
    @Expose
    private boolean hasChaining;
    @SerializedName("hd_profile_pic_versions")
    @Expose
    private List<HdProfilePicVersion> hdProfilePicVersions = null;
    @SerializedName("hd_profile_pic_url_info")
    @Expose
    private HdProfilePicUrlInfo hdProfilePicUrlInfo;
    @SerializedName("has_placed_orders")
    @Expose
    private boolean hasPlacedOrders;
    @SerializedName("can_tag_products_from_merchants")
    @Expose
    private boolean canTagProductsFromMerchants;
    @SerializedName("fbpay_experience_enabled")
    @Expose
    private boolean fbpayExperienceEnabled;
    @SerializedName("show_conversion_edit_entry")
    @Expose
    private boolean showConversionEditEntry;
    @SerializedName("aggregate_promote_engagement")
    @Expose
    private boolean aggregatePromoteEngagement;
    @SerializedName("allowed_commenter_type")
    @Expose
    private String allowedCommenterType;
    @SerializedName("is_video_creator")
    @Expose
    private boolean isVideoCreator;
    @SerializedName("has_profile_video_feed")
    @Expose
    private boolean hasProfileVideoFeed;
    @SerializedName("has_highlight_reels")
    @Expose
    private boolean hasHighlightReels;
    @SerializedName("is_eligible_to_show_fb_cross_sharing_nux")
    @Expose
    private boolean isEligibleToShowFbCrossSharingNux;
    @SerializedName("page_id_for_new_suma_biz_account")
    @Expose
    private Object pageIdForNewSumaBizAccount;
    @SerializedName("eligible_shopping_signup_entrypoints")
    @Expose
    private List<Object> eligibleShoppingSignupEntrypoints = null;
    @SerializedName("can_be_reported_as_fraud")
    @Expose
    private boolean canBeReportedAsFraud;
    @SerializedName("is_business")
    @Expose
    private boolean isBusiness;
    @SerializedName("account_type")
    @Expose
    private Integer accountType;
    @SerializedName("professional_conversion_suggested_account_type")
    @Expose
    private Integer professionalConversionSuggestedAccountType;
    @SerializedName("is_call_to_action_enabled")
    @Expose
    private Object isCallToActionEnabled;
    @SerializedName("linked_fb_info")
    @Expose
    private LinkedFbInfo linkedFbInfo;
    @SerializedName("can_see_primary_country_in_settings")
    @Expose
    private boolean canSeePrimaryCountryInSettings;
    @SerializedName("personal_account_ads_page_name")
    @Expose
    private Object personalAccountAdsPageName;
    @SerializedName("personal_account_ads_page_id")
    @Expose
    private Object personalAccountAdsPageId;
    @SerializedName("account_badges")
    @Expose
    private List<Object> accountBadges = null;
    @SerializedName("include_direct_blacklist_status")
    @Expose
    private boolean includeDirectBlacklistStatus;
    @SerializedName("can_follow_hashtag")
    @Expose
    private boolean canFollowHashtag;
    @SerializedName("is_potential_business")
    @Expose
    private boolean isPotentialBusiness;
    @SerializedName("show_post_insights_entry_point")
    @Expose
    private boolean showPostInsightsEntryPoint;
    @SerializedName("feed_post_reshare_disabled")
    @Expose
    private boolean feedPostReshareDisabled;
    @SerializedName("besties_count")
    @Expose
    private Integer bestiesCount;
    @SerializedName("show_besties_badge")
    @Expose
    private boolean showBestiesBadge;
    @SerializedName("recently_bestied_by_count")
    @Expose
    private Integer recentlyBestiedByCount;
    @SerializedName("nametag")
    @Expose
    private Nametag nametag;
    @SerializedName("existing_user_age_collection_enabled")
    @Expose
    private boolean existingUserAgeCollectionEnabled;
    @SerializedName("about_your_account_bloks_entrypoint_enabled")
    @Expose
    private boolean aboutYourAccountBloksEntrypointEnabled;
    @SerializedName("auto_expand_chaining")
    @Expose
    private boolean autoExpandChaining;
    @SerializedName("highlight_reshare_disabled")
    @Expose
    private boolean highlightReshareDisabled;
    @SerializedName("is_memorialized")
    @Expose
    private boolean isMemorialized;
    @SerializedName("open_external_url_with_in_app_browser")
    @Expose
    private boolean openExternalUrlWithInAppBrowser;


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

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isHasAnonymousProfilePicture() {
        return hasAnonymousProfilePicture;
    }

    public void setHasAnonymousProfilePicture(boolean hasAnonymousProfilePicture) {
        this.hasAnonymousProfilePicture = hasAnonymousProfilePicture;
    }

    public Integer getMediaCount() {
        return mediaCount;
    }

    public void setMediaCount(Integer mediaCount) {
        this.mediaCount = mediaCount;
    }

    public Integer getGeoMediaCount() {
        return geoMediaCount;
    }

    public void setGeoMediaCount(Integer geoMediaCount) {
        this.geoMediaCount = geoMediaCount;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowingTagCount() {
        return followingTagCount;
    }

    public void setFollowingTagCount(Integer followingTagCount) {
        this.followingTagCount = followingTagCount;
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

    public boolean isCanConvertToBusiness() {
        return canConvertToBusiness;
    }

    public void setCanConvertToBusiness(boolean canConvertToBusiness) {
        this.canConvertToBusiness = canConvertToBusiness;
    }

    public boolean isCanCreateSponsorTags() {
        return canCreateSponsorTags;
    }

    public void setCanCreateSponsorTags(boolean canCreateSponsorTags) {
        this.canCreateSponsorTags = canCreateSponsorTags;
    }

    public boolean isAllowedToCreateStandalonePersonalFundraisers() {
        return isAllowedToCreateStandalonePersonalFundraisers;
    }

    public void setAllowedToCreateStandalonePersonalFundraisers(boolean allowedToCreateStandalonePersonalFundraisers) {
        isAllowedToCreateStandalonePersonalFundraisers = allowedToCreateStandalonePersonalFundraisers;
    }

    public boolean isCanCreateNewStandalonePersonalFundraiser() {
        return canCreateNewStandalonePersonalFundraiser;
    }

    public void setCanCreateNewStandalonePersonalFundraiser(boolean canCreateNewStandalonePersonalFundraiser) {
        this.canCreateNewStandalonePersonalFundraiser = canCreateNewStandalonePersonalFundraiser;
    }

    public boolean isCanBeTaggedAsSponsor() {
        return canBeTaggedAsSponsor;
    }

    public void setCanBeTaggedAsSponsor(boolean canBeTaggedAsSponsor) {
        this.canBeTaggedAsSponsor = canBeTaggedAsSponsor;
    }

    public boolean isCanSeeSupportInbox() {
        return canSeeSupportInbox;
    }

    public void setCanSeeSupportInbox(boolean canSeeSupportInbox) {
        this.canSeeSupportInbox = canSeeSupportInbox;
    }

    public boolean isCanSeeSupportInboxV1() {
        return canSeeSupportInboxV1;
    }

    public void setCanSeeSupportInboxV1(boolean canSeeSupportInboxV1) {
        this.canSeeSupportInboxV1 = canSeeSupportInboxV1;
    }

    public Integer getTotalIgtvVideos() {
        return totalIgtvVideos;
    }

    public void setTotalIgtvVideos(Integer totalIgtvVideos) {
        this.totalIgtvVideos = totalIgtvVideos;
    }

    public Integer getTotalClipsCount() {
        return totalClipsCount;
    }

    public void setTotalClipsCount(Integer totalClipsCount) {
        this.totalClipsCount = totalClipsCount;
    }

    public Integer getTotalArEffects() {
        return totalArEffects;
    }

    public void setTotalArEffects(Integer totalArEffects) {
        this.totalArEffects = totalArEffects;
    }

    public String getReelAutoArchive() {
        return reelAutoArchive;
    }

    public void setReelAutoArchive(String reelAutoArchive) {
        this.reelAutoArchive = reelAutoArchive;
    }

    public boolean isProfileActionNeeded() {
        return isProfileActionNeeded;
    }

    public void setProfileActionNeeded(boolean profileActionNeeded) {
        isProfileActionNeeded = profileActionNeeded;
    }

    public Integer getUsertagsCount() {
        return usertagsCount;
    }

    public void setUsertagsCount(Integer usertagsCount) {
        this.usertagsCount = usertagsCount;
    }

    public boolean isUsertagReviewEnabled() {
        return usertagReviewEnabled;
    }

    public void setUsertagReviewEnabled(boolean usertagReviewEnabled) {
        this.usertagReviewEnabled = usertagReviewEnabled;
    }

    public boolean isNeedy() {
        return isNeedy;
    }

    public void setNeedy(boolean needy) {
        isNeedy = needy;
    }

    public boolean isInterestAccount() {
        return isInterestAccount;
    }

    public void setInterestAccount(boolean interestAccount) {
        isInterestAccount = interestAccount;
    }

    public boolean isHasChaining() {
        return hasChaining;
    }

    public void setHasChaining(boolean hasChaining) {
        this.hasChaining = hasChaining;
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

    public boolean isHasPlacedOrders() {
        return hasPlacedOrders;
    }

    public void setHasPlacedOrders(boolean hasPlacedOrders) {
        this.hasPlacedOrders = hasPlacedOrders;
    }

    public boolean isCanTagProductsFromMerchants() {
        return canTagProductsFromMerchants;
    }

    public void setCanTagProductsFromMerchants(boolean canTagProductsFromMerchants) {
        this.canTagProductsFromMerchants = canTagProductsFromMerchants;
    }

    public boolean isFbpayExperienceEnabled() {
        return fbpayExperienceEnabled;
    }

    public void setFbpayExperienceEnabled(boolean fbpayExperienceEnabled) {
        this.fbpayExperienceEnabled = fbpayExperienceEnabled;
    }

    public boolean isShowConversionEditEntry() {
        return showConversionEditEntry;
    }

    public void setShowConversionEditEntry(boolean showConversionEditEntry) {
        this.showConversionEditEntry = showConversionEditEntry;
    }

    public boolean isAggregatePromoteEngagement() {
        return aggregatePromoteEngagement;
    }

    public void setAggregatePromoteEngagement(boolean aggregatePromoteEngagement) {
        this.aggregatePromoteEngagement = aggregatePromoteEngagement;
    }

    public String getAllowedCommenterType() {
        return allowedCommenterType;
    }

    public void setAllowedCommenterType(String allowedCommenterType) {
        this.allowedCommenterType = allowedCommenterType;
    }

    public boolean isVideoCreator() {
        return isVideoCreator;
    }

    public void setVideoCreator(boolean videoCreator) {
        isVideoCreator = videoCreator;
    }

    public boolean isHasProfileVideoFeed() {
        return hasProfileVideoFeed;
    }

    public void setHasProfileVideoFeed(boolean hasProfileVideoFeed) {
        this.hasProfileVideoFeed = hasProfileVideoFeed;
    }

    public boolean isHasHighlightReels() {
        return hasHighlightReels;
    }

    public void setHasHighlightReels(boolean hasHighlightReels) {
        this.hasHighlightReels = hasHighlightReels;
    }

    public boolean isEligibleToShowFbCrossSharingNux() {
        return isEligibleToShowFbCrossSharingNux;
    }

    public void setEligibleToShowFbCrossSharingNux(boolean eligibleToShowFbCrossSharingNux) {
        isEligibleToShowFbCrossSharingNux = eligibleToShowFbCrossSharingNux;
    }

    public Object getPageIdForNewSumaBizAccount() {
        return pageIdForNewSumaBizAccount;
    }

    public void setPageIdForNewSumaBizAccount(Object pageIdForNewSumaBizAccount) {
        this.pageIdForNewSumaBizAccount = pageIdForNewSumaBizAccount;
    }

    public List<Object> getEligibleShoppingSignupEntrypoints() {
        return eligibleShoppingSignupEntrypoints;
    }

    public void setEligibleShoppingSignupEntrypoints(List<Object> eligibleShoppingSignupEntrypoints) {
        this.eligibleShoppingSignupEntrypoints = eligibleShoppingSignupEntrypoints;
    }

    public boolean isCanBeReportedAsFraud() {
        return canBeReportedAsFraud;
    }

    public void setCanBeReportedAsFraud(boolean canBeReportedAsFraud) {
        this.canBeReportedAsFraud = canBeReportedAsFraud;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getProfessionalConversionSuggestedAccountType() {
        return professionalConversionSuggestedAccountType;
    }

    public void setProfessionalConversionSuggestedAccountType(Integer professionalConversionSuggestedAccountType) {
        this.professionalConversionSuggestedAccountType = professionalConversionSuggestedAccountType;
    }

    public Object getIsCallToActionEnabled() {
        return isCallToActionEnabled;
    }

    public void setIsCallToActionEnabled(Object isCallToActionEnabled) {
        this.isCallToActionEnabled = isCallToActionEnabled;
    }

    public LinkedFbInfo getLinkedFbInfo() {
        return linkedFbInfo;
    }

    public void setLinkedFbInfo(LinkedFbInfo linkedFbInfo) {
        this.linkedFbInfo = linkedFbInfo;
    }

    public boolean isCanSeePrimaryCountryInSettings() {
        return canSeePrimaryCountryInSettings;
    }

    public void setCanSeePrimaryCountryInSettings(boolean canSeePrimaryCountryInSettings) {
        this.canSeePrimaryCountryInSettings = canSeePrimaryCountryInSettings;
    }

    public Object getPersonalAccountAdsPageName() {
        return personalAccountAdsPageName;
    }

    public void setPersonalAccountAdsPageName(Object personalAccountAdsPageName) {
        this.personalAccountAdsPageName = personalAccountAdsPageName;
    }

    public Object getPersonalAccountAdsPageId() {
        return personalAccountAdsPageId;
    }

    public void setPersonalAccountAdsPageId(Object personalAccountAdsPageId) {
        this.personalAccountAdsPageId = personalAccountAdsPageId;
    }

    public List<Object> getAccountBadges() {
        return accountBadges;
    }

    public void setAccountBadges(List<Object> accountBadges) {
        this.accountBadges = accountBadges;
    }

    public boolean isIncludeDirectBlacklistStatus() {
        return includeDirectBlacklistStatus;
    }

    public void setIncludeDirectBlacklistStatus(boolean includeDirectBlacklistStatus) {
        this.includeDirectBlacklistStatus = includeDirectBlacklistStatus;
    }

    public boolean isCanFollowHashtag() {
        return canFollowHashtag;
    }

    public void setCanFollowHashtag(boolean canFollowHashtag) {
        this.canFollowHashtag = canFollowHashtag;
    }

    public boolean isPotentialBusiness() {
        return isPotentialBusiness;
    }

    public void setPotentialBusiness(boolean potentialBusiness) {
        isPotentialBusiness = potentialBusiness;
    }

    public boolean isShowPostInsightsEntryPoint() {
        return showPostInsightsEntryPoint;
    }

    public void setShowPostInsightsEntryPoint(boolean showPostInsightsEntryPoint) {
        this.showPostInsightsEntryPoint = showPostInsightsEntryPoint;
    }

    public boolean isFeedPostReshareDisabled() {
        return feedPostReshareDisabled;
    }

    public void setFeedPostReshareDisabled(boolean feedPostReshareDisabled) {
        this.feedPostReshareDisabled = feedPostReshareDisabled;
    }

    public Integer getBestiesCount() {
        return bestiesCount;
    }

    public void setBestiesCount(Integer bestiesCount) {
        this.bestiesCount = bestiesCount;
    }

    public boolean isShowBestiesBadge() {
        return showBestiesBadge;
    }

    public void setShowBestiesBadge(boolean showBestiesBadge) {
        this.showBestiesBadge = showBestiesBadge;
    }

    public Integer getRecentlyBestiedByCount() {
        return recentlyBestiedByCount;
    }

    public void setRecentlyBestiedByCount(Integer recentlyBestiedByCount) {
        this.recentlyBestiedByCount = recentlyBestiedByCount;
    }

    public Nametag getNametag() {
        return nametag;
    }

    public void setNametag(Nametag nametag) {
        this.nametag = nametag;
    }

    public boolean isExistingUserAgeCollectionEnabled() {
        return existingUserAgeCollectionEnabled;
    }

    public void setExistingUserAgeCollectionEnabled(boolean existingUserAgeCollectionEnabled) {
        this.existingUserAgeCollectionEnabled = existingUserAgeCollectionEnabled;
    }

    public boolean isAboutYourAccountBloksEntrypointEnabled() {
        return aboutYourAccountBloksEntrypointEnabled;
    }

    public void setAboutYourAccountBloksEntrypointEnabled(boolean aboutYourAccountBloksEntrypointEnabled) {
        this.aboutYourAccountBloksEntrypointEnabled = aboutYourAccountBloksEntrypointEnabled;
    }

    public boolean isAutoExpandChaining() {
        return autoExpandChaining;
    }

    public void setAutoExpandChaining(boolean autoExpandChaining) {
        this.autoExpandChaining = autoExpandChaining;
    }

    public boolean isHighlightReshareDisabled() {
        return highlightReshareDisabled;
    }

    public void setHighlightReshareDisabled(boolean highlightReshareDisabled) {
        this.highlightReshareDisabled = highlightReshareDisabled;
    }

    public boolean isMemorialized() {
        return isMemorialized;
    }

    public void setMemorialized(boolean memorialized) {
        isMemorialized = memorialized;
    }

    public boolean isOpenExternalUrlWithInAppBrowser() {
        return openExternalUrlWithInAppBrowser;
    }

    public void setOpenExternalUrlWithInAppBrowser(boolean openExternalUrlWithInAppBrowser) {
        this.openExternalUrlWithInAppBrowser = openExternalUrlWithInAppBrowser;
    }
}
