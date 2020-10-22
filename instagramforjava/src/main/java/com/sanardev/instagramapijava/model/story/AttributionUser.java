package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttributionUser {

    @SerializedName("instagram_user_id")
    @Expose
    private String instagramUserId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("profile_picture")
    @Expose
    private ThumbnailImage profilePicture;

    public String getInstagramUserId() {
        return instagramUserId;
    }

    public void setInstagramUserId(String instagramUserId) {
        this.instagramUserId = instagramUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ThumbnailImage getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ThumbnailImage profilePicture) {
        this.profilePicture = profilePicture;
    }
}
