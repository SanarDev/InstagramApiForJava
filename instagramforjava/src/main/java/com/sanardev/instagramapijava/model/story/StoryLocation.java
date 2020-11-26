package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.media.Location;

public class StoryLocation extends BaseStoryItem {

    @SerializedName("location")
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
