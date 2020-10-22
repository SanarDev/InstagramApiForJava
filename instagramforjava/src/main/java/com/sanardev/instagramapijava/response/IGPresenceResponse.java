package com.sanardev.instagramapijava.response;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class IGPresenceResponse extends BaseResponse{

    @SerializedName("user_presence")
    private HashMap<String,HashMap<String,Object>> userPresence;

    public HashMap<String, HashMap<String, Object>> getUserPresence() {
        return userPresence;
    }

    public void setUserPresence(HashMap<String, HashMap<String, Object>> userPresence) {
        this.userPresence = userPresence;
    }
}
