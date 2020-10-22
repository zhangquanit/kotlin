package com.example.kotlin.kotlin

import com.example.kotlin.kotlin.basic.DataCls
import com.example.kotlin.kotlin.basic.SingleCls

/**
 * @author zhangquan
 */
class Test {
    fun test() {
        val child = Child("name")

        SingleCls.TAG
        SingleCls.staticField
        SingleCls.staticMethod1("name")

        val dataCls=DataCls("name",1000)
        println("${dataCls.str}")
    }
}