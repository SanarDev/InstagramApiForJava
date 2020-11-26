package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class BaseStoryItem {

    @SerializedName("x")
    private double x;
    @SerializedName("y")
    private double y;
    @SerializedName("z")
    private int z;
    @SerializedName("width")
    private double width;
    @SerializedName("height")
    private double height;
    @SerializedName("rotation")
    private double rotation;
    @SerializedName("is_pinned")
    private int isPinned;
    @SerializedName("is_hidden")
    private int isHidden;
    @SerializedName("is_sticker")
    private int isSticker;
    @SerializedName("is_fb_sticker")
    private int isFbSticker;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public int getIsSticker() {
        return isSticker;
    }

    public void setIsSticker(int isSticker) {
        this.isSticker = isSticker;
    }

    public int getIsFbSticker() {
        return isFbSticker;
    }

    public void setIsFbSticker(int isFbSticker) {
        this.isFbSticker = isFbSticker;
    }
}
