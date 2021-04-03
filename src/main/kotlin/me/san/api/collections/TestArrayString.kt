package me.san.api.collections

fun main() {
    val names = Array(4) {""}
    names[0] = "Mary"
    names[1] = "jhon"
    names[2] = "joseph"
    names[3] = "jane"

    for (name in names ) {
        println(name)
    }
    println("-----------")
    names.sort()
    names.forEach {
        println(it)
    }
    println("-----------")
    val namesTwo = arrayOf("Peter", "Zarry", "Mary")
    namesTwo.sort()
    namesTwo.forEach { println(it) }

}