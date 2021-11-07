package com.codershil.socialgram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codershil.socialgram.R;
import com.codershil.socialgram.models.PostModel;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private ArrayList<PostModel> postList;
    private Context context;

    public PostAdapter(ArrayList<PostModel> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostModel postModel = postList.get(position);
        holder.imgProfile.setImageResource(postModel.getImgProfile());
        holder.imgPost.setImageResource(postModel.getImgPost());
        holder.txtAbout.setText(postModel.getUserAbout());
        holder.txtName.setText(postModel.getUserName());
        holder.txtLike.setText(postModel.getNoOfLikes());
        holder.txtComment.setText(postModel.getNoOfComments());
        holder.txtShare.setText(postModel.getNoOfShares());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile, imgPost, imgSavePost;
        TextView txtName, txtAbout, txtLike, txtComment, txtShare;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            imgPost = itemView.findViewById(R.id.imgPost);
            imgSavePost = itemView.findViewById(R.id.imgSavePost);
            txtName = itemView.findViewById(R.id.txtUserName);
            txtAbout = itemView.findViewById(R.id.txtAbout);
            txtLike = itemView.findViewById(R.id.txtLike);
            txtComment = itemView.findViewById(R.id.txtComment);
            txtShare = itemView.findViewById(R.id.txtShare);
        }
    }
}
