package `2`.variabledeclaration

import kotlin.properties.Delegates


var number1:Int = 0
var number2:Int? = null
lateinit var number3: String // late init must be initialise
var number4 by Delegates.notNull<Int>() // Property number4 should be initialized before get

val number5:Int = 1
const val number6:Int = 1

val number7:Int by lazy { 5 }



fun main(){
    number3 = "Hello"
    number4 = 0
    println(number1)
    println(number2)
    println(number3)
    println(number4)
    println(number5)
    println(number6)
    println(number7)
}