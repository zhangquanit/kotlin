package com.example.kotlin.kotlin.inline

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView

/**
 * 初始化对象并赋值，返回对象本身
 * @author zhangquan
 */
class ApplyTest {
    fun test(ctx: Context?) {
        //初始化对象并赋值，返回对象本身
        val textView = TextView(ctx).apply{
            text="text"
            setTextColor(Color.parseColor("#ffffff"))
            setOnClickListener{
            }
        }
        //正常写法
        textView.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

            }
        })
        //只有一个方法的lambda写法
        textView.setOnClickListener {

        }

    }
}