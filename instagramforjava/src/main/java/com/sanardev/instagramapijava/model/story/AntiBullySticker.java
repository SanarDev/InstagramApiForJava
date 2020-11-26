package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class AntiBullySticker {

    @SerializedName("id")
    private String id;
    @SerializedName("show_tooltip_count")
    private int showTooltipCount;
    @SerializedName("bloks_app")
    private String bloksApp;
    @SerializedName("should_perload")
    private boolean shouldPerload;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getShowTooltipCount() {
        return showTooltipCount;
    }

    public void setShowTooltipCount(int showTooltipCount) {
        this.showTooltipCount = showTooltipCount;
    }

    public String getBloksApp() {
        return bloksApp;
    }

    public void setBloksApp(String bloksApp) {
        this.bloksApp = bloksApp;
    }

    public boolean isShouldPerload() {
        return shouldPerload;
    }

    public void setShouldPerload(boolean shouldPerload) {
        this.shouldPerload = shouldPerload;
    }
}
