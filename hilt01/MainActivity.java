package com.xc.hilt01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {


    @Inject
    User user;

    @Inject
    User user1;

    @Inject
    ViewModel01 viewModel01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("TAG", "onCreate:             "+ user);
        Log.d("TAG", "onCreate:             "+ user1);


        startActivity(new Intent(this, SecondActivity.class));

        viewModel01.test();

        ViewModel02 viewModel02 = new ViewModelProvider(this).get(ViewModel02.class);
        viewModel02.test1();
    }
}