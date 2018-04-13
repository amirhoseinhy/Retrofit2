package com.niksan.retrofit.webservice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;
    public static final String BASE_URL = "https://my-json-server.typicode.com/typicode/demo/";
    public static Retrofit getClient(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder().
                           baseUrl(BASE_URL).
                           addConverterFactory(GsonConverterFactory.create()).
                           build();
        }
        return retrofit;
    }

}
