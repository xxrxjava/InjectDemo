package com.xc.myapplication.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Module
public class NetModule {

    @MyScope
    @Provides
    public Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return  new Retrofit.Builder().client(okHttpClient).baseUrl("http://www.163.com").build();
    }

    @MyScope
    @Provides
    public ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @MyScope
    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder().build();
    }

}
