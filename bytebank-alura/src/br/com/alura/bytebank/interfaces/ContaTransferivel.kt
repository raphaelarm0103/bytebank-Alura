package br.com.alura.bytebank.interfaces

import br.com.alura.bytebank.modelo.Conta

interface ContaTransferivel {

    fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta): Boolean

}