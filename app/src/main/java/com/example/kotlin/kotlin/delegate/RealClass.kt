package com.example.kotlin.kotlin.delegate

/**
 *
 * @author zhangquan
 */
class RealClass : ProxyInterface {
    override fun method(str: String) {
        println("str=$str")
    }
}