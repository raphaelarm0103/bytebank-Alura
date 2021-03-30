import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")



    val contaJoao = ContaCorrente(Cliente(nome = "João", cpf= "1001002..22", senha= 1), 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = br.com.alura.bytebank.modelo.ContaPoupanca(Cliente(nome="Maria", cpf="1003222.333", senha = 2),1003)
    contaMaria.titular.nome = "Maria"
     "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}