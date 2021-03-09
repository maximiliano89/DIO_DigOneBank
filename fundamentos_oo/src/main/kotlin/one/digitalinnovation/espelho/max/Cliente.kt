//todas as classes criadas aqui são um espelho do projeto principal espelho da Classe Pessoa
package one.digitalinnovation.espelho.max

//criando o objeto
class Cliente {//class principal
    var nome_cliente: String = "Max"
    var cpf_cliente: String ="123.456.789-12"

    inner class Endereco(){//class secundaria, somente acessivel via objeto Cliente
        var rua : String = "Rua Logo Ali"
    }

}


fun main(){
    val cliente = Cliente()//referenciando o objeto, na variavel cliente

    println(cliente.nome_cliente)
    println(cliente.cpf_cliente)

    println(cliente.Endereco().rua)
}