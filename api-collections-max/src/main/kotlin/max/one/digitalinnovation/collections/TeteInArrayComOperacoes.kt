package max.one.digitalinnovation.collections

fun main(){

    val salarios = doubleArrayOf(1000.00,2250.00,4000.00)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    val salariosMenorQue2500 = salarios.filter { it > 2500.00 }
    println("-------------------------")
    salariosMenorQue2500.forEach {println(it)}

    println("-------------------------")
    println(salarios.find {it == 2250.00})
    println(salarios.find {it == 500.00})

    println("-------------------------")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})
}

