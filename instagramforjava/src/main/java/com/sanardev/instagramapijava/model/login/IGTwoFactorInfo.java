package com.sanardev.instagramapijava.model.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IGTwoFactorInfo {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("obfuscated_phone_number")
    @Expose
    private String obfuscatedPhoneNumber;
    @SerializedName("two_factor_identifier")
    @Expose
    private String twoFactorIdentifier;
    @SerializedName("sms_two_factor_on")
    @Expose
    private boolean smsTwoFactorOn;
    @SerializedName("totp_two_factor_on")
    @Expose
    private boolean totpTwoFactorOn;
    @SerializedName("show_messenger_code_option")
    @Expose
    private boolean showMessengerCodeOption;
    @SerializedName("show_new_login_screen")
    @Expose
    private boolean showNewLoginScreen;
    @SerializedName("show_trusted_device_option")
    @Expose
    private String showTrustedDeviceOption;
    @SerializedName("phone_verification_settings")
    @Expose
    private PhoneVerificationSettings phoneVerificationSettings;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getObfuscatedPhoneNumber() {
        return obfuscatedPhoneNumber;
    }

    public void setObfuscatedPhoneNumber(String obfuscatedPhoneNumber) {
        this.obfuscatedPhoneNumber = obfuscatedPhoneNumber;
    }

    public String getTwoFactorIdentifier() {
        return twoFactorIdentifier;
    }

    public void setTwoFactorIdentifier(String twoFactorIdentifier) {
        this.twoFactorIdentifier = twoFactorIdentifier;
    }

    public boolean isSmsTwoFactorOn() {
        return smsTwoFactorOn;
    }

    public void setSmsTwoFactorOn(boolean smsTwoFactorOn) {
        this.smsTwoFactorOn = smsTwoFactorOn;
    }

    public boolean isTotpTwoFactorOn() {
        return totpTwoFactorOn;
    }

    public void setTotpTwoFactorOn(boolean totpTwoFactorOn) {
        this.totpTwoFactorOn = totpTwoFactorOn;
    }

    public boolean isShowMessengerCodeOption() {
        return showMessengerCodeOption;
    }

    public void setShowMessengerCodeOption(boolean showMessengerCodeOption) {
        this.showMessengerCodeOption = showMessengerCodeOption;
    }

    public boolean isShowNewLoginScreen() {
        return showNewLoginScreen;
    }

    public void setShowNewLoginScreen(boolean showNewLoginScreen) {
        this.showNewLoginScreen = showNewLoginScreen;
    }

    public String getShowTrustedDeviceOption() {
        return showTrustedDeviceOption;
    }

    public void setShowTrustedDeviceOption(String showTrustedDeviceOption) {
        this.showTrustedDeviceOption = showTrustedDeviceOption;
    }

    public PhoneVerificationSettings getPhoneVerificationSettings() {
        return phoneVerificationSettings;
    }

    public void setPhoneVerificationSettings(PhoneVerificationSettings phoneVerificationSettings) {
        this.phoneVerificationSettings = phoneVerificationSettings;
    }
}
