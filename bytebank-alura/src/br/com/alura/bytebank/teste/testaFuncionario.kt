

fun TestaFuncionario() {
    val alex = br.com.alura.bytebank.modelo.Analista(
        "Raphael",
        "10158190602",
        2500.0
    )

    println("nome ${alex.nome}")
    println("nome ${alex.cpf}")
    println("nome ${alex.salario}")
    println("nome ${alex.salario}")
    println("boni ${alex.bonificacao}")


    println("===============")

    val fran = br.com.alura.bytebank.modelo.Gerente(
        "Fran",
        "7986191202",
        5000.0,
        123456
    )
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(123456)) {
        println("autenticou sucesso")
    } else {
        println("falhou!!")
    }

    val rapha = br.com.alura.bytebank.modelo.Diretor(
        nome = "raphael",
        cpf = "010101010",
        salario = 6000.0,
        senha = 1234,
        plr = 100.0
    )

    println("nome ${rapha.nome}")
    println("cpf ${rapha.cpf}")
    println("salario ${rapha.salario}")
    println("bonificação ${rapha.bonificacao}")


    val calculadora = br.com.alura.bytebank.modelo.CalculadoraBonificacao()
    calculadora.registra(rapha)
    calculadora.registra(alex)
    calculadora.registra(fran)

    println("resultado da calculadora: ${calculadora.total}")

    val maria: br.com.alura.bytebank.modelo.Funcionario = br.com.alura.bytebank.modelo.Analista(
        nome = "Maria",
        cpf = "344.444.444-41",
        salario = 4000.0
    )
    calculadora.registra(maria)
    println("total de bonificação: ${calculadora.total}")
}