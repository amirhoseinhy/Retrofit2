package com.niksan.retrofit.webservice;

import com.niksan.retrofit.model.Post;
import com.niksan.retrofit.model.PostResponce;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("db")
    Call<PostResponce> getPosts();

}
