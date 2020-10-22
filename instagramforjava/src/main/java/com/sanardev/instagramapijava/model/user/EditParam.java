package com.sanardev.instagramapijava.model.user;

import com.google.gson.annotations.SerializedName;

public class EditParam {

    @SerializedName("should_show_confirmation_dialog")
    private boolean shouldShowConfirmationDialog;
    @SerializedName("is_pending_review")
    private boolean isPendingReview;
    @SerializedName("confirmation_dialog_text")
    private SerializedName confirmationDialogText;
    @SerializedName("disclaimer_text")
    private Object disclaimerText;

    public boolean isShouldShowConfirmationDialog() {
        return shouldShowConfirmationDialog;
    }

    public void setShouldShowConfirmationDialog(boolean shouldShowConfirmationDialog) {
        this.shouldShowConfirmationDialog = shouldShowConfirmationDialog;
    }

    public boolean isPendingReview() {
        return isPendingReview;
    }

    public void setPendingReview(boolean pendingReview) {
        isPendingReview = pendingReview;
    }

    public SerializedName getConfirmationDialogText() {
        return confirmationDialogText;
    }

    public void setConfirmationDialogText(SerializedName confirmationDialogText) {
        this.confirmationDialogText = confirmationDialogText;
    }

    public Object getDisclaimerText() {
        return disclaimerText;
    }

    public void setDisclaimerText(Object disclaimerText) {
        this.disclaimerText = disclaimerText;
    }
}
