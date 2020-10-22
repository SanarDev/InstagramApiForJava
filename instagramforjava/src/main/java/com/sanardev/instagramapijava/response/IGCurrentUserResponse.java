package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.CurrentUser;

public class IGCurrentUserResponse extends BaseResponse {

    @SerializedName("user")
    @Expose
    private CurrentUser user;

    public CurrentUser getUser() {
        return user;
    }

    public void setUser(CurrentUser user) {
        this.user = user;
    }
}
