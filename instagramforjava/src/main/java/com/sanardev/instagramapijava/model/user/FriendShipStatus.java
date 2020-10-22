package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendShipStatus extends ShortFriendshipStatus {

    @SerializedName("followed_by")
    @Expose
    private boolean followedBy;
    @SerializedName("blocking")
    @Expose
    private boolean blocking;
    @SerializedName("muting")
    @Expose
    private boolean muting;
    @SerializedName("is_private")
    @Expose
    private boolean isPrivate;
    @SerializedName("incoming_request")
    @Expose
    private boolean incomingRequest;

    public boolean isFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(boolean followedBy) {
        this.followedBy = followedBy;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public boolean isMuting() {
        return muting;
    }

    public void setMuting(boolean muting) {
        this.muting = muting;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isIncomingRequest() {
        return incomingRequest;
    }

    public void setIncomingRequest(boolean incomingRequest) {
        this.incomingRequest = incomingRequest;
    }
}
