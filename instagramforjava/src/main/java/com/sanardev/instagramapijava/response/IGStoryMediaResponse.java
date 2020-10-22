package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.story.Tray;

import java.util.HashMap;

public class IGStoryMediaResponse extends BaseResponse{

    @SerializedName("reels")
    @Expose
    private HashMap<Long, Tray> reels;

    public HashMap<Long, Tray> getReels() {
        return reels;
    }

    public void setReels(HashMap<Long, Tray> reels) {
        this.reels = reels;
    }
}
