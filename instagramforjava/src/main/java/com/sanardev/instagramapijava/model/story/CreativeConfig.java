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

}
