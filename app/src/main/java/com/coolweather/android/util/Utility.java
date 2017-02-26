package com.coolweather.android.util;

import android.text.TextUtils;
import android.util.Log;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by lu on 2017/2/25.
 */

public class Utility {
    public static boolean handleProvinceResponce(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0 ; i<allProvince.length();i++){
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                }

                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponce(String responce,int provinceId){
        if (!TextUtils.isEmpty(responce)){
            try{
                JSONArray allCity = new JSONArray(responce);
                for (int i = 0;i < allCity.length();i++){
                    JSONObject cityObject  = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();

                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponce(String responce,int cityId){
        if (!TextUtils.isEmpty(responce)){
            try{
                JSONArray allCounty = new JSONArray(responce);
                for (int i = 0;i < allCounty.length();i++){
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCityId(cityId);
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.save();
                    Log.d("queryCounties",i+"");
                }
                Log.d("handleCounty","true");
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
