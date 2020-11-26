package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.direct.IGThread;

public class IGParticipantsResponse extends BaseResponse {

    @SerializedName("thread")
    @Expose
    private IGThread thread;

    public IGThread getThread() {
        return thread;
    }

    public void setThread(IGThread thread) {
        this.thread = thread;
    }
}
