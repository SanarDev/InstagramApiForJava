package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.timeline.MediaOrAd;

import java.util.List;

public class IGMediaResponse extends BaseResponse {

    @SerializedName("items")
    @Expose
    private List<MediaOrAd> items;
    @SerializedName("num_results")
    @Expose
    private int countResult;
    @SerializedName("auto_load_more_enabled")
    @Expose
    private boolean autoLoadMoreEnabled;

    public List<MediaOrAd> getItems() {
        return items;
    }

    public void setItems(List<MediaOrAd> items) {
        this.items = items;
    }

    public int getCountResult() {
        return countResult;
    }

    public void setCountResult(int countResult) {
        this.countResult = countResult;
    }

    public boolean isAutoLoadMoreEnabled() {
        return autoLoadMoreEnabled;
    }

    public void setAutoLoadMoreEnabled(boolean autoLoadMoreEnabled) {
        this.autoLoadMoreEnabled = autoLoadMoreEnabled;
    }
}
