package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class QuestionSticker {

    @SerializedName("question_type")
    private String questionType;
    @SerializedName("question_id")
    private long questionId;
    @SerializedName("question")
    private String question;
    @SerializedName("media_id")
    private long mediaId;
    @SerializedName("text_color")
    private String textColor;
    @SerializedName("background_color")
    private String backgroundColor;
    @SerializedName("viewer_can_interact")
    private boolean viewerCanInteract;
    @SerializedName("profile_pic_url")
    private String profilePicUrl;

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public long getMediaId() {
        return mediaId;
    }

    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
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

    public boolean isViewerCanInteract() {
        return viewerCanInteract;
    }

    public void setViewerCanInteract(boolean viewerCanInteract) {
        this.viewerCanInteract = viewerCanInteract;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }
}
