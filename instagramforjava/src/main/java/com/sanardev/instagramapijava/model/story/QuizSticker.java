package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuizSticker {

    @SerializedName("id")
    private String id;
    @SerializedName("quiz_id")
    private long quizId;
    @SerializedName("question")
    private String question;
    @SerializedName("tallies")
    private List<Tally> tallies;
    @SerializedName("correct_answer")
    private int correctAnswer;
    @SerializedName("viewer_can_answer")
    private boolean viewerCanAnswer;
    @SerializedName("viewer_answer")
    private int viewerAnswer = -1;
    @SerializedName("finished")
    private boolean finished;
    @SerializedName("text_color")
    private String textColor;
    @SerializedName("start_background_color")
    private String startBackgroundColor;
    @SerializedName("end_background_color")
    private String endBackgroundColor;

    public int getViewerAnswer() {
        return viewerAnswer;
    }

    public void setViewerAnswer(int viewerAnswer) {
        this.viewerAnswer = viewerAnswer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getQuizId() {
        return quizId;
    }

    public void setQuizId(long quizId) {
        this.quizId = quizId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Tally> getTallies() {
        return tallies;
    }

    public void setTallies(List<Tally> tallies) {
        this.tallies = tallies;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isViewerCanAnswer() {
        return viewerCanAnswer;
    }

    public void setViewerCanAnswer(boolean viewerCanAnswer) {
        this.viewerCanAnswer = viewerCanAnswer;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getStartBackgroundColor() {
        return startBackgroundColor;
    }

    public void setStartBackgroundColor(String startBackgroundColor) {
        this.startBackgroundColor = startBackgroundColor;
    }

    public String getEndBackgroundColor() {
        return endBackgroundColor;
    }

    public void setEndBackgroundColor(String endBackgroundColor) {
        this.endBackgroundColor = endBackgroundColor;
    }
}
