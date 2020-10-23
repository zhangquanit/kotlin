package com.example.kotlin.kotlin.basic

import android.content.Context
import android.widget.TextView
import com.example.kotlin.kotlin.Child

/**
 * lazy：用到才在lazy后面的语句块中初始化
 * lateinit：绕过编译器null警告，在后面自行初始化
 *
 * @author zhangquan
 */
class LazyTest {
    private var textView: TextView? = null //在kotlin中声明不为空类型变量都需要立即进行初始化，不管是可变的还是不可变的。
    private lateinit var textView2: TextView //使用延迟初始化lateinit来让编译器绕过的警告。之后需要自行初始化

    private val child by lazy { //用到时才初始化
        Child("child").apply{
            //初始化
        }
    }

    fun test(ctx: Context) {
        child.method() //用到child时才创建
        textView2 = TextView(ctx) //延迟初始化
    }
}