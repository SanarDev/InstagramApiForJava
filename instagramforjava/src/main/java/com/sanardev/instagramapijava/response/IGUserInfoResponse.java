package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.BigUser;

public class IGUserInfoResponse extends BaseResponse {

    @SerializedName("user")
    @Expose
    private BigUser user;

    public BigUser getUser() {
        return user;
    }

    public void setUser(BigUser user) {
        this.user = user;
    }
}
