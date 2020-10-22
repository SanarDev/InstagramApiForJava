package com.sanardev.instagramapijava.model.direct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.user.ShortUser;

import java.util.HashMap;
import java.util.List;

public class Thread {


    @SerializedName("thread_id")
    @Expose
    private String threadId;
    @SerializedName("thread_v2_id")
    @Expose
    private String threadV2Id;
    @SerializedName("users")
    @Expose
    private List<ThreadUser> users;
    @SerializedName("left_users")
    @Expose
    private List<ThreadUser> leftUsers;
    @SerializedName("admin_user_ids")
    @Expose
    private List<Object> adminUserIds;
    @SerializedName("items")
    @Expose
    private List<Message> messages ;
    @SerializedName("last_activity_at")
    @Expose
    private long lastActivityAt;
    @SerializedName("muted")
    @Expose
    private Boolean muted;
    @SerializedName("is_pin")
    @Expose
    private Boolean isPin;
    @SerializedName("named")
    @Expose
    private Boolean named;
    @SerializedName("canonical")
    @Expose
    private Boolean canonical;
    @SerializedName("pending")
    @Expose
    private Boolean pending;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("thread_type")
    @Expose
    private String threadType;
    @SerializedName("viewer_id")
    @Expose
    private long viewerId;
    @SerializedName("thread_title")
    @Expose
    private String threadTitle;
    @SerializedName("folder")
    @Expose
    private Integer folder;
    @SerializedName("vc_muted")
    @Expose
    private Boolean vcMuted = false;
    @SerializedName("is_group")
    @Expose
    private Boolean isGroup = false;
    @SerializedName("mentions_muted")
    @Expose
    private Boolean mentionsMuted;
    @SerializedName("approval_required_for_new_members")
    @Expose
    private Boolean approvalRequiredForNewMembers;
    @SerializedName("input_mode")
    @Expose
    private Integer inputMode;
    @SerializedName("business_thread_folder")
    @Expose
    private Integer businessThreadFolder;
    @SerializedName("read_state")
    @Expose
    private Integer readState;
    @SerializedName("last_non_sender_item_at")
    @Expose
    private long lastNonSenderItemAt;
    @SerializedName("assigned_admin_id")
    @Expose
    private Integer assignedAdminId;
    @SerializedName("shh_mode_enabled")
    @Expose
    private Boolean shhModeEnabled;
    @SerializedName("inviter")
    @Expose
    private ShortUser inviter;
    @SerializedName("has_older")
    @Expose
    private Boolean hasOlder;
    @SerializedName("has_newer")
    @Expose
    private Boolean hasNewer;
    @SerializedName("last_seen_at")
    @Expose
    private HashMap<String,Seen> lastSeenAt;
    @SerializedName("newest_cursor")
    @Expose
    private String newestCursor;
    @SerializedName("oldest_cursor")
    @Expose
    private String oldestCursor;
    @SerializedName("next_cursor")
    @Expose
    private String nextCursor;
    @SerializedName("prev_cursor")
    @Expose
    private String prevCursor;
    @SerializedName("is_spam")
    @Expose
    private Boolean isSpam;
    @SerializedName("last_permanent_item")
    @Expose
    private LastPermanentItem lastPermanentItem;

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getThreadV2Id() {
        return threadV2Id;
    }

    public void setThreadV2Id(String threadV2Id) {
        this.threadV2Id = threadV2Id;
    }

    public List<ThreadUser> getUsers() {
        return users;
    }

    public void setUsers(List<ThreadUser> users) {
        this.users = users;
    }

    public List<ThreadUser> getLeftUsers() {
        return leftUsers;
    }

    public void setLeftUsers(List<ThreadUser> leftUsers) {
        this.leftUsers = leftUsers;
    }

    public List<Object> getAdminUserIds() {
        return adminUserIds;
    }

