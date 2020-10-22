package com.sanardev.instagramapijava.model.timeline;

import com.google.gson.annotations.SerializedName;

public class FeedItems {

    @SerializedName("media_or_ad")
    private MediaOrAd mediaOrAd;
    @SerializedName("stories_netego")
    private StoriesNetego storiesNetego;

    public MediaOrAd getMediaOrAd() {
        return mediaOrAd;
    }

    public void setMediaOrAd(MediaOrAd mediaOrAd) {
        this.mediaOrAd = mediaOrAd;
    }

    public StoriesNetego getStoriesNetego() {
        return storiesNetego;
    }

    public void setStoriesNetego(StoriesNetego storiesNetego) {
        this.storiesNetego = storiesNetego;
    }
}
