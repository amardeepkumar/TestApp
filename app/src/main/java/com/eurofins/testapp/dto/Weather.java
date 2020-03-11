
package com.eurofins.testapp.dto;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Weather {

    @SerializedName("WeatherForecasts")
    private List<WeatherForecast> mWeatherForecasts;

    public List<WeatherForecast> getWeatherForecasts() {
        return mWeatherForecasts;
    }

    public void setWeatherForecasts(List<WeatherForecast> weatherForecasts) {
        mWeatherForecasts = weatherForecasts;
    }

}
