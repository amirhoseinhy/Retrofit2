package com.niksan.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.niksan.retrofit.model.Post;
import com.niksan.retrofit.model.PostResponce;
import com.niksan.retrofit.webservice.APIClient;
import com.niksan.retrofit.webservice.APIInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        APIInterface apiInterface= APIClient.getClient().create(APIInterface.class);
        Call<PostResponce> call = apiInterface.getPosts();
      call.enqueue(new Callback<PostResponce>() {
          @Override
          public void onResponse(Call<PostResponce> call, Response<PostResponce> response) {
              if(response.isSuccessful()){
                  List<Post> posts = response.body().getPosts();
                  for(Post post:posts){
                      Log.i("PPPPPPPPP", String.valueOf(post.getId()));
                      Log.i("PPPPPPPPP", post.getTitle());

                  }
              }
          }

          @Override
          public void onFailure(Call<PostResponce> call, Throwable t) {
              Log.i("PPPPPPPPP", "NOOOOOOOOOOOOO");

          }
      });



    }
}
