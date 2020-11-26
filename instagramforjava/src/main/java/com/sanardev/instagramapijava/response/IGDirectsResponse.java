package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.direct.Inbox;
import com.sanardev.instagramapijava.model.direct.Viewer;

public class IGDirectsResponse extends BaseResponse{

    @SerializedName("viewer")
    @Expose
    private Viewer viewer;
    @SerializedName("inbox")
    @Expose
    private Inbox inbox;
    @SerializedName("seq_id")
    @Expose
    private Integer seqId;
    @SerializedName("snapshot_at_ms")
    @Expose
    private long snapshotAtMs;
    @SerializedName("pending_requests_total")
    @Expose
    private long pendingRequestsTotal;
    @SerializedName("has_pending_top_requests")
    @Expose
    private Boolean hasPendingTopRequests;

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public long getSnapshotAtMs() {
        return snapshotAtMs;
    }

    public void setSnapshotAtMs(long snapshotAtMs) {
        this.snapshotAtMs = snapshotAtMs;
    }

    public long getPendingRequestsTotal() {
        return pendingRequestsTotal;
    }

    public void setPendingRequestsTotal(long pendingRequestsTotal) {
        this.pendingRequestsTotal = pendingRequestsTotal;
    }

    public Boolean getHasPendingTopRequests() {
        return hasPendingTopRequests;
    }

    public void setHasPendingTopRequests(Boolean hasPendingTopRequests) {
        this.hasPendingTopRequests = hasPendingTopRequests;
    }
}
