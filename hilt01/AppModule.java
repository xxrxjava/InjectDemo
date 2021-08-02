package com.xc.hilt01;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.ActivityScoped;


@InstallIn(ActivityComponent.class)
@Module
public class AppModule {

//    @Singleton
    @ActivityScoped
    @Provides
    User provideUser() {
        return new User();
    }

    @Provides
    ViewModel01 provideViewModel01(User user, Application application, Activity activity, @ApplicationContext Context context) {
        return new ViewModel01(user, application, activity,context);
    }
    @Provides
    ViewModel02 provideViewModel02(User user, Application application, Activity activity, @ApplicationContext Context context) {
        return new ViewModel02(user, application, activity,context);
    }
}
