package com.eurofins.testapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/a0d48a07-5df7-11ea-a136-47b2487b33c0")
    Call<Boolean> getResult();
}
