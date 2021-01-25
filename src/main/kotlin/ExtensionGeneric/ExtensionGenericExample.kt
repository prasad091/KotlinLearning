package ExtensionGeneric

import java.io.Closeable

private inline fun <T : Closeable?> Array<T>.use(block: () -> Unit) {
    block()
}




