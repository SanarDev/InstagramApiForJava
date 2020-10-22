package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.timeline.ClientGapEnforcerMatrix;
import com.sanardev.instagramapijava.model.timeline.FeedItems;
import com.sanardev.instagramapijava.model.timeline.Messages;
import com.sanardev.instagramapijava.model.timeline.StartupPrefetchConfigs;

import java.util.List;

public class IGTimeLinePostsResponse extends BaseResponse {

    @SerializedName("num_results")
    private int numResults;
    @SerializedName("more_available")
    private boolean moreAvailable;
    @SerializedName("auto_load_more_enabled")
    private boolean autoLoadMoreEnabled;
    @SerializedName("feed_items")
    private List<FeedItems> feedItems;
    @SerializedName("is_direct_v2_enabled")
    private boolean isDirectV2Enabled;
    @SerializedName("next_max_id")
    private String nextMaxId;
    @SerializedName("view_state_version")
    private String viewStateVersion;
    @SerializedName("client_feed_changelist_applied")
    private boolean clientFeedChangelistApplied;
    @SerializedName("feed_pill_text")
    private String feedPillText;
    @SerializedName("request_id")
    private String requestId;
    @SerializedName("pull_to_refresh_window_ms")
    private long pullToRefreshWindowMs;
    @SerializedName("client_gap_enforcer_matrix")
    private List<ClientGapEnforcerMatrix> clientGapEnforcerMatrix;
    @SerializedName("startup_prefetch_configs")
    private StartupPrefetchConfigs startupPrefetchConfigs;
    @SerializedName("_messages")
    private List<Messages> messages;

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public boolean isMoreAvailable() {
        return moreAvailable;
    }

    public void setMoreAvailable(boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
    }

    public boolean isAutoLoadMoreEnabled() {
        return autoLoadMoreEnabled;
    }

    public void setAutoLoadMoreEnabled(boolean autoLoadMoreEnabled) {
        this.autoLoadMoreEnabled = autoLoadMoreEnabled;
    }

    public List<FeedItems> getFeedItems() {
        return feedItems;
    }

    public void setFeedItems(List<FeedItems> feedItems) {
        this.feedItems = feedItems;
    }

    public boolean isDirectV2Enabled() {
        return isDirectV2Enabled;
    }

    public void setDirectV2Enabled(boolean directV2Enabled) {
        isDirectV2Enabled = directV2Enabled;
    }

    public String getNextMaxId() {
        return nextMaxId;
    }

    public void setNextMaxId(String nextMaxId) {
        this.nextMaxId = nextMaxId;
    }

    public String getViewStateVersion() {
        return viewStateVersion;
    }

    public void setViewStateVersion(String viewStateVersion) {
        this.viewStateVersion = viewStateVersion;
    }

    public boolean isClientFeedChangelistApplied() {
        return clientFeedChangelistApplied;
    }

    public void setClientFeedChangelistApplied(boolean clientFeedChangelistApplied) {
        this.clientFeedChangelistApplied = clientFeedChangelistApplied;
    }

    public String getFeedPillText() {
        return feedPillText;
    }

    public void setFeedPillText(String feedPillText) {
        this.feedPillText = feedPillText;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public long getPullToRefreshWindowMs() {
        return pullToRefreshWindowMs;
    }

    public void setPullToRefreshWindowMs(long pullToRefreshWindowMs) {
        this.pullToRefreshWindowMs = pullToRefreshWindowMs;
    }

    public List<ClientGapEnforcerMatrix> getClientGapEnforcerMatrix() {
        return clientGapEnforcerMatrix;
    }

    public void setClientGapEnforcerMatrix(List<ClientGapEnforcerMatrix> clientGapEnforcerMatrix) {
        this.clientGapEnforcerMatrix = clientGapEnforcerMatrix;
    }

    public StartupPrefetchConfigs getStartupPrefetchConfigs() {
        return startupPrefetchConfigs;
    }

    public void setStartupPrefetchConfigs(StartupPrefetchConfigs startupPrefetchConfigs) {
        this.startupPrefetchConfigs = startupPrefetchConfigs;
    }

    public List<Messages> getMessages() {
        return messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }
}
