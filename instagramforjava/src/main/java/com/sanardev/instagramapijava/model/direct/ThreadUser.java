package com.sanardev.instagramapijava.model.direct;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.FriendShipStatus;
import com.sanardev.instagramapijava.model.user.TinyUser;

import java.util.List;

public class ThreadUser extends TinyUser {

    @SerializedName("friendship_status")
    private FriendShipStatus friendShipStatus;
    @SerializedName("has_anonymous_profile_picture")
    private boolean hasAnonymousProfilePicture;
    @SerializedName("has_threads_app")
    private boolean hasThreadsApp;
    @SerializedName("is_using_unified_inbox_for_direct")
    private boolean isUsingUnifiedInboxForDirect;
    @SerializedName("interop_messaging_user_fbid")
    private long interopMessagingUserFbid;
    @SerializedName("account_badges")
    private List<Object> account_badges;

    public FriendShipStatus getFriendShipStatus() {
        return friendShipStatus;
    }

    public void setFriendShipStatus(FriendShipStatus friendShipStatus) {
        this.friendShipStatus = friendShipStatus;
    }

    public boolean isHasAnonymousProfilePicture() {
        return hasAnonymousProfilePicture;
    }

    public void setHasAnonymousProfilePicture(boolean hasAnonymousProfilePicture) {
        this.hasAnonymousProfilePicture = hasAnonymousProfilePicture;
    }

    public boolean isHasThreadsApp() {
        return hasThreadsApp;
    }

    public void setHasThreadsApp(boolean hasThreadsApp) {
        this.hasThreadsApp = hasThreadsApp;
    }

    public boolean isUsingUnifiedInboxForDirect() {
        return isUsingUnifiedInboxForDirect;
    }

    public void setUsingUnifiedInboxForDirect(boolean usingUnifiedInboxForDirect) {
        isUsingUnifiedInboxForDirect = usingUnifiedInboxForDirect;
    }

    public long isInteropMessagingUserFbid() {
        return interopMessagingUserFbid;
    }

    public void setInteropMessagingUserFbid(long interopMessagingUserFbid) {
        this.interopMessagingUserFbid = interopMessagingUserFbid;
    }

    public List<Object> getAccount_badges() {
        return account_badges;
    }

    public void setAccount_badges(List<Object> account_badges) {
        this.account_badges = account_badges;
    }
}
