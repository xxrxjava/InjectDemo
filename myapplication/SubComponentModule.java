package com.xc.myapplication;

import com.xc.myapplication.Student.StudentComponent;

import dagger.Module;
import dagger.Subcomponent;



/*-------------子组件----------------------*/
@Module(subcomponents = StudentComponent.class)
public class SubComponentModule {
}
