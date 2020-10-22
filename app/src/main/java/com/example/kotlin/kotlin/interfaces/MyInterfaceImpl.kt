package com.example.kotlin.kotlin.interfaces

/**
 * 一个类或者对象可以实现一个或多个接口。
 * @author zhangquan
 */
class MyInterfaceImpl : MyInterface, MyInterface2 {
    override var name: String = "JACK" //重写属性

    override fun update(name: String, age: Int) {

    }

    override fun update2() {
       super.update2()
    }

    override fun update3() {

    }


}