package com.sanardev.instagramapijava.model.explore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.direct.IGThread;
import com.sanardev.instagramapijava.model.user.TinyUser;

public class Recipients {

    @SerializedName("thread")
    @Expose
    private IGThread thread;
    @SerializedName("user")
    @Expose
    private TinyUser user;

    public IGThread getThread() {
        return thread;
    }

    public void setThread(IGThread thread) {
        this.thread = thread;
    }

    public TinyUser getUser() {
        return user;
    }

    public void setUser(TinyUser user) {
        this.user = user;
    }
}
