package CoroutinesKotlin

import kotlinx.coroutines.*

fun main(){
    GlobalScope.launch(Dispatchers.IO) {
        println("IO ${Thread.currentThread().name}")
        val answer = doNetworkCall()
        withContext(Dispatchers.Main){
            println(answer)
        }

    }
}

suspend fun doNetworkCall():String {
    delay(3000L)
    return "This is the answer"
}