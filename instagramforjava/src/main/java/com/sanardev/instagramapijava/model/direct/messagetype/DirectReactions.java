package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DirectReactions {


    @SerializedName("likes")
    @Expose
    private List<DirectLikeReactions> likes;
    @SerializedName("likes_count")
    @Expose
    private int likesCount;

    public List<DirectLikeReactions> getLikes() {
        return likes;
    }

    public void setLikes(List<DirectLikeReactions> likes) {
        this.likes = likes;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }
}
