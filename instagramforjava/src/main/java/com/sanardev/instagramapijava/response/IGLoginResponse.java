package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.login.IGChallenge;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.model.login.IGTwoFactorInfo;

public class IGLoginResponse extends BaseResponse {

    @SerializedName("two_factor_required")
    @Expose
    private boolean twoFactorRequired;
    @SerializedName("logged_in_user")
    @Expose
    private IGLoggedUser loggedInUser;
    @SerializedName("two_factor_info")
    @Expose
    private IGTwoFactorInfo twoFactorInfo;
    @SerializedName("challenge")
    @Expose
    private IGChallenge challenge;

    public boolean isTwoFactorRequired() {
        return twoFactorRequired;
    }

    public void setTwoFactorRequired(boolean twoFactorRequired) {
        this.twoFactorRequired = twoFactorRequired;
    }

    public IGLoggedUser getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(IGLoggedUser loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public IGTwoFactorInfo getTwoFactorInfo() {
        return twoFactorInfo;
    }

    public void setTwoFactorInfo(IGTwoFactorInfo twoFactorInfo) {
        this.twoFactorInfo = twoFactorInfo;
    }

    public IGChallenge getChallenge() {
        return challenge;
    }

    public void setChallenge(IGChallenge challenge) {
        this.challenge = challenge;
    }

}
