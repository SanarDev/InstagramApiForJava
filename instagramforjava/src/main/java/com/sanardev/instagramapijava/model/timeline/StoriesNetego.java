package com.sanardev.instagramapijava.model.timeline;

import com.google.gson.annotations.SerializedName;

public class StoriesNetego {

    @SerializedName("tracking_token")
    private String trackingToken;
    @SerializedName("hide_unit_if_seen")
    private String hideUnitIfSeen;
    @SerializedName("client_position")
    private String clientPosition;
    @SerializedName("id")
    private String id;

    public String getTrackingToken() {
        return trackingToken;
    }

    public void setTrackingToken(String trackingToken) {
        this.trackingToken = trackingToken;
    }

    public String getHideUnitIfSeen() {
        return hideUnitIfSeen;
    }

    public void setHideUnitIfSeen(String hideUnitIfSeen) {
        this.hideUnitIfSeen = hideUnitIfSeen;
    }

    public String getClientPosition() {
        return clientPosition;
    }

    public void setClientPosition(String clientPosition) {
        this.clientPosition = clientPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
