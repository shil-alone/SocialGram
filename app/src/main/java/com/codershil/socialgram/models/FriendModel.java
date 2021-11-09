package com.codershil.socialgram.models;

public class FriendModel {
    private int friendProfileImage;
    public FriendModel(int friendProfileImage){
        this.friendProfileImage = friendProfileImage;
    }

    public int getFriendProfileImage() {
        return friendProfileImage;
    }

    public void setFriendProfileImage(int friendProfileImage) {
        this.friendProfileImage = friendProfileImage;
    }
}
