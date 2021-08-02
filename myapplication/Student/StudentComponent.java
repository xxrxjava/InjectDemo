package com.xc.myapplication.Student;


import com.xc.myapplication.SecondActivity;

import dagger.Subcomponent;

@Subcomponent(modules = {StudentModule.class})
public interface StudentComponent {

    @Subcomponent.Factory
    interface Factory {
        StudentComponent craeate();
    }


    void inject(SecondActivity secondActivity);
}
