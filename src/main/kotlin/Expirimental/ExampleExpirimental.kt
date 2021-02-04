package Expirimental

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@ExperimentalContracts
inline fun <T,R> T.let(block: (T) -> R):R{
    contract {
        callsInPlace(block,InvocationKind.EXACTLY_ONCE)
    }
    return block(this)
}