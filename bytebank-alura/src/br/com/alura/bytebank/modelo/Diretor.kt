package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double = 0.0,
    senha: Int,
    val plr: Double
) : br.com.alura.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    override fun autentica(senha: Int): Boolean {
        return autentica(senha)
    }


}