package com.sanardev.instagramapijava.model.direct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class PrevCursor {

    @SerializedName("cursor_timestamp_seconds")
    @Expose
    private BigInteger cursorTimestampSeconds;
    @SerializedName("cursor_thread_v2_id")
    @Expose
    private BigInteger cursorThreadV2Id;

    public BigInteger getCursorTimestampSeconds() {
        return cursorTimestampSeconds;
    }

    public void setCursorTimestampSeconds(BigInteger cursorTimestampSeconds) {
        this.cursorTimestampSeconds = cursorTimestampSeconds;
    }

    public BigInteger getCursorThreadV2Id() {
        return cursorThreadV2Id;
    }

    public void setCursorThreadV2Id(BigInteger cursorThreadV2Id) {
        this.cursorThreadV2Id = cursorThreadV2Id;
    }
}
