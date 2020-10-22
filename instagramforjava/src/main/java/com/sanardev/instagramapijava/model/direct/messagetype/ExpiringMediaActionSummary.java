package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExpiringMediaActionSummary {


    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("timestamp")
    @Expose
    private long timestamp;
    @SerializedName("count")
    @Expose
    private int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
