package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

abstract class FuncionarioAdmin(
   nome: String,
   cpf: String,
   salario: Double,
   protected val senha: Int
) : br.com.alura.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), br.com.alura.bytebank.interfaces.Autenticavel {

   override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}