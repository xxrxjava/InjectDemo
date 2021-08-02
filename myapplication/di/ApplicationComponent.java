package com.xc.myapplication.di;

import com.xc.myapplication.MainActivity;
import com.xc.myapplication.SecondActivity;
import com.xc.myapplication.Student.StudentComponent;
import com.xc.myapplication.SubComponentModule;
import com.xc.myapplication.bind.TestModule;

import javax.inject.Singleton;

import dagger.Component;
@MyScope
@Component(modules = {NetModule.class, SubComponentModule.class, TestModule.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
//    void inject(SecondActivity secondActivity);


    StudentComponent.Factory studentComponent();
}
