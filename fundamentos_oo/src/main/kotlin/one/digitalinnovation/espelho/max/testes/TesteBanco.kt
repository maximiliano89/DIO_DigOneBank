package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    //digiOneBank.nome ="teste" ele não permite pq na dataclass Banco ele esta marcado como VAL na sua declaração
    println(digiOneBank.nome)
    println(digiOneBank.numero)


    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())

}