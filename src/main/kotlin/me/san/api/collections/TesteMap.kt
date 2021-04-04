package me.san.api.collections

fun main() {
    val joao = Funcionario("João", 2500.0, "PJ")
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    joao.separar("MapOne")
    map1.forEach { (k, v) -> println("Chave: $k - valor: $v")}

    joao.separar("MapTwo")
    val map2 = mapOf(
        "Peter" to 2500.0,
        "Mary" to 2978.5
    )
    map2.forEach { (k, v) -> println("Chave: $k - valor: $v")}
}