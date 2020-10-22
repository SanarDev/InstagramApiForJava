package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.explore.Recipients;

import java.util.List;

public class IGRecipientsResponse {

    @SerializedName("ranked_recipients")
    @Expose
    private List<Recipients> recipients;
    @SerializedName("expires")
    @Expose
    private int expires;
    @SerializedName("filtered")
    @Expose
    private boolean filtered;
    @SerializedName("request_id")
    @Expose
    private String requestId;
    @SerializedName("rank_token")
    @Expose
    private String rankToken;

    public List<Recipients> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipients> recipients) {
        this.recipients = recipients;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public boolean isFiltered() {
        return filtered;
    }

    public void setFiltered(boolean filtered) {
        this.filtered = filtered;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRankToken() {
        return rankToken;
    }

    public void setRankToken(String rankToken) {
        this.rankToken = rankToken;
    }
}
