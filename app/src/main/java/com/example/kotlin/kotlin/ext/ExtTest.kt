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

        var textView=TextView(null)
        textView.onClick(View.OnClickListener { })

        textView.onClick2{

        }
    }
}