package Basic

/*fun main(){
    println("Hello World")
}*/


fun main(){
 /*   val row = 5
    var k = 0
    for(i in 1..row){
        for (space in i until row){
            print("  ")
        }

        while (k != 2 * i - 1){
            print("* ")
            ++k
        }
        println()
        k = 0
    }*/
    printDiamond()

}

fun printDiamond() {

    val height = 3
    val width = height * 2 - 1

    for ( i in 0..height ) {

        for ( j in 0..width + 1 ) {

            if ( j >= height - i && j <= height + i ) {

                print( "*" )
            }
            else {

                print( " " )
            }
        }

        println()
    }

    for ( i in height - 1 downTo 0 ) {

        for ( j in width + 1 downTo 0 ) {

            if ( j >= height - i && j <= height + i ) {

                print( "*" )
            }
            else {

                print( " " )
            }
        }

        println()
    }
}

