package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentUser extends User{

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
    @SerializedName("personal_account_ads_page_name")
    @Expose
    private Object personalAccountAdsPageName;
    @SerializedName("personal_account_ads_page_id")
    @Expose
    private Object personalAccountAdsPageId;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("national_number")
    @Expose
    private String nationalNumber;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gender")
    @Expose
    private int gender;
    @SerializedName("custom_gender")
    @Expose
    private String customGender;
    @SerializedName("trusted_username")
    @Expose
    private String trustedUsername;
    @SerializedName("trust_days")
    @Expose
    private int trustDays;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCustomGender() {
        return customGender;
    }

    public void setCustomGender(String customGender) {
        this.customGender = customGender;
    }

    public String getTrustedUsername() {
        return trustedUsername;
    }

    public void setTrustedUsername(String trustedUsername) {
        this.trustedUsername = trustedUsername;
    }

    public int getTrustDays() {
        return trustDays;
    }

    public void setTrustDays(int trustDays) {
        this.trustDays = trustDays;
    }

}
