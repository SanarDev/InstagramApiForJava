package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileEditParams {

    @SerializedName("username")
    @Expose
    private EditParam username;
    @SerializedName("full_name")
    @Expose
    private EditParam fullName;

    public EditParam getUsername() {
        return username;
    }

    public void setUsername(EditParam username) {
        this.username = username;
    }

    public EditParam getFullName() {
        return fullName;
    }

    public void setFullName(EditParam fullName) {
        this.fullName = fullName;
    }
}
