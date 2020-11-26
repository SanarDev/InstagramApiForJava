package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.timeline.MediaOrAd;

import java.util.List;

public class IGPostsResponse extends BaseResponse {

    @SerializedName("num_results")
    @Expose
    private int numResults;
    @SerializedName("more_available")
    @Expose
    private boolean moreAvailable;
    @SerializedName("auto_load_more_enabled")
    @Expose
    private boolean autoLoadMoreEnabled;
    @SerializedName("items")
    @Expose
    private List<MediaOrAd> posts;

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public boolean isMoreAvailable() {
        return moreAvailable;
    }

    public void setMoreAvailable(boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
    }

    public boolean isAutoLoadMoreEnabled() {
        return autoLoadMoreEnabled;
    }

    public void setAutoLoadMoreEnabled(boolean autoLoadMoreEnabled) {
        this.autoLoadMoreEnabled = autoLoadMoreEnabled;
    }

    public List<MediaOrAd> getPosts() {
        return posts;
    }

    public void setPosts(List<MediaOrAd> posts) {
        this.posts = posts;
    }
}
