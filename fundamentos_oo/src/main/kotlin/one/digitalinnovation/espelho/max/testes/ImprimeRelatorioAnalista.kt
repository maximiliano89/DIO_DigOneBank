package one.digitalinnovation.espelho.max.testes

import one.digitalinnovation.espelho.max.Analista
import one.digitalinnovation.espelho.max.Trabalhador

class ImprimeRelatorioAnalista {
    companion object{
        fun imprime(analista: Analista){
            println(
                analista.toString()
            )
        }
    }
}