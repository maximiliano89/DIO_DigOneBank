//espelho da class conta
package one.digitalinnovation.espelho.max

import java.math.BigDecimal
import java.math.BigInteger

class Cadastro (
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
){
    fun deposito(valor: BigDecimal){}

    fun saque(valor: BigDecimal){}
}
