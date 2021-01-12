package Abstract

abstract class WithProperty {
    abstract val x: Int
}


abstract class WithFunction() {
    abstract fun add(): Int
    abstract fun delete(s: Int)
}
