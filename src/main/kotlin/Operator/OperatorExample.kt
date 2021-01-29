package Operator

import java.lang.IndexOutOfBoundsException
import kotlin.jvm.Throws

fun main() {
    val list = mutableListOf(1, 2, 3)
    list += 4
    list += 6

    list[7].printOut
}


operator fun <T> Iterable<T>.plus(element: T): List<T> {
    if (this is Collection) return this.plus(element)
    val result = ArrayList<T>()
    result.addAll(this)
    result.add(element)

    return result
}
typealias trans<T,R> =  (T) -> R

inline fun <T, R> Iterable<T>.map(transform: trans<T,R>): List<R> {
    val destination = ArrayList<R>(
            if (this is Collection<*>) this.size else 10
    )
    for (item in this)
        destination.add(transform(item))


    return destination
}

val <T> T.printOut get() = println(this)