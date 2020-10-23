package com.example.kotlin.lambdas;

import android.view.View;

/**
 * @author zhangquan
 */
public class LambdaTest {

    public void test(){
        View view=new View(null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void test2(){
        View view=new View(null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
