package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.FriendShipStatus;

public class IGUnfollowResponse extends BaseResponse {

    @SerializedName("friendship_status")
    private FriendShipStatus friendShipStatus;

    public FriendShipStatus getFriendShipStatus() {
        return friendShipStatus;
    }

    public void setFriendShipStatus(FriendShipStatus friendShipStatus) {
        this.friendShipStatus = friendShipStatus;
    }
}
