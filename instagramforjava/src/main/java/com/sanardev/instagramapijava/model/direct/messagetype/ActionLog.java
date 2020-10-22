package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActionLog {


    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("bold")
    @Expose
    private Object bold;

    public Object getBold() {
        return bold;
    }

    public void setBold(Object bold) {
        this.bold = bold;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
