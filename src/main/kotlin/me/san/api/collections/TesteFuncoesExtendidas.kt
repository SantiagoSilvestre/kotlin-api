package me.san.api.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("-----somatoria---------")
    println(salarios.somatoria())
    println("-----média---------")
    println(salarios.media())
}