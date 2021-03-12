package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.Analista
import one.digitalinnovation.espelho.max.Cliente
import java.math.BigDecimal


fun main(){
    val cliente2 = Cliente(nome = "Maximiliano Almeida", cpf = "1234567899")//referenciando o objeto, na variavel cliente

    println(cliente2.nome)
    println(cliente2.cpf)

    val time = Analista(nome = "Maximiliano Almeida", cpf = "1234567899", BigDecimal.valueOf(2000.0))
    println("${time.nome} ,${time.cpf} com salario de ${time.salario}" )
}