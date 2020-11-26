package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class StoryPoll extends BaseStoryItem {

    @SerializedName("poll_sticker")
    private PollSticker pollSticker;

    public PollSticker getPollSticker() {
        return pollSticker;
    }

    public void setPollSticker(PollSticker pollSticker) {
        this.pollSticker = pollSticker;
    }
}
