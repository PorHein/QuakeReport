package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeInMiliseconds;

    private String mUrl;

    public Earthquake(double magnitude,String location,long timeInMiliseconds,String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMiliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMiliseconds() {
        return mTimeInMiliseconds;
    }

    public String getUrl(){
        return mUrl;
    }
}
