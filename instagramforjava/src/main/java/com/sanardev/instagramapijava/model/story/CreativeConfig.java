package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CreativeConfig {


    @SerializedName("camera_facing")
    @Expose
    private String cameraFacing;
    @SerializedName("effect_ids")
    @Expose
    private List<Long> effectIds = null;
    @SerializedName("face_effect_id")
    @Expose
    private Long faceEffectId;
    @SerializedName("capture_type")
    @Expose
    private String captureType;
    @SerializedName("should_render_try_it_on")
    @Expose
    private Boolean shouldRenderTryItOn;
    @SerializedName("failure_reason")
    @Expose
    private String failureReason;
    @SerializedName("effect_preview")
    @Expose
    private EffectPreview effectPreview;

    public String getCameraFacing() {
        return cameraFacing;
    }

    public void setCameraFacing(String cameraFacing) {
        this.cameraFacing = cameraFacing;
    }

    public List<Long> getEffectIds() {
        return effectIds;
    }

    public void setEffectIds(List<Long> effectIds) {
        this.effectIds = effectIds;
    }

    public Long getFaceEffectId() {
        return faceEffectId;
    }

    public void setFaceEffectId(Long faceEffectId) {
        this.faceEffectId = faceEffectId;
    }

    public String getCaptureType() {
        return captureType;
    }

    public void setCaptureType(String captureType) {
        this.captureType = captureType;
    }

    public Boolean getShouldRenderTryItOn() {
        return shouldRenderTryItOn;
    }

    public void setShouldRenderTryItOn(Boolean shouldRenderTryItOn) {
        this.shouldRenderTryItOn = shouldRenderTryItOn;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public EffectPreview getEffectPreview() {
        return effectPreview;
    }

    public void setEffectPreview(EffectPreview effectPreview) {
        this.effectPreview = effectPreview;
    }
}
