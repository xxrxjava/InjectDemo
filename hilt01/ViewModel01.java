package com.xc.hilt01;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class ViewModel01 {


    User user;

    Application application;

    Context context;

    Activity activity;
@Inject
    public ViewModel01(User user, Application application, Activity activity, Context context) {
    this.user = user;
    this.application = application;
    this.activity = activity;
    this.context=context;
    }

    public void test() {
        Log.d("TAG", "test: user "+user);
        Log.d("TAG", "test: application "+application);
        Log.d("TAG", "test: activity "+activity);
        Log.d("TAG", "test: context "+context);
    }
}
