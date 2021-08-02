package com.xc.hilt01;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class ViewModel02 extends ViewModel {


    User user;

    Application application;

    Context context;

    Activity activity;
    @ViewModelInject
    public ViewModel02(User user, Application application, Activity activity,@ApplicationContext Context context) {
        this.user = user;
        this.application = application;
        this.activity = activity;
        this.context=context;
    }

    public void test1() {
        Log.d("TAG", "test: ViewModel02 user "+user);
        Log.d("TAG", "test: ViewModel02 application "+application);
        Log.d("TAG", "test: ViewModel02 activity "+activity);
        Log.d("TAG", "test: ViewModel02 context "+context);
    }
}
