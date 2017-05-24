package com.example.android.quakereport;

import java.net.URL;

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
        mLocation = location;
        mUrl = url;
    }

    public Double getMagnitude(){return mMagnitude;}
    public String getLocation (){return mLocation;}
    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
    public String getUrl(){return mUrl;}


}
