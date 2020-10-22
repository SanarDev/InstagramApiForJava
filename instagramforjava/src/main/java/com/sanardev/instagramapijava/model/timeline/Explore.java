package com.sanardev.instagramapijava.model.timeline;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Explore {


    @SerializedName("containermodule")
    @Expose
    private String containermodule;
    @SerializedName("should_prefetch")
    @Expose
    private Boolean shouldPrefetch;
    @SerializedName("should_prefetch_thumbnails")
    @Expose
    private Boolean shouldPrefetchThumbnails;

    public String getContainermodule() {
        return containermodule;
    }

    public void setContainermodule(String containermodule) {
        this.containermodule = containermodule;
    }

    public Boolean getShouldPrefetch() {
        return shouldPrefetch;
    }

    public void setShouldPrefetch(Boolean shouldPrefetch) {
        this.shouldPrefetch = shouldPrefetch;
    }

    public Boolean getShouldPrefetchThumbnails() {
        return shouldPrefetchThumbnails;
    }

    public void setShouldPrefetchThumbnails(Boolean shouldPrefetchThumbnails) {
        this.shouldPrefetchThumbnails = shouldPrefetchThumbnails;
    }
}
