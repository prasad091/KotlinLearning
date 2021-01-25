package HigherOrderFunction

import java.io.Closeable

class Operator {
    fun add(a: Int, b: Int) = a + b
    fun inc(a: Int) = a + 1
}

fun calc(a: Int, b: Int, opr: (Int, Int) -> Int) = opr(a, b)
fun calc(a: Int, opr: (Int) -> Int) = opr(a)



fun main() {
    calc(1, 2) { a, b -> Operator().add(a, b) }
    calc(1) { Operator().inc(it) }
}