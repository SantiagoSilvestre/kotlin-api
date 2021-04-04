package me.san.api.collections

fun main () {
    val joao = Funcionario("João", 2000.0, "CLT")
    val lucas = Funcionario("Lucas", 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    joao.separar("MultableListOf")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it)  }

    joao.separar("Add")
    funcionarios.add(lucas)
    funcionarios.forEach{ println(it)  }

    joao.separar("Remove")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)  }

    joao.separar("Multable SET")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{ println(it)}

    joao.separar("Multable add")
    funcionariosSet.add(maria)
    funcionariosSet.add(lucas)
    funcionariosSet.forEach{ println(it)}

    joao.separar("Multable remove")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{ println(it)}
}