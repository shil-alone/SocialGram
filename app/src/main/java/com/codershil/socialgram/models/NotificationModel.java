package com.codershil.socialgram.models;

public class NotificationModel {
    int profileImage;
    String notificationText, notificationTime;

    public NotificationModel(int profileImage, String notificationText, String notificationTime) {
        this.profileImage = profileImage;
        this.notificationText = notificationText;
        this.notificationTime = notificationTime;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }
}
