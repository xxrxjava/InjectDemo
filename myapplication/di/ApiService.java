package com.xc.myapplication.di;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/xxxxx")
    Call<String> requestInfo();
}
