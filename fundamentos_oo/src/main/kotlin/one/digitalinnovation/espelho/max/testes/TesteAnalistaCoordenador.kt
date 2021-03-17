package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.Coordenador

fun main(){
    val marlene = Coordenador(nome = "Marlene Silva", cpf = "1234567899", salario = 3000.00)
    ImprimeRelatorioAnalista.imprime(marlene)
}
