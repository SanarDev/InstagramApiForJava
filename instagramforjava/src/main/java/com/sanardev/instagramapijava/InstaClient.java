package com.sanardev.instagramapijava;

import android.content.Context;

import com.sanardev.instagramapijava.model.login.IGLoggedUser;
import com.sanardev.instagramapijava.processor.AccountProcessor;
import com.sanardev.instagramapijava.processor.CommentProcessor;
import com.sanardev.instagramapijava.processor.DirectProcessor;
import com.sanardev.instagramapijava.processor.MediaProcessor;
import com.sanardev.instagramapijava.processor.StoryProcessor;
import com.sanardev.instagramapijava.processor.UserProcessor;
import com.sanardev.instagramapijava.utils.StorageUtils;

public class InstaClient {

    public final AccountProcessor accountProcessor;
    public final StoryProcessor storyProcessor;
    public final CommentProcessor commentProcessor;
    public final MediaProcessor mediaProcessor;
    public final UserProcessor userProcessor;
    public final DirectProcessor directProcessor;
    private IGRequest igRequest;


    public InstaClient(Context context,String username,String password){
        this.igRequest = new IGRequest(context,username,password);
        this.accountProcessor = new AccountProcessor(igRequest);
        this.storyProcessor = new StoryProcessor(igRequest);
        this.commentProcessor = new CommentProcessor(igRequest);
        this.mediaProcessor = new MediaProcessor(igRequest);
        this.userProcessor = new UserProcessor(igRequest);
        this.directProcessor = new DirectProcessor(igRequest);
    }

    public IGLoggedUser getLoggedUser(){
        return igRequest.getLoggedUser();
    }
}
