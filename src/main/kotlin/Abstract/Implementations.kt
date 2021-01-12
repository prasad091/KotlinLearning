package Abstract

interface Parent {
    val ch: Char
    fun f(): Int
    fun d() = ch
}

open class Actual(override val ch: Char) : Parent {
    override fun f() = 17
}

class Other : Parent {
    override val ch: Char
        get() = 'A'

    override fun f(): Int = 18
}