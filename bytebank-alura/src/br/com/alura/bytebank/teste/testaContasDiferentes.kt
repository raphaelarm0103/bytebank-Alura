import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {

    val contaCorrente = br.com.alura.bytebank.modelo.ContaCorrente(titular = Cliente(nome= "Alex", cpf ="123", senha = 1), numero = 1001)

    val contaPoupanca = br.com.alura.bytebank.modelo.ContaPoupanca(titular = Cliente(nome="Fran", cpf= "", senha= 1002, endereco = Endereco("Rua Das Diretas")), numero = 1002)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo após transfefir corrente para poupança: ${contaCorrente.saldo}")
    println("saldo após receber de corrente para poupança: ${contaPoupanca.saldo}")

    val contaSalario = br.com.alura.bytebank.modelo.ContaSalario(titular = Cliente(nome="Raphael",cpf= "101", senha= 4), numero = 2021)

    contaCorrente.transfere(200.0, contaSalario)

    println("saldo da conta salário é de: ${contaSalario.saldo}")

    println("nome do titular é ${contaCorrente.titular.nome}")
    println("cpf é: ${contaCorrente.titular.cpf}")
    println("a conta é: ${contaCorrente.numero}")
    println("endereço é: ${contaPoupanca.titular.endereco.logradouro}")
}