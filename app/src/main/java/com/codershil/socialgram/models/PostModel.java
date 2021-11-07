package com.codershil.socialgram.models;

public class PostModel {
    private int imgProfile, imgPost;
    private String userName, userAbout, noOfComments, noOfLikes, noOfShares;

    public PostModel(int imgProfile, int imgPost, String userName, String userAbout, String noOfComments, String noOfLikes, String noOfShares) {
        this.imgProfile = imgProfile;
        this.imgPost = imgPost;
        this.userName = userName;
        this.userAbout = userAbout;
        this.noOfComments = noOfComments;
        this.noOfLikes = noOfLikes;
        this.noOfShares = noOfShares;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public int getImgPost() {
        return imgPost;
    }

    public void setImgPost(int imgPost) {
        this.imgPost = imgPost;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(String userAbout) {
        this.userAbout = userAbout;
    }

    public String getNoOfComments() {
        return noOfComments;
    }

    public void setNoOfComments(String noOfComments) {
        this.noOfComments = noOfComments;
    }

    public String getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(String noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public String getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(String noOfShares) {
        this.noOfShares = noOfShares;
    }
}
