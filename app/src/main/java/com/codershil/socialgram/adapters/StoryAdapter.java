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
import com.codershil.socialgram.models.StoryModel;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    ArrayList<StoryModel> list;
    Context context;

    public StoryAdapter(ArrayList<StoryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_item,parent,false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        StoryModel model = list.get(position);
        holder.storyImage.setImageResource(model.getStoryImage());
        holder.profileImage.setImageResource(model.getProfileImage());
        holder.storyType.setImageResource(model.getStoryType());
        holder.txtName.setText(model.getTxtName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder {
        ImageView storyImage, profileImage, storyType;
        TextView txtName;

        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            storyImage = itemView.findViewById(R.id.storyImage);
            profileImage = itemView.findViewById(R.id.imgProfile);
            storyType = itemView.findViewById(R.id.storyType);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
