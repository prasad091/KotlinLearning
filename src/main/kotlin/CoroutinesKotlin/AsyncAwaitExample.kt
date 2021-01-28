package CoroutinesKotlin

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

suspend fun main(){
    val one = GlobalScope.async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
    val await = one.await()
    println(await)
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

class AsyncAwaitExample {
    fun changeFn():String{
        return "Kotlin"
    }

}