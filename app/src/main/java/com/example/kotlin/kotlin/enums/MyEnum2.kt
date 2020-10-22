package com.example.kotlin.kotlin.enums

import android.text.TextUtils

/**
 * @author zhangquan
 */
enum class MyEnum2(name: String) { //带构造函数的枚举
    ONE("ONE"), TWO("TWO");

    companion object {
        fun getByName(name: String?): MyEnum2? {
            val values =values()
            for (item in values) {
                if (TextUtils.equals(item.name, name)) {
                    return item
                }
            }
            return null
        }
    }

}