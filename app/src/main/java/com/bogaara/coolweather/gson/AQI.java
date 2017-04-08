package com.bogaara.coolweather.gson;

/**
 * Created by donghong on 17/4/6.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
