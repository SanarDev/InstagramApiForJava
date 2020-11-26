package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PollSticker {

    @SerializedName("id")
    private String id;
    @SerializedName("poll_id")
    private long pollId;
    @SerializedName("question")
    private String question;
    @SerializedName("tallies")
    private List<Tally> tallies;
    @SerializedName("promotion_tallies")
    private Object promotionTallies;
    @SerializedName("viewer_can_vote")
    private boolean viewerCanVote;
    @SerializedName("is_shared_result")
    private boolean isSharedResult;
    @SerializedName("finished")
    private boolean finished;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPollId() {
        return pollId;
    }

    public void setPollId(long pollId) {
        this.pollId = pollId;
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

    public Object getPromotionTallies() {
        return promotionTallies;
    }

    public void setPromotionTallies(Object promotionTallies) {
        this.promotionTallies = promotionTallies;
    }

    public boolean isViewerCanVote() {
        return viewerCanVote;
    }

    public void setViewerCanVote(boolean viewerCanVote) {
        this.viewerCanVote = viewerCanVote;
    }

    public boolean isSharedResult() {
        return isSharedResult;
    }

    public void setSharedResult(boolean sharedResult) {
        isSharedResult = sharedResult;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
