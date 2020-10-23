package com.example.kotlin.kotlin.ext

import android.util.Log
import kotlin.properties.Delegates

/**
 *
 * @author zhangquan
 */
class Person {
    var name: String? = null
        get() = if (field == null) "default" else field
        set(value) {
            if (value == null) {
                field = "default"
            } else {
                field = "pre_" + value
            }
        }

    /**
     * observable 可以观察参数的变化
     */
    var age: Int by Delegates.observable(1) { property, oldValue, newValue ->
        {
            Log.d("Person", "属性变化：属性名：$property  旧值：$oldValue  新值：$newValue")
        }
    }

    /**
     * vetoable 相当于参数拦截器，可以拦截不符合条件的复制操作
     * vetoable 函数有返回值，true 表示允许参数修改，false 反之不允许，数据不会变更。
     */
    var address: String by Delegates.vetoable("四川省") { property, oldValue, newValue ->
        if (newValue == null) {
            return@vetoable false //不允许修改属性
        }
        return@vetoable true

    }

}