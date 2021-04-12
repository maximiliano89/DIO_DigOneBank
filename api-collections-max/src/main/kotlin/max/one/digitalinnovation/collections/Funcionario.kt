package max.one.digitalinnovation.collections

    data class Funcionario(
        val nome : String,
        val salario: Double,
        val tipoContratacao: String
    ){
        override fun toString(): String =
            """
            Nome:            $nome
            Salário:         $salario
            TipoContratacao: $tipoContratacao
        """.trimIndent()
    }
