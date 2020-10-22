package com.sanardev.instagramapijava.model.direct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastPermanentItem {


    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("user_id")
    @Expose
    private long userId;
    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("client_context")
    @Expose
    private String clientContext;
    @SerializedName("show_forward_attribution")
    @Expose
    private Boolean showForwardAttribution;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getClientContext() {
        return clientContext;
    }

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    public Boolean getShowForwardAttribution() {
        return showForwardAttribution;
    }

    public void setShowForwardAttribution(Boolean showForwardAttribution) {
        this.showForwardAttribution = showForwardAttribution;
    }
}
