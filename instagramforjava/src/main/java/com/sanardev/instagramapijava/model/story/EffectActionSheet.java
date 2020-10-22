package com.sanardev.instagramapijava.model.story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EffectActionSheet {

    @SerializedName("primary_actions")
    @Expose
    private List<String> primaryActions = null;
    @SerializedName("secondary_actions")
    @Expose
    private List<String> secondaryActions = null;

    public List<String> getPrimaryActions() {
        return primaryActions;
    }

    public void setPrimaryActions(List<String> primaryActions) {
        this.primaryActions = primaryActions;
    }

    public List<String> getSecondaryActions() {
        return secondaryActions;
    }

    public void setSecondaryActions(List<String> secondaryActions) {
        this.secondaryActions = secondaryActions;
    }
}
