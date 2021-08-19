package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo", "123.123.123.99", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}