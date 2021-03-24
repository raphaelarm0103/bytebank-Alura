fun testaComportamentosConta() {
    val conta = Conta("raphael", 1000)

    conta.deposita(200.0)
    println(conta.titular)
    println(conta.numero)
    println(conta.saldo)

    val conta2 = Conta("Fran", 1001)

    conta2.deposita(300.0)
    println(conta2.titular)
    println(conta2.numero)
    println(conta2.saldo)


    println("Depositando na conta do Raphael")
    conta.deposita(50.0)
    println("o saldo atual é de ${conta.saldo}")

    println("Depositando na conta do Fran")
    conta2.deposita(70.0)
    println("o saldo atual da Fran é de ${conta2.saldo}")

    println("sacando da conta rphael")
    conta.saca(200.0)
    println("o saldo atual é ${conta.saldo}")


    println("transferencia ::")
    if (conta2.transfere(100.00, conta)) {
        println("transferencia sucedida")
    } else {
        println("fracasso")
    }
}
