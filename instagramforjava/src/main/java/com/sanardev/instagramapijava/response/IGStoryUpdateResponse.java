package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.story.Story;

public class IGStoryUpdateResponse extends BaseResponse {

    @SerializedName("updated_media")
    private Story story;

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
