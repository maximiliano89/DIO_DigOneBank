package one.digitalinnovation.espelho.max

import java.math.BigDecimal

//classe espelho com o funcionario
abstract class Analista(
     nome : String,
     cpf: String,
    val salario : BigDecimal
) : Cliente(nome , cpf) {
    abstract fun  calculoAuxilio()
}