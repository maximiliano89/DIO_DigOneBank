package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.Cliente


fun main(){
    val cliente1 = Cliente(nome = "Maximiliano Almeida", cpf = "1234567899")//referenciando o objeto, na variavel cliente

    println(cliente1.nome)
    println(cliente1.cpf)
}