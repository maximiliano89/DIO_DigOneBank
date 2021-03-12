package one.digitalinnovation.espelho.max

import java.math.BigDecimal

//classe espelho com o funcionario
class Analista(
    override val nome : String,
    override val cpf: String,
    val salario : BigDecimal
) : Cliente(nome , cpf) {
}