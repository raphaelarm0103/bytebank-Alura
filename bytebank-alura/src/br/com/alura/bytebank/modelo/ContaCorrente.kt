package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.ContaTransferivel

class ContaCorrente(titular: Cliente, numero: Int) : br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
), br.com.alura.bytebank.interfaces.ContaTransferivel {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
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