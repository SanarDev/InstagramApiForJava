package com.sanardev.instagramapijava.model.media;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.TinyUser;

import java.util.List;

public class Comment {


    @SerializedName("pk")
    @Expose
    private Long pk;
    @SerializedName("user_id")
    @Expose
    private Long userId;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private Long type;
    @SerializedName("created_at")
    @Expose
    private Long createdAt;
    @SerializedName("created_at_utc")
    @Expose
    private Long createdAtUtc;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("bit_flags")
    @Expose
    private Long bitFlags;
    @SerializedName("did_report_as_spam")
    @Expose
    private Boolean didReportAsSpam;
    @SerializedName("share_enabled")
    @Expose
    private Boolean shareEnabled;
    @SerializedName("user")
    @Expose
    private TinyUser user;
    @SerializedName("has_liked_comment")
    @Expose
    private Boolean hasLikedComment;
    @SerializedName("comment_like_count")
    @Expose
    private Long commentLikeCount;
    @SerializedName("child_comment_count")
    @Expose
    private Long childCommentCount;
    @SerializedName("preview_child_comments")
    @Expose
    private List<PreviewComment> previewChildComments = null;
    @SerializedName("other_preview_users")
    @Expose
    private List<Object> otherPreviewUsers = null;
    @SerializedName("has_more_tail_child_comments")
    @Expose
    private Boolean hasMoreTailChildComments;
    @SerializedName("has_more_head_child_comments")
    @Expose
    private Boolean hasMoreHeadChildComments;
    @SerializedName("inline_composer_display_condition")
    @Expose
    private String inlineComposerDisplayCondition;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedAtUtc() {
        return createdAtUtc;
    }

    public void setCreatedAtUtc(Long createdAtUtc) {
        this.createdAtUtc = createdAtUtc;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getBitFlags() {
        return bitFlags;
    }

    public void setBitFlags(Long bitFlags) {
        this.bitFlags = bitFlags;
    }

    public Boolean getDidReportAsSpam() {
        return didReportAsSpam;
    }

    public void setDidReportAsSpam(Boolean didReportAsSpam) {
        this.didReportAsSpam = didReportAsSpam;
    }

    public Boolean getShareEnabled() {
        return shareEnabled;
    }

    public void setShareEnabled(Boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
    }

    public TinyUser getUser() {
        return user;
    }

    public void setUser(TinyUser user) {
        this.user = user;
    }

    public Boolean getHasLikedComment() {
        return hasLikedComment;
    }

    public void setHasLikedComment(Boolean hasLikedComment) {
        this.hasLikedComment = hasLikedComment;
    }

    public Long getCommentLikeCount() {
        return commentLikeCount;
    }

    public void setCommentLikeCount(Long commentLikeCount) {
        this.commentLikeCount = commentLikeCount;
    }

    public Long getChildCommentCount() {
        return childCommentCount;
    }

    public void setChildCommentCount(Long childCommentCount) {
        this.childCommentCount = childCommentCount;
    }

    public List<PreviewComment> getPreviewChildComments() {
        return previewChildComments;
    }

    public void setPreviewChildComments(List<PreviewComment> previewChildComments) {
        this.previewChildComments = previewChildComments;
    }

    public List<Object> getOtherPreviewUsers() {
        return otherPreviewUsers;
    }

    public void setOtherPreviewUsers(List<Object> otherPreviewUsers) {
        this.otherPreviewUsers = otherPreviewUsers;
    }

    public Boolean getHasMoreTailChildComments() {
        return hasMoreTailChildComments;
    }

    public void setHasMoreTailChildComments(Boolean hasMoreTailChildComments) {
        this.hasMoreTailChildComments = hasMoreTailChildComments;
    }

    public Boolean getHasMoreHeadChildComments() {
        return hasMoreHeadChildComments;
    }

    public void setHasMoreHeadChildComments(Boolean hasMoreHeadChildComments) {
        this.hasMoreHeadChildComments = hasMoreHeadChildComments;
    }

    public String getInlineComposerDisplayCondition() {
        return inlineComposerDisplayCondition;
    }

    public void setInlineComposerDisplayCondition(String inlineComposerDisplayCondition) {
        this.inlineComposerDisplayCondition = inlineComposerDisplayCondition;
    }
}
