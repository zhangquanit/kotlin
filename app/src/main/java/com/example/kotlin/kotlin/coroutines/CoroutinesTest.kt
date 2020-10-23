package com.example.kotlin.kotlin.coroutines

import android.util.Log
import kotlinx.coroutines.*

/**
 *
 * @author zhangquan
 */
class CoroutinesTest {
    val TAG = "CoroutinesTest"

    //-------------------------------
    fun runBolockingTest() {
        Log.e(TAG, "主线程id：${Thread.currentThread().id}")
        test()
        Log.e(TAG, "协程执行结束")
    }

    fun test() = runBlocking {
        repeat(3) {
            Log.e(TAG, "协程执行$it 线程id：${Thread.currentThread().id}")
            delay(1000)
        }
    }

    //-------------------------------
    fun launchTest() {
        val job = GlobalScope.launch {
            Log.e(TAG, "协程执行开始 -- 线程id：${Thread.currentThread().id}")
            delay(5000)
            Log.e(TAG, "协程执行结束 -- 线程id：${Thread.currentThread().id}")
        }
        Log.e(TAG, "主线程执行结束 --线程id：${Thread.currentThread().id} , job.isActive=${job.isActive}")
        /**
         * //Job中的方法
        job.isActive
        job.isCancelled
        job.isCompleted
        job.cancel()
        jon.join()
         */
    }

    //------------suspend
    private fun suspendTest() {
        GlobalScope.launch {
            val token = getToken()
            val userInfo = getUserInfo(token)
            setUserInfo(userInfo)
        }
        repeat(4) {
            Log.e(TAG, "主线程执行$it")
        }
    }

    private fun setUserInfo(userInfo: String) {
        Log.e(TAG, userInfo)
    }

    private suspend fun getToken(): String {
        delay(2000)
        return "token"
    }

    private suspend fun getUserInfo(token: String): String {
        delay(2000)
        return "$token - userInfo"
    }

    //------------async
    private fun asyncTest() {
        GlobalScope.launch {
            Log.e(TAG, "launch ,thread.id=${Thread.currentThread().id}")
            val result1 = GlobalScope.async {
                Log.e(TAG, "getResult1 start, thread.id=${Thread.currentThread().id}")
                getResult1()
                Log.e(TAG, "getResult1 end")
            }
            val result2 = GlobalScope.async {
                Log.e(TAG, "getResult2 start, thread.id=${Thread.currentThread().id}")
                getResult2()
                Log.e(TAG, "getResult2 end")
            }
            //等待result1、result2执行完后才继续向下执行
            val result = result1.await() + result2.await()
            Log.e(TAG, "result = $result, thread.id=${Thread.currentThread().id}")
        }
        Log.e(TAG, "主线程执行完毕，thread.id=${Thread.currentThread().id}")
    }

    private suspend fun getResult1(): Int {
        delay(3000)
        return 3
    }

    private suspend fun getResult2(): Int {
        delay(4000)
        return 4
    }
}