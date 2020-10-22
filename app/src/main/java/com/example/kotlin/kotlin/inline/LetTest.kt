package com.example.kotlin.kotlin.inline

import android.graphics.Color
import android.widget.TextView

/**
 * let判空,可以避免多次重复判空
 * @author zhangquan
 */
class LetTest {
    fun test(str:String?) {

        /**
         * String string="abc"
         * int len=string.length();
         * System.out.println("len="+len);
         */
        var string = "abc".let {
            val len = it.length
            println("len=$len")
        }

        /**
         *   if (str != null) {
         *       int len=string.length();
         *       System.out.println("len="+len);
         *   }
         */
        str?.let{
            val len = it.length
            println("len=$len")
        }
    }

    fun test2(textView: TextView?){
        /**
         * if (textView != null) {
            textView.setText("abc");
            }
         */
        textView?.text="abc"
        /**
         *  if (textView != null) {
         *   textView.setBackgroundColor(Color.parseColor("#ffffff"));
         *  }
         */
        textView?.setBackgroundColor(Color.parseColor("#ffffff"))

        /**
         *   if (textView != null) {
         *     textView.setText((CharSequence)"abc");
         *     textView.setBackgroundColor(Color.parseColor("#ffffff"));
         *   }
         */
        //避免textView多次判空
        textView?.let{
            it.text="abc"
            it.setBackgroundColor(Color.parseColor("#ffffff"))
        }
    }
}