package Infix

fun main(){
    println(10.add(5))
    println(10 addInfix 10)
}

fun Int.add(value:Int): Int {
    return this + value
}

infix fun Int.addInfix(value:Int): Int {
    return this + value
}