package Infix

fun main(){
    println(10.add(5))
    println(10 addInfix 10)
}

fun Int.add(value: Int): Int {
    return this + value
}

infix fun Int.addInfix(value: Int): Int {
    return this + value
}



fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String> where T : CharSequence, T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}

inline fun <reified T> printType(){
    val data = "Hello"
    data.length

}

fun <T> copyWhenGreaters(list: List<T>, threshold: T) where  T : CharSequence, T : Comparable<T> {
     list.filter { it > threshold }.map { it.toString() }
}


fun checkInclusion(s1: String, s2: String): Boolean {
    val len = s1.length
    if(len == 0) return false

    for(i in 0 until len){
        val ch: Char = s1[i]
        val ros: String = s1.substring(0, i) +
                s1.substring(i + 1)
        if (ros.contains(s2)) {
           return true
        }
        checkInclusion(ros, s2 + ch)
    }
    return false
}