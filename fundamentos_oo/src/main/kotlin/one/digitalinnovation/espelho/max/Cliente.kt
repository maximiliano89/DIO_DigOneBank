//todas as classes criadas aqui são um espelho do projeto principal espelho da Classe Pessoa
package one.digitalinnovation.espelho.max

//criando o objeto
class Cliente {//class principal
    var nome_cliente: String = "Max"
    //private var nome_cliente: String = "Max" se for feito dessa maneira, só é possivel interagir coma variavel dentro da classe cliente
    var cpf_cliente: String ="123.456.789-12"
    private set //assim so pode ser inserido valor na variavel dentro da classe isso impede que essa variavel seja alterada em outro lugar do codigo

}


fun main(){
    val cliente = Cliente()//referenciando o objeto, na variavel cliente

    println(cliente.nome_cliente)
    println(cliente.cpf_cliente)


}