package com.example.kotlin.kotlin.basic

import com.example.kotlin.kotlin.ext.Person

/**
 *
 * @author zhangquan
 */
class BasicTest {
    fun main(args: Array<String>) {

        //三目运算
        var a = 1
        var b = 2
        if (a > b) a else b

        //表达式作为函数体
        fun sum(a: Int, b: Int) = a + b
        sum(1, 2)
    }

    fun nullTest(str: String?) {
        /**
        String b = str;
        if (str == null) {
        b = "default";
        }
         */
        var b = str ?: "default";
        println("$b")

        str ?: return  //if(str==null)return;
    }
}