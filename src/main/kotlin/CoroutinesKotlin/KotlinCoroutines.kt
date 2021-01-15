package CoroutinesKotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("Main Thread: ${Thread.currentThread().name}")
    GlobalScope.launch {
        println("Before Delay: ${Thread.currentThread().name}")
        delay(1000)
        println("After Delay: ${Thread.currentThread().name}")
    }
    delay(2000)
}