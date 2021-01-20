package TypeAlias

import java.util.stream.Collectors

typealias StringList = List<String>

fun onDoSomething(data: StringList): MutableList<String> = data.stream().collect(Collectors.toList())


fun main(){
    println(onDoSomething(listOf("Apple", "Orange", "Strawberry")))
}
