package com.example.kotlin.kotlin.ext

import android.view.View
import com.example.kotlin.R

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

fun View.onClick2(function: () -> Unit) {
    this.setOnClickListener {
        function()
    }
}

//扩展属性
var <T : View> T.selfVar: Long
    get() = if (getTag(R.id.myId) != null) getTag(1) as Long else 0
    set(value) {
        setTag(R.id.myId, value)
    }