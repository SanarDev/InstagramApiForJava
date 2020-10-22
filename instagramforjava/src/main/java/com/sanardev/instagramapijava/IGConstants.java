package com.sanardev.instagramapijava;

public class IGConstants {

    public static final String APP_VERSION = "130.0.0.31.121";
    public static final String APP_ID = "567310203415052";
    public static final String API_SIGN_KEY_VERSION = "4";
    public static final String DEVICE_CAPABILITIES = "3brTvwM=";
    public static final String LOCALE = "en_US";
    public static final String BLOKS_VERSION_ID = "0e9b6d9c0fb2a2df4862cd7f46e3f719c55e9f90c20db0e5d95791b66f43b367";
    public static final String API_KEY = "f0bdfd5332d66a64d5e04965e6a7ade67c4e2cfc57ea38f0083c0400640a5e20";


     // Headers
    public static final String X_DEVICE_ID = "X-DEVICE-ID";
    public static final String X_IG_APP_LOCALE = "X-IG-App-Locale";
    public static final String X_IG_DEVICE_LOCALE = "X-IG-Device-Locale";
    public static final String X_IG_MAPPED_LOCALE = "X-IG-Mapped-Locale";
    public static final String X_PIGEON_SESSION_ID = "X-Pigeon-Session-Id";
    public static final String X_PIGEON_RAWCLIENT_TIEM = "X-Pigeon-Rawclienttime";
    public static final String X_IG_CONNECTION_SPEED = "X-IG-Connection-Speed";
    public static final String X_IG_BANDWIDTH_SPEED_KBPS = "X-IG-Bandwidth-Speed-KBPS";
    public static final String X_IG_BANDWIDTH_TOTALBYTES_B = "X-IG-Bandwidth-TotalBytes-B";
    public static final String X_IG_BAND_WIDTH_TOTALTIME_MS = "X-IG-Bandwidth-TotalTime-MS";
    public static final String X_IG_APP_STARTUP_COUNTRY = "X-IG-App-Startup-Country";
    public static final String X_BLOKS_VERSION_ID = "X-Bloks-Version-Id";
    public static final String X_IG_WWW_CLAIM = "X-IG-WWW-Claim";
    public static final String X_BLOKS_IS_LAYOUT_RTL = "X-Bloks-Is-Layout-RTL";
    public static final String X_BLOKS_ENABLE_RENDER_CORE = "X-Bloks-Enable-RenderCore";
    public static final String X_IG_DEVICE_ID = "X-IG-Device-ID";
    public static final String X_IG_ANDROID_ID = "X-IG-Android-ID";
    public static final String X_IG_CONNECTION_TYPE = "X-IG-Connection-Type";
    public static final String X_IG_CAPABILITIES = "X-IG-Capabilities";
    public static final String X_IG_APP_ID = "X-IG-App-ID";
    public static final String X_USER_AGENT = "User-Agent";
    public static final String ACCEPT_LANGUAGE = "Accept-Language";
    public static final String COOKIE = "Cookie";
    public static final String ACCEPT = "Accept";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String HOST = "Host";
    public static final String X_FB_HTTP_ENGINE = "X-FB-HTTP-Engine";
    public static final String CONNECTION = "Connection";
    public static final String X_MID = "x-mid";

    public static final String X_INSTAGRAM_RUPLOAD_PARAMS = "X-Instagram-Rupload-Params";
    public static final String X_FB_VIDEO_WATERFALL_ID = "X_FB_VIDEO_WATERFALL_ID";
    public static final String X_ENTITY_LENGTH = "X-Entity-Length";
    public static final String X_ENTITY_NAME = "X-Entity-Name";
    public static final String X_ENTITY_TYPE = "X-Entity-Type";
    public static final String OFFSET = "Offset";
    public static final String ACCEPT_ENCODING = "Accept-Encoding";

    public static final String CSRFTOKEN = "csrftoken";
    public static final String MID = "mid";

    public static final String XSHAREING_USER_IDS = "xsharing_user_ids";
    public static final String IS_DIRECT_VOICE = "is_direct_voice";
    public static final String UPLOAD_MEDIA_DURATION_MS = "upload_media_duration_ms";
    public static final String UPLOAD_ID = "upload_id";
    public static final String RETRY_CONTEXT = "retry_context";
    public static final String MEDIA_TYPE = "media_type";
    public static final String GZIP = "gzip";
    public static final String OCTET_STREAM_TYPE = "application/octet-stream";

    public static final String IMAGE_COMPRESSION = "image_compression";

    public static final String BASE_API_URL = "https://i.instagram.com/";
    public static final String API_PREFIX = "api/v1/";

    public static final String IG_SET_PASSWORD_ENCRYPTION_PUB_KEY = "ig-set-password-encryption-pub-key";
    public static final String IG_SET_PASSWORD_ENCRYPTION_KEY_ID = "ig-set-password-encryption-key-id";

    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    public static final int MEDIA_TYPE_CAROUSEL_MEDIA = 8;
    public static final String DIRECT_V2 = "direct_v2";
    public static final String ROTATE = "rotate";
    public static final String UPLOAD_MEDIA_WIDTH = "upload_media_width";
    public static final String UPLOAD_MEDIA_HEIGHT = "upload_media_height";
    public static final String HFLIP = "hflip";

    public static final String STATUS_FAIL = "fail";
    public static final String STATUS_SUCCESS = "ok";

    public static class Errors{
        public static final String LOGIN_BAD_PASSWORD = "bad_password";
        public static final String LOGIN_TOO_MANY_TRIED = "rate_limit_error";
        public static final String LOGIN_REQUIRE_TWO_STEP_AUTH = "require_two_step_auth";
        public static final String LOGIN_INVALID_SMS_CODE = "sms_code_validation_code_invalid";
    }
}
