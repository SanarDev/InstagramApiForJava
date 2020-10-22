package com.sanardev.instagramapijava.model.direct.messagetype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FbUserTags {


    @SerializedName("in")
    @Expose
    private List<Object> in = null;

    public List<Object> getIn() {
        return in;
    }

    public void setIn(List<Object> in) {
        this.in = in;
    }
}
