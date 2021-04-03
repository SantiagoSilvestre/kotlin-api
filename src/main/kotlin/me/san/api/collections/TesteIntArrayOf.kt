package me.san.api.collections

fun main() {

    val values = intArrayOf(2,5,6,3,3,9)

    values.forEach {
        println(it)
    }
    println("-----------")
    values.sort()
    for (value in values ) {
        println(value)
    }


}