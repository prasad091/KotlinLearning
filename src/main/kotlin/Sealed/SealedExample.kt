package Sealed

sealed class SealedExample
data class Const(val number: Double) : SealedExample()
data class Sum(val e1: SealedExample, val e2: SealedExample) : SealedExample()
object NotANumber : SealedExample()