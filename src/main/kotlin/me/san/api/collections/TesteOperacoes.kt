package me.san.api.collections

fun main() {
    val salarios = doubleArrayOf(1940.50, 2225.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    separar()
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")
    separar()

    val salariosMaior2500 = salarios.filter { it < 2000.0 }
    salariosMaior2500.forEach { println(it) }
    separar()
    println(salarios.count{it in 2000.0..5000.0})
    separar()
    println(salarios.find{ it == 6.0})
    separar()
    println(salarios.any{ it == 1940.5})
}
fun separar() {
    println("---------------")
}