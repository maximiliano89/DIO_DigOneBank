package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.ClienteTipo

fun main(){
    //chamando direto o valor no Enum usando o value e o foreach
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} = ${elemento.descricao}")
    }

    ClienteTipo.values().forEach { it
    println("${it.name} - ${it.descricao}")}

    //instanciando o Enum em variaveis e acessando seu conteudo pela val declarada
    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}