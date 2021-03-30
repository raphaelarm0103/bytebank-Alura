import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = br.com.alura.bytebank.modelo.Gerente(
        nome = "Alex ",
        cpf = "11.1.1.1.1.1",
        salario = 2500.0,
        senha = 1000
    )

    val diretor = br.com.alura.bytebank.modelo.Diretor(
        nome = "Raphael",
        cpf = "333.444.555-22",
        salario = 8000.0,
        senha = 1002,
        100.0
    )

    val cliente = br.com.alura.bytebank.modelo.Cliente(
        nome = "Gui",
        cpf = "111.222.333-44",
        senha = 1234
    )

    val sistema = br.com.alura.bytebank.modelo.SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 1002)
    sistema.entra(cliente, 1234)








}