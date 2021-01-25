package InvokeFunction

import java.io.Closeable

class InvokeExample {
    fun addMember(name:String) = println(name)

    operator fun invoke(body:InvokeExample.() -> Unit){
        body()
    }

}

fun main(){
    val invokeExample = InvokeExample()
    invokeExample{
        addMember("Hello")
        addMember("Prasad")
    }
}

