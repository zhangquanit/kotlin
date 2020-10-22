package com.example.kotlin.kotlin.ext

import android.view.View

/**
 *
 * @author zhangquan
 */
/**
public static final String getUsername(Person person) {
return "user_" + person.getName();
}
 */
fun Person.getUsername(): String? {
    return "user_" + this.name
}

fun View.onClick(listener: View.OnClickListener) {
    this.setOnClickListener(listener)
}

fun View.onClick2(function: () -> Unit) {
    this.setOnClickListener {
        function()
    }
}