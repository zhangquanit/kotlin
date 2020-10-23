package com.example.kotlin.lambdas;

import android.view.View;

/**
 * @author zhangquan
 */
public class LambdaTest {

    public void test() {
        View view = new View(null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        view.setOnClickListener(v -> System.out.println());
        //或
        View.OnClickListener listener = (v) -> System.out.println(); //声明函数对象
        view.setOnClickListener(listener); //函数作为参数传递进方法中

        int result = fun1(new Inter() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        });
        //有参数有返回值
        result = fun1((a, b) -> a + b);
        //或
        Inter inter = (a, b) -> a + b; //声明函数对象
        result = fun1(inter); //函数作为参数传递进方法中


        int result2 = fun2(new Inter2() {
            @Override
            public int add() {
                return 10;
            }
        });
        //无参有返回值
        result2 = fun2(() -> 10);
        //或
        Inter2 inter2 = () -> 10; //声明函数对象
        fun2(inter2); //函数作为参数传递进方法中

        fun3(new Inter3() {
            @Override
            public void add() {

            }
        });
        //无参无返回值
        fun3(() -> {
        });
        //或
        Inter3 inter3 = () -> {
        }; //声明函数对象
        fun3(inter3); //函数作为参数传递进方法中

        //闭包问题
        int i = 1;
        //        i+=2;
        fun3(() -> {
            System.out.println("i=" + i); //会在编译期间自动为i添加final
        });

    }

    public void test2() {
        View view = new View(null);
        view.setOnClickListener(v -> System.out.println());

        //有参数有返回值
        int result = fun1((a, b) -> a + b);
        //无参有返回值
        int result2 = fun2(() -> 10);
        //无参无返回值
        fun3(() -> {
        });
    }

    private int fun1(Inter inter) {
        return inter.add(1, 2);
    }

    private int fun2(Inter2 inter2) {
        return inter2.add();
    }

    private void fun3(Inter3 inter3) {
        inter3.add();
    }

    private interface Inter {
        int add(int a, int b);
    }

    private interface Inter2 {
        int add();
    }

    private interface Inter3 {
        void add();
    }
}