    public void setAdminUserIds(List<Object> adminUserIds) {
        this.adminUserIds = adminUserIds;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public long getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(long lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public Boolean getPin() {
        return isPin;
    }

    public void setPin(Boolean pin) {
        isPin = pin;
    }

    public Boolean getNamed() {
        return named;
    }

    public void setNamed(Boolean named) {
        this.named = named;
    }

    public Boolean getCanonical() {
        return canonical;
    }

    public void setCanonical(Boolean canonical) {
        this.canonical = canonical;
    }

    public Boolean getPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getThreadType() {
        return threadType;
    }

    public void setThreadType(String threadType) {
        this.threadType = threadType;
    }

    public long getViewerId() {
        return viewerId;
    }

    public void setViewerId(long viewerId) {
        this.viewerId = viewerId;
    }

    public String getThreadTitle() {
        return threadTitle;
    }

    public void setThreadTitle(String threadTitle) {
        this.threadTitle = threadTitle;
    }

    public Integer getFolder() {
        return folder;
    }

    public void setFolder(Integer folder) {
        this.folder = folder;
    }

    public Boolean getVcMuted() {
        return vcMuted;
    }

    public void setVcMuted(Boolean vcMuted) {
        this.vcMuted = vcMuted;
    }

    public Boolean getGroup() {
        return isGroup;
    }

    public void setGroup(Boolean group) {
        isGroup = group;
    }

    public Boolean getMentionsMuted() {
        return mentionsMuted;
    }

    public void setMentionsMuted(Boolean mentionsMuted) {
        this.mentionsMuted = mentionsMuted;
    }

    public Boolean getApprovalRequiredForNewMembers() {
        return approvalRequiredForNewMembers;
    }

    public void setApprovalRequiredForNewMembers(Boolean approvalRequiredForNewMembers) {
        this.approvalRequiredForNewMembers = approvalRequiredForNewMembers;
    }

    public Integer getInputMode() {
        return inputMode;
    }

    public void setInputMode(Integer inputMode) {
        this.inputMode = inputMode;
    }

    public Integer getBusinessThreadFolder() {
        return businessThreadFolder;
    }

    public void setBusinessThreadFolder(Integer businessThreadFolder) {
        this.businessThreadFolder = businessThreadFolder;
    }

    public Integer getReadState() {
        return readState;
    }

    public void setReadState(Integer readState) {
        this.readState = readState;
    }

    public long getLastNonSenderItemAt() {
        return lastNonSenderItemAt;
    }

    public void setLastNonSenderItemAt(long lastNonSenderItemAt) {
        this.lastNonSenderItemAt = lastNonSenderItemAt;
    }

    public Integer getAssignedAdminId() {
        return assignedAdminId;
    }

    public void setAssignedAdminId(Integer assignedAdminId) {
        this.assignedAdminId = assignedAdminId;
    }

    public Boolean getShhModeEnabled() {
        return shhModeEnabled;
    }

    public void setShhModeEnabled(Boolean shhModeEnabled) {
        this.shhModeEnabled = shhModeEnabled;
    }

    public ShortUser getInviter() {
        return inviter;
    }

    public void setInviter(ShortUser inviter) {
        this.inviter = inviter;
    }

    public Boolean getHasOlder() {
        return hasOlder;
    }

    public void setHasOlder(Boolean hasOlder) {
        this.hasOlder = hasOlder;
    }

    public Boolean getHasNewer() {
        return hasNewer;
    }

    public void setHasNewer(Boolean hasNewer) {
        this.hasNewer = hasNewer;
    }

    public HashMap<String, Seen> getLastSeenAt() {
        return lastSeenAt;
    }

    public void setLastSeenAt(HashMap<String, Seen> lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    public String getNewestCursor() {
        return newestCursor;
    }

    public void setNewestCursor(String newestCursor) {
        this.newestCursor = newestCursor;
    }

    public String getOldestCursor() {
        return oldestCursor;
    }

    public void setOldestCursor(String oldestCursor) {
        this.oldestCursor = oldestCursor;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public String getPrevCursor() {
        return prevCursor;
    }

    public void setPrevCursor(String prevCursor) {
        this.prevCursor = prevCursor;
    }

    public Boolean getSpam() {
        return isSpam;
    }

    public void setSpam(Boolean spam) {
        isSpam = spam;
    }

    public LastPermanentItem getLastPermanentItem() {
        return lastPermanentItem;
    }

    public void setLastPermanentItem(LastPermanentItem lastPermanentItem) {
        this.lastPermanentItem = lastPermanentItem;
    }

}
