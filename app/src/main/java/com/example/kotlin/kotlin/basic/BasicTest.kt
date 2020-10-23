package com.example.kotlin.kotlin.basic

/**
 *
 * @author zhangquan
 */
class BasicTest {
    fun main(args: Array<String>) {

        //三目运算
        var a=1
        var b=2
        if (a>b) a else b

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
    }
}