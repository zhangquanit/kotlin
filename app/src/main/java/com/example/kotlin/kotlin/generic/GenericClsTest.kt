package com.example.kotlin.kotlin.generic

/**
 *
 * @author zhangquan
 */
class GenericClsTest {
    fun test() {
        val intCls = GenericCls<Int>(10)
        val intValue = intCls.value

        val stringCls = GenericCls<String>("string")
        val stringValue=stringCls.value

    }
}