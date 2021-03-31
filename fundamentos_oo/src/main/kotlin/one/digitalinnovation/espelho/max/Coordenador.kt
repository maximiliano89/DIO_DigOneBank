package one.digitalinnovation.espelho.max
//espelho do gerente
class Coordenador(nome: String, cpf: String,salario : Double )
    : Analista(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio(): Double =  salario * 0.4
}