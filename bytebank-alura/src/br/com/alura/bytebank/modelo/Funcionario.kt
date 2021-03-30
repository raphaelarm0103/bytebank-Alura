package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double = 0.0

) {
    abstract val bonificacao: Double

}