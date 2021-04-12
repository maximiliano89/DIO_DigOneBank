package max.one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao,pedro, maria)

    funcionarios.forEach { println(it) }

    println("----------------------")
    println(funcionarios.find { it.nome =="Maria" })

    println("----------------------")
    funcionarios
        .sortedBy { it.salario }//ordena por aqui que nos colocarmos em {}
        .forEach { println(it) }


    println("----------------------")
    funcionarios
        .groupBy { it.tipoContratacao }//ordena por aqui que nos colocarmos em {}
        .forEach { println(it) }
}

