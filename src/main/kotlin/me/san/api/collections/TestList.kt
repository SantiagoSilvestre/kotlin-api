package me.san.api.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val lucas = Funcionario("Lucas", 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    val funcionarios = listOf(joao, lucas, maria)
    funcionarios.forEach { println(it) }
    joao.separar("listOf")
    println(funcionarios.find { it.nome == "Maria" })
    joao.separar("sortedBy")
    funcionarios.sortedBy {it.salario  }.forEach { println(it) }
    joao.separar("groupBy")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it)}

}



