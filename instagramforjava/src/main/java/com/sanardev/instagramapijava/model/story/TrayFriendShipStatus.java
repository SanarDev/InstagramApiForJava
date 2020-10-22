package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class TrayFriendShipStatus {

    @SerializedName("muting")
    private boolean muting;
    @SerializedName("is_muting_reel")
    private boolean isMutingReel;
    @SerializedName("following")
    private boolean following;
    @SerializedName("is_bestie")
    private boolean isBestie;
    @SerializedName("outgoing_request")
    private boolean outgoingRequest;

    public boolean isMuting() {
        return muting;
    }

    public void setMuting(boolean muting) {
        this.muting = muting;
    }

    public boolean isMutingReel() {
        return isMutingReel;
    }

    public void setMutingReel(boolean mutingReel) {
        isMutingReel = mutingReel;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isBestie() {
        return isBestie;
    }

    public void setBestie(boolean bestie) {
        isBestie = bestie;
    }

    public boolean isOutgoingRequest() {
        return outgoingRequest;
    }

    public void setOutgoingRequest(boolean outgoingRequest) {
        this.outgoingRequest = outgoingRequest;
    }
}
