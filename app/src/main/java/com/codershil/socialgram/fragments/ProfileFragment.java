package com.codershil.socialgram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codershil.socialgram.R;
import com.codershil.socialgram.adapters.FriendsAdapter;
import com.codershil.socialgram.models.FriendModel;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private RecyclerView friendsRecyclerView;
    private ArrayList<FriendModel> friendsList = new ArrayList<>();

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        friendsRecyclerView = view.findViewById(R.id.friendsRV);

        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));
        friendsList.add(new FriendModel(R.drawable.boy));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        friendsRecyclerView.setLayoutManager(linearLayoutManager);
        FriendsAdapter friendsAdapter = new FriendsAdapter(getContext(),friendsList);
        friendsRecyclerView.setAdapter(friendsAdapter);



        // Inflate the layout for this fragment
        return view;
    }
}