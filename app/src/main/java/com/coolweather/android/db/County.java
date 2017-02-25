package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lu on 2017/2/25.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private int weatherCode;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
