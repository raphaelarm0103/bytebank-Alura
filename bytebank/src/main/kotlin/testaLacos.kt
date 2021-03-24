fun testaLacos() {
    var i = 0
    while (i <= 5) {
        val titular: String = "Raphael $i"
        val numeroConta: Int = 100 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

}