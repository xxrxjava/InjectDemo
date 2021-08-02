package com.xc.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.xc.myapplication.Qualifier.StudentQualifler1;
import com.xc.myapplication.Qualifier.StudentQualifler2;
import com.xc.myapplication.Student.Student;
import com.xc.myapplication.bind.AInterface;
import com.xc.myapplication.di.ApiService;
import com.xc.myapplication.di.User;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "MainActivityb";

    @Inject
    ApiService apiService3;

    @Inject
    User user;

//    @Inject
//    Student student;

    //    @Named("student1")
    @StudentQualifler1
    @Inject
    Student student;

    //    @Named("student2")
    @StudentQualifler2
    @Inject
    Student student2;

    @Inject
    AInterface aInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MyApplication.getApplicationComponent().studentComponent().craeate().inject(this);
//        DaggerApplicationComponent.create().inject(this);
        Log.d(TAG, "apiService3=" + apiService3);
        Log.d(TAG, "user       =" + user);
        Log.d(TAG, "---------------------------");
        Log.d(TAG, "student:     = " + student);
        Log.d(TAG, "---------------------------");
        Log.d(TAG, "aInterface:     = " + aInterface);
        Log.d(TAG, "---------------------------");
        Log.d(TAG, "student1:     " + student.getName());
        Log.d(TAG, "student2:     " + student2.getName());

    }
}
