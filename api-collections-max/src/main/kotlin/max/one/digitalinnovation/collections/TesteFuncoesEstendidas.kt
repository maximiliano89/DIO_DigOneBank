package max.one.digitalinnovation.collections

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("-----------------")
    println(salarios.media())//aqui ele esta usando as funções criadas la em FuncoesEstendidas.kt as mesmas não são originais do sistema para um array mas aparecem aqui

    println("-----------------")
    println(salarios.somatoria())
}