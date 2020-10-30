package com.example.kotlin.kotlin.delegate

/**
 *
 * @author zhangquan
 */
class ProxyTest {
    //代理类
    class DelegateCls(private val cls: ProxyInterface) : ProxyInterface by cls
    fun test() {

        var realClass = RealClass()
        var delegateCls = DelegateCls(realClass)
        delegateCls.method("do something")
    }
}