package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimatedMedia {


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("images")
    @Expose
    private Image images;
    @SerializedName("is_random")
    @Expose
    private Boolean isRandom;
    @SerializedName("is_sticker")
    @Expose
    private Boolean isSticker;
    @SerializedName("user")
    @Expose
    private Object user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public Boolean getIsRandom() {
        return isRandom;
    }

    public void setIsRandom(Boolean isRandom) {
        this.isRandom = isRandom;
    }

    public Boolean getIsSticker() {
        return isSticker;
    }

    public void setIsSticker(Boolean isSticker) {
        this.isSticker = isSticker;
    }

    public Boolean getRandom() {
        return isRandom;
    }

    public void setRandom(Boolean random) {
        isRandom = random;
    }

    public Boolean getSticker() {
        return isSticker;
    }

    public void setSticker(Boolean sticker) {
        isSticker = sticker;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}
