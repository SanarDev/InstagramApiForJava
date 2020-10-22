package com.sanardev.instagramapijava.model.explore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recipients {

    @SerializedName("thread")
    @Expose
    private Thread thread;
    @SerializedName("user")
    @Expose
    private Object user;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}
