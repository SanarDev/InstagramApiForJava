package com.sanardev.instagramapijava.model.media;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuickResponseEmoji {

    @SerializedName("unicode")
    @Expose
    private String unicode;

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

}
