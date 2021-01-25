package InvokeFunction

class Barista(val name:String){
    operator fun invoke(){
        println("Order Accepted")
        val num = 0b1
        println(num)

    }
}

fun main(){
    val barista = Barista("")
    barista.invoke()

}