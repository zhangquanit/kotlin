package com.example.kotlin.java;

import android.text.TextUtils;

/**
 * @author zhangquan
 */
public enum MyEnum2 {
    ONE("ONE"),
    TWO("TWO");

    public String name;

    private MyEnum2(String name) {
        this.name = name;
    }

    public static MyEnum2 getByName(String name) {
        MyEnum2[] values = MyEnum2.values();
        for (MyEnum2 item : values) {
            if (TextUtils.equals(item.name, name)) {
                return item;
            }
        }
        return null;
    }
}
