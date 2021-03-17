package one.digitalinnovation.espelho.max

import one.digitalinnovation.espelho.max.Analista
import java.math.BigDecimal

class Trabalhador(nome: String, cpf: String, salario: Double)
    : Analista(nome, cpf, salario) {
    override fun calculoAuxilio() = salario *0.1
}