package com.example.kotlin.java;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;

/**
 * @author zhangquan
 */
public class Child extends Father {

    @MyAnnotation
    private Handler handler2;

    public Child(String name) {
        super(name);
    }

    public Child(String name, int age) {
        super(name, age);
        handler2 = new Handler(Looper.getMainLooper());
    }

    public Child(String name, int age, long birth) {
        super(name, age);
    }

    @Override
    public void method() {
        value = 2;
        pubVar = "child pubvar";
    }

    @Override
    @MyAnnotation
    public String method2(String name) {
        handler.sendEmptyMessage(1);
        return name;
    }

    Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {

        }
    };

}
