package io.dozator.common.utils.extensions.bigdecimal

import java.math.BigInteger

// Comparison

fun BigInteger.isZero(): Boolean {
    return this.isEqual(BigInteger.ZERO)
}

fun BigInteger.isNotZero(): Boolean {
    return !this.isZero()
}

fun BigInteger?.orZero(): BigInteger {
    return this ?: BigInteger.ZERO
}

fun BigInteger?.isEqual(another: BigInteger?): Boolean {
    if (this == null) return another == null
    return if (another != null) this.compareTo(another) == 0 else false
}

fun BigInteger?.isNotEqual(another: BigInteger?): Boolean {
    return !this.isEqual(another)
}
