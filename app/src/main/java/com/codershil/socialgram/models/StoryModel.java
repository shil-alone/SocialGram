package com.codershil.socialgram.models;

import android.widget.ImageView;
import android.widget.TextView;

public class StoryModel {
    private int storyImage,profileImage,storyType;
    private String txtName;

    public StoryModel() {
    }

    public StoryModel(int storyImage, int profileImage, int storyType, String txtName) {
        this.storyImage = storyImage;
        this.profileImage = profileImage;
        this.storyType = storyType;
        this.txtName = txtName;
    }

    public int getStoryImage() {
        return storyImage;
    }

    public void setStoryImage(int storyImage) {
        this.storyImage = storyImage;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }
}
