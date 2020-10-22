package com.sanardev.instagramapijava.model.media;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Candidate {

    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("scans_profile")
    @Expose
    private String scansProfile;
    @SerializedName("estimated_scans_sizes")
    @Expose
    private List<Integer> estimatedScansSizes = null;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScansProfile() {
        return scansProfile;
    }

    public void setScansProfile(String scansProfile) {
        this.scansProfile = scansProfile;
    }

    public List<Integer> getEstimatedScansSizes() {
        return estimatedScansSizes;
    }

    public void setEstimatedScansSizes(List<Integer> estimatedScansSizes) {
        this.estimatedScansSizes = estimatedScansSizes;
    }

}
