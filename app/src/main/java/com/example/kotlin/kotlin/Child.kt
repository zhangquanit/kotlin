package com.example.kotlin.kotlin

import android.os.Handler
import android.os.Looper
import android.os.Message
import com.example.kotlin.kotlin.annotation.MyAnnotation

/**
 * @author zhangquan
 */
class Child : Father {
    @MyAnnotation
    private var handler2: Handler? = null

    constructor(name: String?) : super(name!!) {}
    constructor(name: String?, age: Int) : super(name!!, age) {
        handler2 = Handler(Looper.getMainLooper())
    }

    constructor(name: String?, age: Int, birth: Long) : super(name!!, age) {}

    override fun method() {
//        value = 2;
//        pubVar = "child pubvar";
    }

    @MyAnnotation
    override fun method2(name: String): String {
        handler.sendEmptyMessage(1)
        return name
    }

    var handler: Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {}
    }
}