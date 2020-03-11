
package com.eurofins.testapp.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;


public class WeatherForecast {

    @SerializedName("Date")
    private Date mDate;
    @SerializedName("Summary")
    private String mSummary;
    @SerializedName("TemperatureC")
    private Long mTemperatureC;
    @SerializedName("TemperatureF")
    private Long mTemperatureF;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public Long getTemperatureC() {
        return mTemperatureC;
    }

    public void setTemperatureC(Long temperatureC) {
        mTemperatureC = temperatureC;
    }

    public Long getTemperatureF() {
        return mTemperatureF;
    }

    public void setTemperatureF(Long temperatureF) {
        mTemperatureF = temperatureF;
    }

}
