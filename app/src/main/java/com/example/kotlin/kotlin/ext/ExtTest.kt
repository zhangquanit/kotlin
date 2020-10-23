package com.example.kotlin.kotlin.ext

import android.view.View
import android.widget.TextView

/**
 *
 * @author zhangquan
 */
class ExtTest {
    fun test() {
        var person = Person()
        var username = person.getUsername()

        var textView = TextView(null)

        //扩展方法
        textView.onClick2 {

        }
        //扩展属性
        textView.selfVar = 10
    }
}