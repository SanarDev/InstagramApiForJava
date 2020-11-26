package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class SliderSticker {

    @SerializedName("slider_id")
    private long sliderId;
    @SerializedName("question")
    private String question;
    @SerializedName("emoji")
    private String emoji;
    @SerializedName("text_color")
    private String textColor;
    @SerializedName("background_color")
    private String backgroundColor;
    @SerializedName("viewer_can_vote")
    private boolean viewerCanVote;
    @SerializedName("slider_vote_average")
    private Object sliderVoteAverage;
    @SerializedName("slider_vote_count")
    private int sliderVoteCount;
    @SerializedName("viewer_vote")
    private double viewerVote = -1.0;

    public long getSliderId() {
        return sliderId;
    }

    public void setSliderId(long sliderId) {
        this.sliderId = sliderId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isViewerCanVote() {
        return viewerCanVote;
    }

    public void setViewerCanVote(boolean viewerCanVote) {
        this.viewerCanVote = viewerCanVote;
    }

    public Object getSliderVoteAverage() {
        return sliderVoteAverage;
    }

    public void setSliderVoteAverage(Object sliderVoteAverage) {
        this.sliderVoteAverage = sliderVoteAverage;
    }

    public int getSliderVoteCount() {
        return sliderVoteCount;
    }

    public void setSliderVoteCount(int sliderVoteCount) {
        this.sliderVoteCount = sliderVoteCount;
    }

    public double getViewerVote() {
        return viewerVote;
    }

    public void setViewerVote(double viewerVote) {
        this.viewerVote = viewerVote;
    }
}
