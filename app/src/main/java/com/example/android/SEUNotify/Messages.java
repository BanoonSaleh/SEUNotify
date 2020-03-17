package com.example.android.SEUNotify;

public class Messages {
    private String title;
    private String bodyMessage;
    private  String datePublish;
    private String photoUrl;

public  Messages (){
}
    public Messages(String title, String textMessage, String datePublish, String photoUrl) {
        this.title = title;
        this.bodyMessage = textMessage;
        this.datePublish = datePublish;
        this.photoUrl = photoUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getTextMessage() { return bodyMessage; }

    public String getDatePublish() { return datePublish; }

    public String getPhotoUrl() { return photoUrl; }

    public  void setDatePublish(String date) { this.datePublish = date ; }

    public void setTextMessage(String name) {
        this.bodyMessage = name;
    }

    public void setTitle(String text) { this.title = text; }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}

