package com.example.kotlin.kotlin.collection

import java.util.*

/**
 *
 * @author zhangquan
 */
class CollectionTest {
    fun arrayTest() {
        //初始化数组
        var strArray: Array<String> = arrayOf("a", "b", "c")
        var intArray: Array<Int> = arrayOf(1, 2, 3)
        strArray[3] = "d"
        intArray[3] = 4

        for (item in strArray) {
            println("$item")
        }

        //声明空数组
        val arrayOfNullString = arrayOfNulls<String>(5)
        val arrayOfNullsInt = arrayOfNulls<Int>(5)
        arrayOfNullString[0] = "a"
        arrayOfNullsInt[0] = 1

        val arrayListOfString = arrayListOf<String>()
        val arrayListOfInt = arrayListOf<Int>()
        val arrayListOf = arrayListOf(1, 2)
        arrayListOfString[0] = "a"
        arrayListOfInt[0] = 1
        arrayListOf[2] = 3

    }

    fun listTest() {
        //返回一个可读的空List，不可操作元素
        val listOfString = listOf<String>()

        //返回一个可读的List，不可操作元素
        val listOf = listOf("a", "b", "c")

        //可变的list，可以操作元素
        val mutableListOf = mutableListOf<String>()
        mutableListOf.add("a")
        mutableListOf.add("b")
        mutableListOf.removeAt(0)
        for (item in mutableListOf) {

        }

    }

    fun mapTest() {
        //不可修改的map
        val mapOf = mapOf<String, String>()
        val mapOf1 = mapOf("key" to "value", "key2" to "value2")
        for ((k, v) in mapOf1) {
            println("$k=$v")
        }

        //可修改的map
        val mutableMapOf = mutableMapOf<String, String>()
        val mutableMapOf1 = mutableMapOf("key" to "value", "key2" to "value2")
        mutableMapOf["key"] = "value";
        mutableMapOf1["key"] = "value";

        //LinkedHashMap
        val linkedMapOf = linkedMapOf<String, String>()
        linkedMapOf["key"] = "value"


    }

    fun setTest() {
        //不可变
        val of = setOf<String>()
        val of1 = setOf("a", "b")
        of1.forEach {
            println("$it")
        }

        //可修改
        val mutableSetOf = mutableSetOf("a", "b")
        mutableSetOf.add("c")

        val linkedSetOf = linkedSetOf<String>("a", "b")
        linkedSetOf.add("c")
    }
}