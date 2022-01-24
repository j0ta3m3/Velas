fun main(args: Array<String>) {
    imprimirVelas(4)
    imprimirCapaSuperior(4)
    imprimirCapasInf(4, 10)
}

fun imprimirVelas(edad: Int) {
    println("'".repeat(edad))
    println("|".repeat(edad))
}

fun imprimirCapaSuperior(edad: Int) {
    println("=".repeat(edad))
}

fun imprimirCapasInf(edad: Int, capas: Int) {
    repeat(capas) { println("@".repeat(edad)) }
}
