package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LinkContext {


    @SerializedName("link_url")
    @Expose
    private String linkUrl;
    @SerializedName("link_title")
    @Expose
    private String linkTitle;
    @SerializedName("link_summary")
    @Expose
    private String linkSummary;
    @SerializedName("link_image_url")
    @Expose
    private String linkImageUrl;

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public String getLinkSummary() {
        return linkSummary;
    }

    public void setLinkSummary(String linkSummary) {
        this.linkSummary = linkSummary;
    }

    public String getLinkImageUrl() {
        return linkImageUrl;
    }

    public void setLinkImageUrl(String linkImageUrl) {
        this.linkImageUrl = linkImageUrl;
    }
}
