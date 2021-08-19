package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Siamese"

    var cpf: String = "123.123.123.99"
    private set
}

fun main() {
    val siamese = Pessoa()

    println(siamese.nome)
    println(siamese.cpf)
}