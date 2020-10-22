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


}
