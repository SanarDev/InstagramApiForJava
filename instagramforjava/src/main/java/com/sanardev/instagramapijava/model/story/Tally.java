package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class Tally {

    @SerializedName("text")
    private String text;
    @SerializedName("font_size")
    private float fontSize;
    @SerializedName("count")
    private int count;
    @SerializedName("viewer_vote")
    private int viewerVote = -1;
    @SerializedName("finished")
    private boolean finished;
    @SerializedName("is_shared_result")
    private boolean isSharedResult;

    public int getViewerVote() {
        return viewerVote;
    }

    public void setViewerVote(int viewerVote) {
        this.viewerVote = viewerVote;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isSharedResult() {
        return isSharedResult;
    }

    public void setSharedResult(boolean sharedResult) {
        isSharedResult = sharedResult;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
