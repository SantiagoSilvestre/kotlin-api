package me.san.api.collections

fun main () {
    val joao = Funcionario("João", 2000.0, "CLT")
    val lucas = Funcionario("Lucas", 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    val funcionarioOne = setOf(joao, maria)
    val funcionarioTwo = setOf(lucas)
    val funcionarioThre = setOf(lucas, maria, joao)

    joao.separar("union")
    val result = funcionarioOne.union(funcionarioTwo)
    result.forEach { println(it) }

    joao.separar("subtract")
    val resultSubtrac = funcionarioThre.subtract(funcionarioOne)
    resultSubtrac.forEach { println(it) }

    joao.separar("intersec")
    val resultIntersect = funcionarioThre.intersect(funcionarioTwo)
    resultIntersect.forEach { println(it) }
}