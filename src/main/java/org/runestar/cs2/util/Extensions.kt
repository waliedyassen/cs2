package org.runestar.cs2.util

fun Short.toUnsignedInt(): Int = java.lang.Short.toUnsignedInt(this)

fun Byte.toUnsignedInt(): Int = java.lang.Byte.toUnsignedInt(this)

fun <T> MutableCollection<T>.removeFirst(): T {
    val itr = iterator()
    return itr.next().also { itr.remove() }
}