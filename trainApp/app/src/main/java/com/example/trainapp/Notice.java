package com.example.trainapp;

public class Notices {

    protected String Headline;
    protected String Detail;
    protected String timestamp;




    public Notices(String Headline, String Detail, String timestamp) {
        this.Headline = Headline;
        this.Detail = Detail;
        this.timestamp = timestamp;
    }

    public String getHeadline() {
        return Headline;
    }

    public String getDetail() {
        return Detail;
    }

    public String getTimestamp() {
        return timestamp;
    }

}
