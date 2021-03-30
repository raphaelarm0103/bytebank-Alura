package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

class SistemaInterno {

    fun entra(funcionarioAdmin: br.com.alura.bytebank.interfaces.Autenticavel, senha: Int) {
        if (funcionarioAdmin.autentica(senha)) {
            println("sucesso, bem vindo")
        } else {
            println("deu ruim opa opa")
        }
    }
}