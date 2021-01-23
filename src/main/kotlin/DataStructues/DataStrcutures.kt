package DataStructues

fun main(){
    println(listOFExample())
}

fun listOFExample() = listOf("Coimbatore","Chennai","Bangalore").filter { it == "Coimbatore" }