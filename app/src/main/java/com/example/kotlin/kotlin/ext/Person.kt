package com.example.kotlin.kotlin.ext

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
}