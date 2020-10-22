package com.example.kotlin.kotlin.interfaces

/**
 * Kotlin 接口与 Java 8 类似，使用 interface 关键字定义接口，允许方法有默认实现：
 * @author zhangquan
 */
interface MyInterface {
    //接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时，必须重写属性：
    var name: String

    fun update(name: String, age: Int)

    fun update2() {
        println("与 Java 8 类似 允许方法有默认实现")
    }

    //静态对象 默认实现
    companion object {
        val DefaultImpl: MyInterface = object : MyInterface {
            override var name: String = "jack" //重写属性

            override fun update(name: String, age: Int) {
                println("name=$name")
                println("age=$age")
            }
        }
    }
}