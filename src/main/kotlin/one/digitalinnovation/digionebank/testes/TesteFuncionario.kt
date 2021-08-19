package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val siamese = Pessoa(nome = "Siamese Cat", cpf = "123.123.123.99")
    println(siamese.nome)
    println(siamese.cpf)

    val joao = Funcionario("Siamese Cat", cpf = "123.123.123.99", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}