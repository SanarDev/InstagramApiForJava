package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class Hashtag {

    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
