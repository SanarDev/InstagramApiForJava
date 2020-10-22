package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShortFriendshipStatus {

    @SerializedName("following")
    @Expose
    private boolean following;
    @SerializedName("outgoing_request")
    @Expose
    private boolean outgoingRequest;
    @SerializedName("is_bestie")
    @Expose
    private boolean isBestie;
    @SerializedName("is_restricted")
    @Expose
    private boolean isRestricted;

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isOutgoingRequest() {
        return outgoingRequest;
    }

    public void setOutgoingRequest(boolean outgoingRequest) {
        this.outgoingRequest = outgoingRequest;
    }

    public boolean isBestie() {
        return isBestie;
    }

    public void setBestie(boolean bestie) {
        isBestie = bestie;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setRestricted(boolean restricted) {
        isRestricted = restricted;
    }
}
