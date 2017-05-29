package com.linguangyu.coolweather.gson;

/**
 * Created by 光裕 on 2017/5/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
