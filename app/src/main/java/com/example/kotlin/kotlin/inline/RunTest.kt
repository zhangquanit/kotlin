package com.example.kotlin.kotlin.inline

import android.widget.TextView

/**
 * run=let+with
 * 适用于let+with的所有场景
 * @author zhangquan
 */
class RunTest {
    fun test(textView: TextView?){
        var result=textView?.run {
            text="abc"
            1000
        }
        println("$result")

        /**
         *  Integer value;
         *  if (textView != null) {
                textView.setText("abc");
                value=1000;
            }
            System.out.println(value);
         */
    }
}