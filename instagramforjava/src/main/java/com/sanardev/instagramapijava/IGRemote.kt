package com.sanardev.instagramapijava

import com.sanardev.instagramapijava.model.user.User
import com.sanardev.instagramapijava.response.*
import io.reactivex.Observable
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface IGRemote {

    @GET("/")
    fun getCsrfToken(): Observable<Response<ResponseBody>>

    @POST(IGConstants.API_PREFIX + "accounts/login/")
    fun login(
        @HeaderMap header: Map<String, String>,
        @Body payload: RequestBody
    ): Observable<Response<IGLoginResponse>>

    @POST(IGConstants.API_PREFIX + "accounts/two_factor_login/")
    fun twoFactorLogin(
        @HeaderMap header: Map<String, String>,
        @Body payload: RequestBody
    ): Observable<Response<IGLoginResponse>>

    @POST(IGConstants.API_PREFIX + "accounts/logout/")
    fun logout(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGLogoutResponse>

    @POST(IGConstants.API_PREFIX + "media/{media_id}/comment_like/")
    fun likeComment(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Body requestBody: RequestBody
    ): Observable<ResponseBody>

    @POST(IGConstants.API_PREFIX + "media/{media_id}/comment_unlike/")
    fun unlikeComment(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Body requestBody: RequestBody
    ): Observable<ResponseBody>

    @POST(IGConstants.API_PREFIX + "feed/timeline/")
    fun getTimelinePosts(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGTimeLinePostsResponse>

    @GET(IGConstants.API_PREFIX + "users/{user_id}/info/")
    fun getUserInfo(
        @HeaderMap header: Map<String, String>,
        @Path("user_id") userId: Long
    ): Observable<IGUserInfoResponse>

    @GET(IGConstants.API_PREFIX + "accounts/current_user/")
    fun getCurrentUser(
        @HeaderMap header: Map<String, String>,
        @Query("edit") wantToEdit: Boolean = true
    ): Observable<IGCurrentUserResponse>

    @POST(IGConstants.API_PREFIX + "accounts/edit_profile/")
    fun editProfile(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGCurrentUserResponse>

    @GET("rupload_igphoto/{upload_name}/")
    fun getMediaImageUploadUrl(
        @HeaderMap header: Map<String, String>,
        @Path("upload_name") uploadName: String
    ): Observable<ResponseBody>

    @POST("rupload_igphoto/{upload_name}/")
    fun uploadMediaImage(
        @HeaderMap header: Map<String, String>,
        @Path("upload_name") uploadName: String,
        @Body mediaRequestBody: RequestBody
    ): Observable<IGUploadImageResponse>


    @GET("rupload_igvideo/{upload_name}")
    fun getMediaUploadUrl(
        @HeaderMap header: Map<String, String>,
        @Path("upload_name") uploadName: String
    ): Observable<ResponseBody>

    @POST("rupload_igvideo/{upload_name}")
    fun uploadMedia(
        @HeaderMap header: Map<String, String>,
        @Path("upload_name") uploadName: String,
        @Body mediaRequestBody: RequestBody
    ): Observable<ResponseBody>

    @POST(IGConstants.API_PREFIX + "media/upload_finish/")
    fun uploadFinish(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGUploadFinishResponse>


    @POST(IGConstants.API_PREFIX + "accounts/change_profile_picture/")
    @FormUrlEncoded
    fun changeProfilePicture(
        @HeaderMap header: Map<String, String>,
        @Field("_csrftoken") csrftoken: String,
        @Field("_uuid") uuid: String,
        @Field("use_fbuploader") useFbUploader: Boolean,
        @Field("upload_id") uploadId: String
    ): Observable<User>

    @POST(IGConstants.API_PREFIX + "accounts/set_public/")
    fun setAccountPublic(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<User>

    @POST(IGConstants.API_PREFIX + "accounts/set_private/")
    fun setAccountPrivate(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<User>

    @POST(IGConstants.API_PREFIX + "accounts/change_password/")
    fun changeAccountPassword(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<ResponseBody>

    @POST(IGConstants.API_PREFIX + "media/{media_id}/like/")
    fun likePost(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Body requestBody: RequestBody
    ): Observable<IGLikePostResponse>

    @POST(IGConstants.API_PREFIX + "media/{media_id}/unlike/")
    fun unlikePost(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Body requestBody: RequestBody
    ): Observable<IGUnlikePostResponse>

    @GET(IGConstants.API_PREFIX + "media/{media_id}/comments/")
    fun getPostComments(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Query("inventory_source") inventorySource: String = "media_or_ad",
        @Query("carousel_index") carouselIndex: Int = 1,
        @Query("analytics_module") analyticsModule: String = "comments_v2",
        @Query("can_support_threading") canSupportThreading: Boolean = true,
        @Query("is_carousel_bumped_post") isCarouselBumpedPost: Boolean = true
    ): Observable<IGCommentsResponse>

    @GET(IGConstants.API_PREFIX + "media/{media_id}/comments/")
    fun loadMorePostComments(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Query("min_id") minId: String,
        @Query("inventory_source") inventorySource: String = "user_connected",
        @Query("analytics_module") analyticsModule: String = "comments_v2",
        @Query("can_support_threading") canSupportThreading: Boolean = true,
        @Query("is_carousel_bumped_post") isCarouselBumpedPost: Boolean = true
    ): Observable<IGCommentsResponse>

    @POST(IGConstants.API_PREFIX + "friendships/destroy/{userId}")
    fun unfollow(
        @HeaderMap header: Map<String, String>,
        @Path("userId") userId: Long,
        @Body requestBody: RequestBody
    ): Observable<IGUnfollowResponse>

    @POST(IGConstants.API_PREFIX + "friendships/create/{userId}")
    fun follow(
        @HeaderMap header: Map<String, String>,
        @Path("userId") userId: Long,
        @Body requestBody: RequestBody
    ): Observable<IGFollowResponse>

    @POST(IGConstants.API_PREFIX + "media/{media_id}/comment/")
    fun sendComment(
        @HeaderMap header: Map<String, String>,
        @Path("media_id") mediaId: String,
        @Body requestBody: RequestBody
    ): Observable<IGSendCommentResponse>

    @POST(IGConstants.API_PREFIX + "feed/reels_tray/")
    fun getTimelineStory(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGTimeLineStoryResponse>

    @POST(IGConstants.API_PREFIX + "feed/reels_media/")
    fun getStoryMedia(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGStoryMediaResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/reel_react/")
    fun sendStoryReaction(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGSendStoryReactionResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/reel_share/")
    fun sendStoryReplyMessage(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody,
        @Query("media_type") mediaType: String
    ): Observable<IGStoryReplyResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/media_share/")
    fun shareMedia(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody,
        @Query("media_type") mediaType: String
    ): Observable<IGShareMediaResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/story_share/")
    fun shareStory(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody,
        @Query("media_type") mediaType: String
    ): Observable<IGShareStoryResponse>

    @GET(IGConstants.API_PREFIX + "users/{user_name}/usernameinfo/")
    fun getUsernameInfo(
        @HeaderMap header: Map<String, String>,
        @Path("user_name") userUsername: String,
        @Query("from_module") fromModule: String = "feed_timeline"
    ): Observable<IGUserInfoResponse>

    @GET(IGConstants.API_PREFIX  + "media/{media_id}/info/")
    fun getMediaById(@HeaderMap header: Map<String, String>,@Path("media_id") mediaId:String):Observable<IGMediaResponse>

    @GET(IGConstants.API_PREFIX + "direct_v2/inbox/")
    fun getDirectIndex(
        @HeaderMap header: Map<String, String>,
        @Query("visual_message_return_type") visualMessageReturnType: String = "unseen",
        @Query("thread_message_limit") threadMessageLimit: Int = 20,
        @Query("persistentBadging") persistentBadging: Boolean = true,
        @Query("limit") limit: Int = 20
    ): Observable<IGDirectsResponse>

    @GET(IGConstants.API_PREFIX + "direct_v2/inbox/")
    fun loadMoreDirects(
        @HeaderMap header: Map<String, String>,
        @Query("visual_message_return_type") visualMessageReturnType: String = "unseen",
        @Query("cursor") cursor: String,
        @Query("direction") direction: String = "older",
        @Query("seq_id") seqId: Int,
        @Query("thread_message_limit") threadMessageLimit: Int = 10,
        @Query("persistentBadging") persistentBadging:Boolean = true,
        @Query("limit") limit:Int=10
    ):Observable<IGDirectsResponse>


    @GET(IGConstants.API_PREFIX + "direct_v2/threads/{threadId}/")
    fun getDirectChats(
        @HeaderMap header: Map<String, String>,
        @Path("threadId") threadId: String,
        @Query("visual_message_return_type") visualMessageReturnType: String = "unseen",
        @Query("limit") limit: Int = 10,
        @Query("seq_id") seqID: Int = 0
    ): Observable<IGDirectChatResponse>

    @GET(IGConstants.API_PREFIX + "direct_v2/threads/{threadId}/")
    fun loadMoreDirectChats(
        @HeaderMap header: Map<String, String>,
        @Path("threadId") threadId: String,
        @Query("visual_message_return_type") visualMessageReturnType: String = "unseen",
        @Query("direction") direction: String = "older",
        @Query("cursor") cursor: String,
        @Query("limit") limit: Int = 20,
        @Query("seq_id") seqID: Int = 0
    ): Observable<IGDirectChatResponse>

    @GET(IGConstants.API_PREFIX + "direct_v2/get_presence/")
    fun getDirectPresence(@HeaderMap header: Map<String, String>): Observable<IGPresenceResponse>

    @GET(IGConstants.API_PREFIX + "users/search/")
    fun searchUser(
        @HeaderMap header: Map<String, String>,
        @Query("search_surface") searchSurface: String = "user_search_page",
        @Query("timezone_offset") timeZoneOffset: Int = 16200,
        @Query("count") count: Int = 30,
        @Query("q") query: String
    ): Observable<ResponseBody>

    @GET(IGConstants.API_PREFIX + "direct_v2/ranked_recipients/")
    fun getRecipients(
        @HeaderMap header: Map<String, String>,
        @Query("mode") mode: String = "raven",
        @Query("show_threads") showThreads: Boolean = true
    ): Observable<IGRecipientsResponse>

    @GET(IGConstants.API_PREFIX + "direct_v2/ranked_recipients/")
    fun searchRecipients(
        @HeaderMap header: Map<String, String>,
        @Query("mode") mode: String = "raven",
        @Query("show_threads") showThreads: Boolean = true,
        @Query("query") query: String
    ): Observable<IGRecipientsResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/reaction/")
    fun sendReaction(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGDirectActionResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/{thread_id}/items/{item_id}/seen/")
    fun markAsSeen(
        @HeaderMap header: Map<String, String>,
        @Path("thread_id") threadId: String,
        @Path("item_id") itemId: String,
        @Body requestBody: RequestBody
    ): Observable<IGDirectActionResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/visual_threads/{thread_id}/item_seen/")
    fun markAsSeenRavenMedia(
        @HeaderMap header: Map<String, String>,
        @Path("thread_id") threadId: String,
        @Body requestBody: RequestBody
    ): Observable<ResponseBody>


    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/configure_video/")
    fun sendDirectMediaVideo(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGDirectActionResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/configure_photo/")
    fun sendDirectMediaImage(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGDirectActionResponse>

    @POST(IGConstants.API_PREFIX + "direct_v2/threads/broadcast/share_voice/")
    fun sendDirectMediaVoice(
        @HeaderMap header: Map<String, String>,
        @Body requestBody: RequestBody
    ): Observable<IGDirectActionResponse>
}
