package com.xc.myapplication.Student;

import com.xc.myapplication.Qualifier.StudentQualifler1;
import com.xc.myapplication.Qualifier.StudentQualifler2;

import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

//    @Named("student1")
    @StudentQualifler1
    @Provides
    Student provideStudent() {
        return new Student();
    }

    @StudentQualifler2
    @Provides
    Student provideStudent2() {
        return new Student("新名字xxx");
    }

}
