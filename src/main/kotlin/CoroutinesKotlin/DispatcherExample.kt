package CoroutinesKotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(){
    exampleLaunchCoroutines()
    exampleLaunchCoroutinesTwo()
}
fun exampleLaunchCoroutines() = runBlocking{
    println("Main Thread: ${Thread.currentThread().name}")
    launch(Dispatchers.IO){
        printDelayMessage("Dispatcher Thread: ${Thread.currentThread().name}")
    }

    println("End Thread: ${Thread.currentThread().name}")
}


fun exampleLaunchCoroutinesTwo() = runBlocking{
    println("Main Thread: ${Thread.currentThread().name}")

    launch(Dispatchers.Unconfined){
        printDelayMessage("Dispatcher Main Thread: ${Thread.currentThread().name}")
    }
    println("End Thread: ${Thread.currentThread().name}")
}
