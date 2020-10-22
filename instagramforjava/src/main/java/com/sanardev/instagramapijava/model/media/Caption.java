package com.sanardev.instagramapijava.model.media;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.ShortUserWithFriendShip;

public class Caption {

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
    private boolean didReportAsSpam;
    @SerializedName("share_enabled")
    @Expose
    private boolean shareEnabled;
    @SerializedName("user")
    @Expose
    private ShortUserWithFriendShip user;
    @SerializedName("media_id")
    @Expose
    private Long mediaId;
    @SerializedName("has_translation")
    @Expose
    private boolean hasTranslation;

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

    public boolean isDidReportAsSpam() {
        return didReportAsSpam;
    }

    public void setDidReportAsSpam(boolean didReportAsSpam) {
        this.didReportAsSpam = didReportAsSpam;
    }

    public boolean isShareEnabled() {
        return shareEnabled;
    }

    public void setShareEnabled(boolean shareEnabled) {
        this.shareEnabled = shareEnabled;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public boolean isHasTranslation() {
        return hasTranslation;
    }

    public void setHasTranslation(boolean hasTranslation) {
        this.hasTranslation = hasTranslation;
    }

    public ShortUserWithFriendShip getUser() {
        return user;
    }

    public void setUser(ShortUserWithFriendShip user) {
        this.user = user;
    }
}
