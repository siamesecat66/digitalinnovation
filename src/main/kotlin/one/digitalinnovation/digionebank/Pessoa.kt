package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Siamese"
    var cpf: String = "123.123.123.99"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val siamese = Pessoa()
    println(siamese.pessoaInfo())
}