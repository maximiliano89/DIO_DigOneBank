package one.digitalinnovation.espelho.max

class Coordenador(nome: String, cpf: String,salario : Double )
    : Analista(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio(): Double =  salario * 0.4
}