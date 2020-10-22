package com.sanardev.instagramapijava.model.login;

import com.google.gson.annotations.SerializedName;

public class PhoneVerificationSettings {

    @SerializedName("max_sms_count")
    private int maxSmsCount;
    @SerializedName("resend_sms_delay_sec")
    private int resendSmsDelaySec;
    @SerializedName("robocall_count_down_time_sec")
    private int robocallCountDownTimeSec;
    @SerializedName("robocall_after_max_sms")
    private boolean robocallAfterMaxSms;

    public int getMaxSmsCount() {
        return maxSmsCount;
    }

    public void setMaxSmsCount(int maxSmsCount) {
        this.maxSmsCount = maxSmsCount;
    }

    public int getResendSmsDelaySec() {
        return resendSmsDelaySec;
    }

    public void setResendSmsDelaySec(int resendSmsDelaySec) {
        this.resendSmsDelaySec = resendSmsDelaySec;
    }

    public int getRobocallCountDownTimeSec() {
        return robocallCountDownTimeSec;
    }

    public void setRobocallCountDownTimeSec(int robocallCountDownTimeSec) {
        this.robocallCountDownTimeSec = robocallCountDownTimeSec;
    }

    public boolean isRobocallAfterMaxSms() {
        return robocallAfterMaxSms;
    }

    public void setRobocallAfterMaxSms(boolean robocallAfterMaxSms) {
        this.robocallAfterMaxSms = robocallAfterMaxSms;
    }
}
