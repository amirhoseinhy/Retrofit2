package com.niksan.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostResponce {

    @SerializedName("posts")
    private List<Post> posts;
    public List<Post> getPosts() {
        return posts;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


}
