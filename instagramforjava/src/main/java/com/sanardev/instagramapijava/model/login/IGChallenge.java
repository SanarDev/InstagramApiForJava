package com.sanardev.instagramapijava.model.login;

import com.google.gson.annotations.SerializedName;

public class IGChallenge {

    @SerializedName("url")
    private Object url;
    @SerializedName("api_path")
    private Object apiPath;
    @SerializedName("hide_webview_header")
    private boolean hideWebviewHeader;
    @SerializedName("lock")
    private boolean lock;
    @SerializedName("logout")
    private boolean logout;
    @SerializedName("native_flow")
    private boolean nativeFlow;

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Object getApiPath() {
        return apiPath;
    }

    public void setApiPath(Object apiPath) {
        this.apiPath = apiPath;
    }

    public boolean isHideWebviewHeader() {
        return hideWebviewHeader;
    }

    public void setHideWebviewHeader(boolean hideWebviewHeader) {
        this.hideWebviewHeader = hideWebviewHeader;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public boolean isLogout() {
        return logout;
    }

    public void setLogout(boolean logout) {
        this.logout = logout;
    }

    public boolean isNativeFlow() {
        return nativeFlow;
    }

    public void setNativeFlow(boolean nativeFlow) {
        this.nativeFlow = nativeFlow;
    }
}
