package com.linguangyu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 光裕 on 2017/5/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
