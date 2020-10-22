package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FelixShare {


    @SerializedName("video")
    @Expose
    private FelixVideo video;
    @SerializedName("text")
    @Expose
    private String text;

    public FelixVideo getVideo() {
        return video;
    }

    public void setVideo(FelixVideo video) {
        this.video = video;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
