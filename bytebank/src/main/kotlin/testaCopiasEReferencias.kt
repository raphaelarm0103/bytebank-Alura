fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX ")
    println("numeroY $numeroY")

    val contaJoao = Conta("joao", 1002)

    var contaMaria = Conta("maria", 1003)


    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta joão: ${contaMaria.titular}")
}
