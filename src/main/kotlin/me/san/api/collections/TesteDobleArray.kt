package me.san.api.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }
    println("--------------------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
    println("--------------------------------------")

    val salariosTwo = doubleArrayOf(1500.0, 1250.2, 400.0)
    salariosTwo.sort()
    salariosTwo.forEach { println(it) }
}