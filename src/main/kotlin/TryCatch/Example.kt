package TryCatch

import java.io.IOException
import kotlin.jvm.Throws


fun main(){
    getRequest()
}

@Throws(Exception::class)
fun getRequest(){
    val x = "h"
    x.toInt()

}