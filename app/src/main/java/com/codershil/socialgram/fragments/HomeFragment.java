package com.codershil.socialgram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codershil.socialgram.R;
import com.codershil.socialgram.adapters.PostAdapter;
import com.codershil.socialgram.adapters.StoryAdapter;
import com.codershil.socialgram.models.PostModel;
import com.codershil.socialgram.models.StoryModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private RecyclerView storyRecyclerView, postRecyclerView;
    private ArrayList<StoryModel> storyList = new ArrayList<>();
    private ArrayList<PostModel> postList = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        storyRecyclerView = view.findViewById(R.id.storyRV);
        postRecyclerView = view.findViewById(R.id.postRV);
        storyList.add(new StoryModel(R.drawable.boy,R.drawable.ic_profile,R.drawable.live,"Shil Alone"));
        storyList.add(new StoryModel(R.drawable.black_shade,R.drawable.ic_profile,R.drawable.live,"Vinay Lokhande"));
        storyList.add(new StoryModel(R.drawable.boy,R.drawable.ic_profile,R.drawable.live,"Shubham Malvi"));
        storyList.add(new StoryModel(R.drawable.black_shade,R.drawable.ic_profile,R.drawable.live,"Ritik Kanhekar"));
        storyList.add(new StoryModel(R.drawable.boy,R.drawable.ic_profile,R.drawable.live,"Ajay Meshram"));

        StoryAdapter storyAdapter = new StoryAdapter(storyList,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        storyRecyclerView.setLayoutManager(linearLayoutManager);
        storyRecyclerView.setNestedScrollingEnabled(false);
        storyRecyclerView.setAdapter(storyAdapter);

        postList.add(new PostModel(R.drawable.ic_profile, R.drawable.boy, "Shil Alone","Traveler, Life Lover","235","632","32"));
        postList.add(new PostModel(R.drawable.ic_profile, R.drawable.boy, "Ajay Mesharam","Traveler, Life Lover","235","632","32"));
        postList.add(new PostModel(R.drawable.ic_profile, R.drawable.boy, "Shil Alone","Traveler, Life Lover","235","632","32"));
        postList.add(new PostModel(R.drawable.ic_profile, R.drawable.boy, "Shil Alone","Traveler, Life Lover","235","632","32"));
        postList.add(new PostModel(R.drawable.ic_profile, R.drawable.boy, "Shil Alone","Traveler, Life Lover","235","632","32"));
        postList.add(new PostModel(R.drawable.ic_profile, R.drawable.boy, "Shil Alone","Traveler, Life Lover","235","632","32"));

        PostAdapter postAdapter = new PostAdapter(postList,getContext());
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        postRecyclerView.setLayoutManager(linearLayoutManager1);
        postRecyclerView.setNestedScrollingEnabled(false);
        postRecyclerView.setAdapter(postAdapter);

        return view;
    }
}