package me.san.api.collections

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
    fun separar(separar: String) {
        println("-------$separar ----------")
    }

}