package max.one.digitalinnovation.collections

//nesse aqruivo vamos testar as arrays apresentadas no curso


fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)//arrey de inteiros
    val nomes = Array(3){""}//arrey de strings
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    val salarios = DoubleArray(3)//arrey de doubles
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println("-------------------------------------")
    println(" Exibindo os Array/lista de inteiros ")
    values.forEach {
        println(it)
    }

    println("-------------------------------------")
    values.sort()//funcao para ordenar de forma crescente os numeros
    values.forEach {
        println(it)
    }

    println("-------------------------------------")
    println(" Exibindo os Array/lista de strings ")
    for (nome in nomes ) {
        println(nome)
    }

    println("-------------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------------------------")
    val nomes2 = arrayOf("Maria","Zazá","José")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-------------------------------------")
    println(" Exibindo os Array/lista de double ")
    salarios.forEach { println(it) }

    println("-------------------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-------------------------------------")
    val salarios2 = arrayOf(1000.0,3000.0,500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}