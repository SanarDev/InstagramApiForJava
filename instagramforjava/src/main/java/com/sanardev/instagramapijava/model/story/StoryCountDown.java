package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class StoryCountDown extends BaseStoryItem {

    @SerializedName("countdown_sticker")
    private CountDownSticker countDownSticker;


    public CountDownSticker getCountDownSticker() {
        return countDownSticker;
    }

    public void setCountDownSticker(CountDownSticker countDownSticker) {
        this.countDownSticker = countDownSticker;
    }
}
