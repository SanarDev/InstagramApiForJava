package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class StoryAntiBullySticker extends BaseStoryItem {

    @SerializedName("anti_bully_sticker")
    private AntiBullySticker antiBullySticker;

    public AntiBullySticker getAntiBullySticker() {
        return antiBullySticker;
    }

    public void setAntiBullySticker(AntiBullySticker antiBullySticker) {
        this.antiBullySticker = antiBullySticker;
    }
}
