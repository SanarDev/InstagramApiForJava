package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

public class StoryQuestion extends BaseStoryItem {

    @SerializedName("question_sticker")
    private QuestionSticker questionSticker;

    public QuestionSticker getQuestionSticker() {
        return questionSticker;
    }

    public void setQuestionSticker(QuestionSticker questionSticker) {
        this.questionSticker = questionSticker;
    }
}
