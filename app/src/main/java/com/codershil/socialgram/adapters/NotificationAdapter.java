package com.codershil.socialgram.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codershil.socialgram.R;
import com.codershil.socialgram.models.NotificationModel;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {
    private Context context;
    private ArrayList<NotificationModel> notificationsList;

    public NotificationAdapter(Context context, ArrayList<NotificationModel> notificationsList) {
        this.context = context;
        this.notificationsList = notificationsList;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification2_item,parent,false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        NotificationModel notificationModel = notificationsList.get(position);
        holder.notificationProfileImage.setImageResource(notificationModel.getProfileImage());
        holder.txtNotification.setText(Html.fromHtml(notificationModel.getNotificationText()));
        holder.txtNotificationTime.setText(notificationModel.getNotificationTime());
    }

    @Override
    public int getItemCount() {
        return notificationsList.size();
    }

    public class NotificationViewHolder extends RecyclerView.ViewHolder{
        ImageView notificationProfileImage;
        TextView txtNotification,txtNotificationTime;
        public NotificationViewHolder(@NonNull View itemView) {
            super(itemView);
            notificationProfileImage = itemView.findViewById(R.id.imgNotificationProfile);
            txtNotification = itemView.findViewById(R.id.txtNotification);
            txtNotificationTime  = itemView.findViewById(R.id.txtNotificationTime);
        }
    }

}
