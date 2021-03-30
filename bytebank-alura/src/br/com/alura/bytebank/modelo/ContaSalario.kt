package br.com.alura.bytebank.modelo

class ContaSalario(titular: Cliente, numero: Int) : br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }

}