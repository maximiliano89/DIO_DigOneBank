package one.digitalinnovation.espelho.max

import java.math.BigDecimal

//classe espelho com o funcionario
abstract class Analista(
     nome : String,
     cpf: String,
    val salario : Double
) : Cliente(nome , cpf) {
    protected abstract fun  calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}