package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} $elemento")
    }

    ClienteTipo.values().forEach { it
    println("${it.name} - $it")}
}