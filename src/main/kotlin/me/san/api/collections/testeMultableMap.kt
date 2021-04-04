package me.san.api.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val lucas = Funcionario("Lucas", 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    val repository = Repository<Funcionario>()
    repository.create(joao.nome, joao)
    repository.create(lucas.nome, lucas)
    repository.create(maria.nome, maria)

    println(repository.findById(joao.nome))
}