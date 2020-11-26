package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

import retrofit2.SkipCallbackExecutor;

public class StoryQuiz extends BaseStoryItem {

    @SerializedName("quiz_sticker")
    private QuizSticker quizSticker;

    public QuizSticker getQuizSticker() {
        return quizSticker;
    }

    public void setQuizSticker(QuizSticker quizSticker) {
        this.quizSticker = quizSticker;
    }
}
