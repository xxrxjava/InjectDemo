package com.xc.hilt01;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class SecondActivity extends AppCompatActivity {


    @Inject
    User user;
    @Inject
    User user1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("TAG", "-----------------------------");
        Log.d("TAG", "onCreate:       b      "+ user);
        Log.d("TAG", "onCreate:       b      "+ user1);
    }
}
