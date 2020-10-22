package com.sanardev.instagramapijava.model.timeline;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StartupPrefetchConfigs {


    @SerializedName("explore")
    @Expose
    private Explore explore;

    public Explore getExplore() {
        return explore;
    }

    public void setExplore(Explore explore) {
        this.explore = explore;
    }
}
