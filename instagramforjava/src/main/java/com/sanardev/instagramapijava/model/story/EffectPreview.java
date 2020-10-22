package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EffectPreview {


    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("gatekeeper")
    @Expose
    private Object gatekeeper;
    @SerializedName("gatelogic")
    @Expose
    private Object gatelogic;
    @SerializedName("attribution_user_id")
    @Expose
    private String attributionUserId;
    @SerializedName("attribution_user")
    @Expose
    private AttributionUser attributionUser;
    @SerializedName("thumbnail_image")
    @Expose
    private ThumbnailImage thumbnailImage;
    @SerializedName("effect_actions")
    @Expose
    private List<String> effectActions = null;
    @SerializedName("effect_action_sheet")
    @Expose
    private EffectActionSheet effectActionSheet;
    @SerializedName("save_status")
    @Expose
    private String saveStatus;
    @SerializedName("device_position")
    @Expose
    private Object devicePosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getGatekeeper() {
        return gatekeeper;
    }

    public void setGatekeeper(Object gatekeeper) {
        this.gatekeeper = gatekeeper;
    }

    public Object getGatelogic() {
        return gatelogic;
    }

    public void setGatelogic(Object gatelogic) {
        this.gatelogic = gatelogic;
    }

    public String getAttributionUserId() {
        return attributionUserId;
    }

    public void setAttributionUserId(String attributionUserId) {
        this.attributionUserId = attributionUserId;
    }

    public AttributionUser getAttributionUser() {
        return attributionUser;
    }

    public void setAttributionUser(AttributionUser attributionUser) {
        this.attributionUser = attributionUser;
    }

    public ThumbnailImage getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(ThumbnailImage thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public List<String> getEffectActions() {
        return effectActions;
    }

    public void setEffectActions(List<String> effectActions) {
        this.effectActions = effectActions;
    }

    public EffectActionSheet getEffectActionSheet() {
        return effectActionSheet;
    }

    public void setEffectActionSheet(EffectActionSheet effectActionSheet) {
        this.effectActionSheet = effectActionSheet;
    }

    public String getSaveStatus() {
        return saveStatus;
    }

    public void setSaveStatus(String saveStatus) {
        this.saveStatus = saveStatus;
    }

    public Object getDevicePosition() {
        return devicePosition;
    }

    public void setDevicePosition(Object devicePosition) {
        this.devicePosition = devicePosition;
    }
}
