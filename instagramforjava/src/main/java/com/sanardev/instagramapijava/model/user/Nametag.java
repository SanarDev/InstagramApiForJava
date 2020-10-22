package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nametag {


    @SerializedName("mode")
    @Expose
    private int mode;
    @SerializedName("gradient")
    @Expose
    private String gradient;
    @SerializedName("emoji")
    @Expose
    private String emoji;
    @SerializedName("emoji_color")
    @Expose
    private String emojiColor;
    @SerializedName("selfie_sticker")
    @Expose
    private String selfieSticker;

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public String getGradient() {
        return gradient;
    }

    public void setGradient(String gradient) {
        this.gradient = gradient;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmojiColor() {
        return emojiColor;
    }

    public void setEmojiColor(String emojiColor) {
        this.emojiColor = emojiColor;
    }

    public String getSelfieSticker() {
        return selfieSticker;
    }

    public void setSelfieSticker(String selfieSticker) {
        this.selfieSticker = selfieSticker;
    }
}
