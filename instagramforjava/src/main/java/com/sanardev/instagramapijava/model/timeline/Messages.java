package com.sanardev.instagramapijava.model.timeline;

import com.google.gson.annotations.SerializedName;

public class Messages {

    @SerializedName("time")
    private double time;
    @SerializedName("key")
    private String key;

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
