package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoCallEvent {


    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("vc_id")
    @Expose
    private long vcId;
    @SerializedName("encoded_server_data_info")
    @Expose
    private Object encodedServerDataInfo;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("text_attributes")
    @Expose
    private List<Object> textAttributes = null;
    @SerializedName("did_join")
    @Expose
    private Object didJoin;
    @SerializedName("thread_has_audio_only_call")
    @Expose
    private Boolean threadHasAudioOnlyCall;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getVcId() {
        return vcId;
    }

    public void setVcId(long vcId) {
        this.vcId = vcId;
    }

    public Object getEncodedServerDataInfo() {
        return encodedServerDataInfo;
    }

    public void setEncodedServerDataInfo(Object encodedServerDataInfo) {
        this.encodedServerDataInfo = encodedServerDataInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getTextAttributes() {
        return textAttributes;
    }

    public void setTextAttributes(List<Object> textAttributes) {
        this.textAttributes = textAttributes;
    }

    public Object getDidJoin() {
        return didJoin;
    }

    public void setDidJoin(Object didJoin) {
        this.didJoin = didJoin;
    }

    public Boolean getThreadHasAudioOnlyCall() {
        return threadHasAudioOnlyCall;
    }

    public void setThreadHasAudioOnlyCall(Boolean threadHasAudioOnlyCall) {
        this.threadHasAudioOnlyCall = threadHasAudioOnlyCall;
    }
}
