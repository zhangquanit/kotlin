package com.example.kotlin.kotlin.basic

import com.example.kotlin.kotlin.interfaces.MyInterface

/**
 *
 * @author zhangquan
 */
class InnerClsTest {
    var username: String? = null

    //内部类
    inner class Inner {
        fun method() {
            //this@InnerClsTest 引用外部类对象
            var username = this@InnerClsTest.username
            //this@Inner 引用当前对象
            this@Inner.method2(username)
        }

        fun method2(str: String?) {

        }
    }


    fun test2(callback: MyInterface) {
        callback.update("name", 1)
    }

    fun test() {
        //构建内部类对象
        var innerObj = InnerClsTest().Inner()
        innerObj.method()

        //匿名内部类
        test2(object : MyInterface {
            override var name: String = ""

            override fun update(name: String, age: Int) {

            }
        })
    }
}