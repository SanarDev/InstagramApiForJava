package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.SerializedName;

public class ShortUserWithFriendShip extends ShortUser{

    @SerializedName("friendship_status")
    private ShortFriendshipStatus friendshipStatus;

    public ShortFriendshipStatus getFriendshipStatus() {
        return friendshipStatus;
    }

    public void setFriendshipStatus(ShortFriendshipStatus friendshipStatus) {
        this.friendshipStatus = friendshipStatus;
    }
}
