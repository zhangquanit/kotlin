package com.example.kotlin.kotlin.basic

import android.text.TextUtils

/**
 *
 * @author zhangquan
 */
open class ClsTest {
    // private int i = 1;
    var i = 1

    //  private String name;
    var name: String? = null
        get() {  //处理getXX方法
            return field?.toUpperCase()
        }
        set(value) { //处理setXX方法
            if (TextUtils.isEmpty(value)) {
                field = "defValue"
            } else {
                field = value
            }
        }

    //构造函数
    constructor()
    constructor(str: String?) {

    }

    //普通方法   public final String method()
    fun method(): String {
        return "abc"
    }


    //允许被子类重写  public void method2()
    open fun method2(){

    }

    //静态变量  静态方法
    companion object {
        var staticField = "STATIC_FIELD"
        fun staticMethod(str: String?): String? {
            return null
        }
    }
}