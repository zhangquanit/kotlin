package com.example.kotlin.lambdas

import android.app.Person
import android.view.View

/**
 *
 * @author zhangquan
 */
class Lambda_Kotlin {
    fun testMain() {
        //无参无返回值
        test1(object : KInter1 {
            override fun method() {
                println("test1")
            }
        })

        println("--------------无参表达式----------")
        val test2Param = { println("xxxx") }
        test2Param()

        println("--------------有参表达式----------")
        val test3Param = { a: Int, b: Int -> a + b }
        val test3ParamResult = test3Param.invoke(1, 2)
        println("result=$test3ParamResult")
        println("result=${test3Param(1, 2)}")

        println("--------------标准格式----------")
        var people = People()
        people.maxBy({ p: People -> p.age })
        //如果一个函数的最后一个参数是一个lambda表达式，可以把lambda表达式提到小括号右边
        people.maxBy() { p: People -> p.age }
        //如果lambda是函数的唯一实参时，小括号可以直接省略
        people.maxBy { p: People -> p.age }
        //在kotlin中可以推导出参数类型
        people.maxBy { p -> p.age }
        //在Kotlin中可以使用it默认参数名称替代命名参数名称p
        people.maxBy { it.age }

        println("--------------最后一个参数为lambda表达式----------")
        people.method2(10) { a: Int -> "str_$a" }

        println("--------------Lambda返回值----------")
        val add = { a: Int ->
            println("a=$a")
            a == 1   //返回最后一行表达式的值
        }
        val addResult = add.invoke(1)
        //或 val addResult = add(1)
        println("最后一行表达式有值：$addResult")

        val pri = { a: Int ->
            var b = a + 1
            println("最后一行表达式无返回值")
        }
        println("返回值=${pri(1)}")

        println("--------------多参数都为lambda----------")
        people.method3(34, "岁", { a: Int -> "$a" }, { a: Int, b: String -> "$a _ $b" })

        println("-------------- ()->Unit 和 T.()->Unit 的区别)----------")
        people.method4 {
            //this代表的是外部类的实例 即Lambda_Kotlin实例
            println("()的this=$this")
        }
        people.method5 {
            //this代表当前实例 指向T.()的T 这里是People
            println("People.()的this=$this")
        }

        people.method6 { a: Int ->
            "str_$a"
        }
    }

    private fun test1(inter1: KInter1) {
        inter1.method()
    }

}

interface KInter1 {
    fun method()
}


class People {
    var age = 1
    fun maxBy(block: (People) -> Int) { //param参数表示:参数为People对象，返回一个Int值的lambda表达式
        println("block=$block")  //Function1<com.example.kotlin.lambdas.People, java.lang.Integer>

        var people = People()
        people.age = 100
        val result = block(people)
        println("result=$result") //100
    }

    fun method2(a: Int, block: (Int) -> String) {
        val result = block(a)
        println("method2 result=$result")
    }

    fun <T, R> method3(a: T, b: R, block1: (T) -> R, block2: (T, R) -> R) {
        var result = block1(a)
        println("block1.invoke=$result")

        result = block2(a, b)
        println("block2.invoke=$result")
    }

    fun method4(block: () -> Unit) {
        block()
    }

    fun method5(block: People.() -> Unit) {
        //People类实例是block函数的调用者.
//        var people = People()
//        people.block()
        block()
    }

    fun method6(block: People.(a: Int) -> String) {
        //People类实例是block函数的调用者. 也可以携带参数
        var result =block(1)
        println("$result")
    }

}

class People2 {

}