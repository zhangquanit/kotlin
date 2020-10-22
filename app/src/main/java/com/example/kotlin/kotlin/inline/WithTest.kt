package com.example.kotlin.kotlin.inline

import android.content.Context
import android.widget.TextView

/**
 * this指代对象
 * @author zhangquan
 */
class WithTest {
    fun test(ctx: Context) {
        val textView = TextView(ctx)
        val result= with(textView){
            //this指代textView
            text="abc"
             1000 //最后一行返回值
        }
        println("$result")
    }
}