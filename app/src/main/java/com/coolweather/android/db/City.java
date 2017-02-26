package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lu on 2017/2/25.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int provinceId;
    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int proviceId) {
        this.provinceId = proviceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
