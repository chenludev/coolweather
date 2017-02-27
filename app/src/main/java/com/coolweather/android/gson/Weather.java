package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lu on 2017/2/26.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Now now;

    public Suggestion suggestion;

    public AQI aqi;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
