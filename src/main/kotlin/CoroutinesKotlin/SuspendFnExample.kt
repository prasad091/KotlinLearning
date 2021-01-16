package CoroutinesKotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    onSuspendFuncExample()
}

fun onSuspendFuncExample() {
    println("Start")
    runBlocking {
        printDelayMessage("Coroutines Message")
    }
    println("End")
}

suspend fun printDelayMessage(message:String) {
    delay(1000)
    println(message)
}
