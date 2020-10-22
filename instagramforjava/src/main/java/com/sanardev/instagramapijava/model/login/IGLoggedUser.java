package com.sanardev.instagramapijava.model.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IGLoggedUser {

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
    @SerializedName("profilePicUrl")
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
    @SerializedName("can_boost_post")
    @Expose
    private boolean canBoostPost;
    @SerializedName("is_business")
    @Expose
    private boolean isBusiness;
    @SerializedName("account_type")
    @Expose
    private int accountType;
    @SerializedName("professional_conversion_suggested_account_type")
    @Expose
    private int professionalConversionSuggestedAccountType;
    @SerializedName("is_call_to_action_enabled")
    @Expose
    private Object isCallToActionEnabled;
    @SerializedName("can_see_organic_insights")
    @Expose
    private boolean canSeeOrganicInsights;
    @SerializedName("show_insights_terms")
    @Expose
    private boolean showInsightsTerms;
    @SerializedName("total_igtv_videos")
    @Expose
    private int totalIgtvVideos;
    @SerializedName("reel_auto_archive")
    @Expose
    private String reelAutoArchive;
    @SerializedName("has_placed_orders")
    @Expose
    private boolean hasPlacedOrders;
    @SerializedName("allowed_commenter_type")
    @Expose
    private String allowedCommenterType;
    @SerializedName("nametag")
    @Expose
    private NameTag nametag;
    @SerializedName("is_using_unified_inbox_for_direct")
    @Expose
    private boolean isUsingUnifiedInboxForDirect;
    @SerializedName("interop_messaging_user_fbid")
    @Expose
    private long interopMessagingUserFbid;
    @SerializedName("can_see_primary_country_in_settings")
    @Expose
    private boolean canSeePrimaryCountryInSettings;
    @SerializedName("allow_contacts_sync")
    @Expose
    private boolean allowContactsSync;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("password")
    @Expose
    private String password;

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

    public boolean isCanBoostPost() {
        return canBoostPost;
    }

    public void setCanBoostPost(boolean canBoostPost) {
        this.canBoostPost = canBoostPost;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getProfessionalConversionSuggestedAccountType() {
        return professionalConversionSuggestedAccountType;
    }

    public void setProfessionalConversionSuggestedAccountType(int professionalConversionSuggestedAccountType) {
        this.professionalConversionSuggestedAccountType = professionalConversionSuggestedAccountType;
    }

    public Object getIsCallToActionEnabled() {
        return isCallToActionEnabled;
    }

    public void setIsCallToActionEnabled(Object isCallToActionEnabled) {
        this.isCallToActionEnabled = isCallToActionEnabled;
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

    public int getTotalIgtvVideos() {
        return totalIgtvVideos;
    }

    public void setTotalIgtvVideos(int totalIgtvVideos) {
        this.totalIgtvVideos = totalIgtvVideos;
    }

    public String getReelAutoArchive() {
        return reelAutoArchive;
    }

    public void setReelAutoArchive(String reelAutoArchive) {
        this.reelAutoArchive = reelAutoArchive;
    }

    public boolean isHasPlacedOrders() {
        return hasPlacedOrders;
    }

    public void setHasPlacedOrders(boolean hasPlacedOrders) {
        this.hasPlacedOrders = hasPlacedOrders;
    }

    public String getAllowedCommenterType() {
        return allowedCommenterType;
    }

    public void setAllowedCommenterType(String allowedCommenterType) {
        this.allowedCommenterType = allowedCommenterType;
    }

    public NameTag getNametag() {
        return nametag;
    }

    public void setNametag(NameTag nametag) {
        this.nametag = nametag;
    }

    public boolean isUsingUnifiedInboxForDirect() {
        return isUsingUnifiedInboxForDirect;
    }

    public void setUsingUnifiedInboxForDirect(boolean usingUnifiedInboxForDirect) {
        isUsingUnifiedInboxForDirect = usingUnifiedInboxForDirect;
    }

    public long getInteropMessagingUserFbid() {
        return interopMessagingUserFbid;
    }

    public void setInteropMessagingUserFbid(long interopMessagingUserFbid) {
        this.interopMessagingUserFbid = interopMessagingUserFbid;
    }

    public boolean isCanSeePrimaryCountryInSettings() {
        return canSeePrimaryCountryInSettings;
    }

    public void setCanSeePrimaryCountryInSettings(boolean canSeePrimaryCountryInSettings) {
        this.canSeePrimaryCountryInSettings = canSeePrimaryCountryInSettings;
    }

    public boolean isAllowContactsSync() {
        return allowContactsSync;
    }

    public void setAllowContactsSync(boolean allowContactsSync) {
        this.allowContactsSync = allowContactsSync;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
