package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.SerializedName;

public class ShortUser extends TinyUser{

    @SerializedName("has_anonymous_profile_picture")
    private boolean hasAnonymousProfilePicture;
    @SerializedName("is_unpublished")
    private boolean isUnpublished;
    @SerializedName("is_favorite")
    private boolean isFavorite;
    @SerializedName("account_badges")
    private Object accountBadges;
    @SerializedName("latest_reel_media")
    private long latestReelMedia;

    public boolean isHasAnonymousProfilePicture() {
        return hasAnonymousProfilePicture;
    }

    public void setHasAnonymousProfilePicture(boolean hasAnonymousProfilePicture) {
        this.hasAnonymousProfilePicture = hasAnonymousProfilePicture;
    }

    public boolean isUnpublished() {
        return isUnpublished;
    }

    public void setUnpublished(boolean unpublished) {
        isUnpublished = unpublished;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Object getAccountBadges() {
        return accountBadges;
    }

    public void setAccountBadges(Object accountBadges) {
        this.accountBadges = accountBadges;
    }

    public long getLatestReelMedia() {
        return latestReelMedia;
    }

    public void setLatestReelMedia(long latestReelMedia) {
        this.latestReelMedia = latestReelMedia;
    }
}
