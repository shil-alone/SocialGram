package com.codershil.socialgram.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codershil.socialgram.R;
import com.codershil.socialgram.models.FriendModel;

import java.util.ArrayList;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder> {

    Context context;
    ArrayList<FriendModel> friendsList;
    public FriendsAdapter(Context context, ArrayList<FriendModel> friendsList){
        this.context = context;
        this.friendsList = friendsList;
    }
    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_item,parent,false);
        return new FriendsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder holder, int position) {
        FriendModel friendModel = friendsList.get(position);
        holder.imgFriendProfile.setImageResource(friendModel.getFriendProfileImage());
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }

    public class FriendsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgFriendProfile;
        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFriendProfile = itemView.findViewById(R.id.imgFriendProfile);
        }

    }
}
