package com.example.kotlin.kotlin.generic

import android.view.View

/**
 *
 * @author zhangquan
 */
class GenericCls<T>(t: T) {
    var value = t

    fun <R> method(r: R): R {
        return r
    }

    fun <T> method2(content: T) {

        when (content) {
            is Int -> println("整型数字为 $content")
            is String -> println("字符串转换为大写：${content.toUpperCase()}")
            else -> println("T 不是整型，也不是字符串")
        }
    }

    //泛型约束
    fun <T: View> method3(content: T) {

    }

    /**
     * 上界通配符通常我们使用<? extends T> 来表示。即泛型参数类型必须是T或者T的子类，用来确定类型的上限。
     * 上界通配符 public void systemOut(List<? extends T> list)
     */
    fun systemOut(list : List<out T> ){

    }

}