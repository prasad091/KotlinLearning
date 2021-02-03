package Recursion

fun illegalState() {
    throw IllegalStateException()
}

fun fail() = illegalState()

fun main() {
    fail()
}