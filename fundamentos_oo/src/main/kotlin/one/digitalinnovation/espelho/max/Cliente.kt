//todas as classes criadas aqui são um espelho do projeto principal pois o projeto da aula ja estava completo
package one.digitalinnovation.espelho.max

//criando o objeto
class Cliente {
    var nome_cliente: String = "Max"
    var cpf_cliente: String ="123.456.789-12"
}


fun main(){
    val cliente = Cliente()//referenciando o objeto, na variavel cliente

    println(cliente.nome_cliente)
    println(cliente.cpf_cliente)
}