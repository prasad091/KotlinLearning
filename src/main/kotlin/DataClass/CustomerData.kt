package DataClass

import java.util.stream.Collectors

data class CustomerData(var data: String, var age: Int)

fun main() {
    var customerData = CustomerData("Prasad", 1)
    println(::doSomethingAwesome)
    highLevelIterator()
    println(a)
    val examplesData = ExamplesData(charArrayOf('a'))
    println(examplesData)

    println(Foo(listOf("")))
    println(Foo(emptyList()))
}

fun doSomethingAwesome(customerData: CustomerData): String {
    return customerData.data
}

fun highLevelIterator() {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    val collect = list.stream()
            .map { it }.skip(3).collect(Collectors.toSet())

    println(collect)
}

//Data class has incorrect toString when it has CharArray in it
data class A(val arr: ByteArray, val arr2: IntArray = intArrayOf(1,2), val arr3: BooleanArray = booleanArrayOf(true, false)
             , var arr4: CharArray = charArrayOf('a', 'b', 'c')
             , val arr5: FloatArray = floatArrayOf(Float.NaN, 0.0f, -0.25f ))
val a = A(byteArrayOf(1, 2, 3))

data class ExamplesData(var arr:CharArray)

data class Foo(val bar: List<String>)
