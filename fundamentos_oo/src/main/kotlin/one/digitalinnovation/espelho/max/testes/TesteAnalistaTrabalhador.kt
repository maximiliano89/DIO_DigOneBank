package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.Trabalhador

/*
fun main(){
    //após transformar a class Cliente em abstract ela não pode mais ser instanciada, por isso será comentado o arquivo todo para não dar erro

    val cliente2 = Cliente(nome = "Maximiliano Almeida", cpf = "1234567899")//referenciando o objeto, na variavel cliente

    println(cliente2.nome)
    println(cliente2.cpf)

    val time = Analista(nome = "Maximiliano Almeida", cpf = "1234567899", BigDecimal.valueOf(2000.0))
    println("${time.nome} ,${time.cpf} com salario de ${time.salario}" )
}
*/

fun main(){
    val max = Trabalhador(nome = "Maximiliano", cpf = "1234567891", salario = 2000.00)
    ImprimeRelatorioAnalista.imprime(max)
}

