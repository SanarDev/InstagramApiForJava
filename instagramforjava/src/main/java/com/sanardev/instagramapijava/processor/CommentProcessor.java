package com.sanardev.instagramapijava.processor;

import com.sanardev.instagramapijava.IGRequest;
import com.sanardev.instagramapijava.app.Cookie;
import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.request.IGLikeCommentRequest;
import com.sanardev.instagramapijava.request.IGSendCommentRequest;
import com.sanardev.instagramapijava.request.IGUnLikeCommentRequest;
import com.sanardev.instagramapijava.response.IGCommentsResponse;
import com.sanardev.instagramapijava.response.IGSendCommentResponse;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class CommentProcessor {

    private final IGRequest igRequest;

    public CommentProcessor(IGRequest igRequest){
        this.igRequest = igRequest;
    }
    public Observable<ResponseBody> likeComment(String mediaId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        IGLikeCommentRequest igLikeCommentRequest = new IGLikeCommentRequest();
        Cookie cookie = igRequest.getCookie();
        igLikeCommentRequest.setCsrfToken(cookie.getCsrftoken());
        igLikeCommentRequest.setUid(igRequest.getLoggedUser().getPk());
        igLikeCommentRequest.setUuid(cookie.getAdid());
        igLikeCommentRequest.setCarouselBumpedPost(false);
        igLikeCommentRequest.setContainerModule("feed_timeline");
        igLikeCommentRequest.setFeedPosition(0);
        return igRequest.getRemote().likeComment(igRequest.getHeaders(), mediaId, igRequest.getSignaturePayload(igLikeCommentRequest))
                .subscribeOn(Schedulers.io());
    }
    public Observable<ResponseBody> unlikeComment(String mediaId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        IGUnLikeCommentRequest request = new IGUnLikeCommentRequest();
        Cookie cookie = igRequest.getCookie();
        request.setCsrfToken(cookie.getCsrftoken());
        request.setUid(igRequest.getLoggedUser().getPk());
        request.setUuid(cookie.getAdid());
        request.setCarouselBumpedPost(false);
        request.setContainerModule("feed_timeline");
        request.setFeedPosition(0);
        return igRequest.getRemote().likeComment(igRequest.getHeaders(), mediaId, igRequest.getSignaturePayload(request))
                .subscribeOn(Schedulers.io());
    }

    public Observable<IGCommentsResponse> getPostComments(String mediaId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().getPostComments(igRequest.getHeaders(),mediaId,"media_or_ad",0,"comments_v2",true,true)
                .subscribeOn(Schedulers.io());
    }
    public Observable<IGCommentsResponse> getPostComments(String mediaId,String minId) {
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        return igRequest.getRemote().loadMorePostComments(igRequest.getHeaders(),mediaId,minId,"user_connected","comments_v2",true,true)
                .subscribeOn(Schedulers.io());
    }


    public Observable<IGSendCommentResponse> sendComment(String mediaId, String text){
        if(igRequest.getLoggedUser() == null){
            throw new RuntimeException("You must login first");
        }
        Cookie cookie = igRequest.getCookie();
        IGLoggedUser loggedUser = igRequest.getLoggedUser();
        IGSendCommentRequest sendCommentRequest = new IGSendCommentRequest();
        sendCommentRequest.setFeedPosition(0);
        sendCommentRequest.setContainerModule("comment_v2");
        sendCommentRequest.setCarouselBumpedPost(false);
        sendCommentRequest.setCommentText(text);
        sendCommentRequest.setUuid(cookie.getAdid());
        sendCommentRequest.setUid(loggedUser.getPk());
        sendCommentRequest.setRadioType("wifi-none");
        sendCommentRequest.setCsrftoken(cookie.getCsrftoken());
        sendCommentRequest.setInventorySource("media_or_ad");
        return igRequest.getRemote().sendComment(igRequest.getHeaders(),mediaId,igRequest.getSignaturePayload(sendCommentRequest))
                .subscribeOn(Schedulers.io());
    }

}
