package br.com.alura.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double = 0.0
) : br.com.alura.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

}