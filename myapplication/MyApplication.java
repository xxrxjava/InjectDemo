package com.xc.myapplication;

import android.app.Application;

import com.xc.myapplication.di.ApplicationComponent;
import com.xc.myapplication.di.DaggerApplicationComponent;

public class MyApplication extends Application {

   static ApplicationComponent applicationComponent = DaggerApplicationComponent.create();

    static  public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
