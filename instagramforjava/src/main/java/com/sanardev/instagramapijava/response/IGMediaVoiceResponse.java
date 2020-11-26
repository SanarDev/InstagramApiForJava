package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.SerializedName;
import com.sanardev.instagramapijava.model.direct.MessageMetaData;

import java.util.List;

public class IGMediaVoiceResponse extends BaseResponse {

    @SerializedName("message_metadata")
    private List<MessageMetaData> messageMetaData;
    @SerializedName("upload_id")
    private String uploadId;

    public List<MessageMetaData> getMessageMetaData() {
        return messageMetaData;
    }

    public void setMessageMetaData(List<MessageMetaData> messageMetaData) {
        this.messageMetaData = messageMetaData;
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }
}
