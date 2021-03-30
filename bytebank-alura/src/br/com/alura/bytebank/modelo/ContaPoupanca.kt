package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.ContaTransferivel

class ContaPoupanca(titular: Cliente, numero: Int) : br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
), br.com.alura.bytebank.interfaces.ContaTransferivel {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }


    }

        override fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta): Boolean {
            if (saldo >= valor) {
                saldo -= valor
                destino.deposita(valor)
                return true
            }
            return false
        }
    }
