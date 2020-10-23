package com.example.kotlin.kotlin

import com.example.kotlin.kotlin.interfaces.MyInterface

/**
 * @author zhangquan
 */
abstract class Father {
    private var name: String
    private var age = 0
    var value = 1
    private val priVar = "priVar"
    var pubVar = "pubVar"

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun setData(name: String) {
        this.name = name
    }

    fun setData(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    private fun doUpdate(callback: MyInterface) {
        callback.update(name, age)
    }

    fun update() {
        doUpdate(object : MyInterface {
            override var name: String=""

            override fun update(name: String, age: Int) {

            }
        })
    }

    abstract fun method()
    abstract fun method2(name: String): String

    /**
     * 静态变量、静态方法
     */
    companion object {
        var staticVar = "staticVar"
        private const val fianlStaticVar = "fianlStaticVar"
        fun staticMethod(name: String, age: Int): String {
            return name
        }
    }


}