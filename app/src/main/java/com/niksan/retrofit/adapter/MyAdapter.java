package com.niksan.retrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.niksan.retrofit.R;
import com.niksan.retrofit.model.Post;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

   private Context context;
   private List<Post> posts;

    public MyAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.txtId.setText((String.valueOf(posts.get(i).getId())));
        viewHolder.txtTitle.setText((posts.get(i).getTitle()));

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       // LinearLayout linearLayout;
        TextView txtId, txtTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            txtId = itemView.findViewById(R.id.txtId);
            txtTitle = itemView.findViewById(R.id.txtTitle);
           // linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
