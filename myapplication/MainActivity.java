package com.xc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.xc.myapplication.Student.Student;
import com.xc.myapplication.di.ApiService;
import com.xc.myapplication.di.User;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    User user;

    @Inject
    Retrofit retrofit;

    @Inject
    ApiService apiService;
    @Inject
    ApiService apiService1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerApplicationComponent.create().inject(this);
        MyApplication.getApplicationComponent().inject(this);

        Log.d(TAG, "user=   "+user);

        Log.d(TAG, "retrofit   ="+retrofit);

        Log.d(TAG, "apiService=   "+apiService);
        Log.d(TAG, "apiService1   ="+apiService1);


        startActivity(new Intent(this,SecondActivity.class));
    }
}