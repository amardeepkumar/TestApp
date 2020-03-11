package com.eurofins.testapp.reposervice;

import com.eurofins.testapp.dto.Weather;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("weatherforecast")
    Call<Weather> getWeatherForeCast();
}
