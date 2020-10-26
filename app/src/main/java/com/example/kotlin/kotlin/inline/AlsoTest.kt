package com.example.kotlin.kotlin.inline

import android.widget.TextView

/**
 * 适用于let函数的任何场景，一般可用于多个扩展函数链式调用
 * it指代当前对象
 * @author zhangquan
 */
class AlsoTest {
    fun test(textView:TextView?){
        var result=textView?.also{
          it.text="abc"
        }
        println("$result") //返回textView

        //与let比较
        var result2=textView?.let {
            it.text="abc"
            1000
        }
        println("$result2") //1000
    }
}