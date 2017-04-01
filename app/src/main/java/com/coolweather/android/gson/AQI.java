package com.coolweather.android.gson;

/**
 * Created by liu on 2017/3/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
