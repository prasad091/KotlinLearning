package NestedClass

class NestedClassExample(val name: String) {

    class InsideAnotherClass(val content: String) {
        fun printOutSomething() {
            println(content)
            // name property wont compile
            // println(name)
        }
    }
}

class NestedClassExampleTwo(val name: String) {
    inner class InsideAnother(val content: String) {
        fun printOutSomething() {
            println(content)
            println(name)
        }
    }
}

fun main(){
    val insideAnotherClass = NestedClassExample.InsideAnotherClass("Hello")
    insideAnotherClass.printOutSomething()


    val nestedClassExample = NestedClassExampleTwo("Prasad")
    nestedClassExample.InsideAnother("Hello").printOutSomething()

}