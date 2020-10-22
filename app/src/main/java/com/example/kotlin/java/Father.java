package com.example.kotlin.java;

/**
 * @author zhangquan
 */
public abstract class Father {
    private String name;
    private int age;
    public int value = 1;
    private String priVar = "priVar";
    public String pubVar = "pubVar";
    public static String staticVar = "staticVar";
    private static final String fianlStaticVar="fianlStaticVar";

    public Father(String name) {
        this.name = name;
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setData(String name) {
        this.name = name;
    }

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public static String staticMethod(String name, int age) {
        return name;
    }

    private void doUpdate(MyInterface callback) {
        callback.update(name, age);
    }

    public void update() {
        doUpdate(new MyInterface() {
            @Override
            public void update(String name, int age) {

            }
        });
    }

    public abstract void method();

    public abstract String method2(String name);
}
