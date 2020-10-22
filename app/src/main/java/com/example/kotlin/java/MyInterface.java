package com.example.kotlin.java;

/**
 * @author zhangquan
 */
public interface MyInterface {

    MyInterface Simple = new MyInterface() {

        @Override
        public void update(String name, int age) {
            System.out.println("name=" + name);
            System.out.println("age=" + age);
        }
    };

    void update(String name, int age);
}
