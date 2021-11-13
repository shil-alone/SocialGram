package com.codershil.socialgram.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codershil.socialgram.R;
import com.codershil.socialgram.adapters.NotificationAdapter;
import com.codershil.socialgram.models.NotificationModel;

import java.util.ArrayList;

public class Notification2Fragment extends Fragment {
    private RecyclerView notificationRV;
    private ArrayList<NotificationModel> notificationList = new ArrayList<>();
    public Notification2Fragment() {
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
        View view =  inflater.inflate(R.layout.fragment_notification2, container, false);
        notificationRV = view.findViewById(R.id.notification2RV);

        notificationList.add(new NotificationModel(R.drawable.boy,"<b>Harsh</b> commented on your post","Just Now"));
        notificationList.add(new NotificationModel(R.drawable.boy,"<b>Kanya</b> commented on your post","Just Now"));
        notificationList.add(new NotificationModel(R.drawable.boy,"<b>Langdya</b> commented on your post","Just Now"));
        notificationList.add(new NotificationModel(R.drawable.boy,"<b>Shil</b> commented on your post","Just Now"));
        notificationList.add(new NotificationModel(R.drawable.boy,"<b>Harsh</b> commented on your post","Just Now"));

        NotificationAdapter notificationAdapter = new NotificationAdapter(getContext(),notificationList);
        notificationRV.setLayoutManager(new LinearLayoutManager(getContext()));
        notificationRV.setAdapter(notificationAdapter);

        return view;
    }
}