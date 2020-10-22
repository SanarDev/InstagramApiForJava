package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class UserTray {

    @SerializedName("pk")
    private long pk;
    @SerializedName("username")
    private String username;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("is_private")
    private boolean isPrivate;
    @SerializedName("profile_pic_url")
    private String profilePicUrl;
    @SerializedName("profile_pic_od")
    private String profilePicId;
    @SerializedName("is_verified")
    private boolean is_verified;
    @SerializedName("Friendship_status")
    private TrayFriendShipStatus friendShipStatus;

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

    public boolean isIs_verified() {
        return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public TrayFriendShipStatus getFriendShipStatus() {
        return friendShipStatus;
    }

    public void setFriendShipStatus(TrayFriendShipStatus friendShipStatus) {
        this.friendShipStatus = friendShipStatus;
    }
}
