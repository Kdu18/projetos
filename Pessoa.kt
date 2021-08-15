package one.digitalinnovation.digionebank

class Pessoa {
    //PROPIEDADE
    var nome: String= "Carlos"
    var cpf: String = "123.123.123-12"

    private set
}

fun main(){
    // INSTÂNCIAÇÃO DO OBJETO
    val pessoa1 = Pessoa()
    print(pessoa1)

    println(pessoa1.nome)
    println(pessoa1.cpf)
}