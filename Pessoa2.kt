package one.digitalinnovation.digionebank

//AULA SOBRE MEMBROS DA CLASSE

class Pessoa {
    //PROPIEDADE = PERMITEM AOS OBJETOS TEREM ESTADO
    var nome: String= "Carlos"
    var cpf: String = "123.123.123-12"

    private set
    //CONSTRUTOR SECUNDÁRIO QUE PODE SER PRIMÁRIO TAMBÉM
    constructor()

    //FUNÇÃO = PERMITEM AOS OBJETOS TEREM COMPORTAMENTO
    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    // INSTÂNCIAÇÃO DO OBJETO
    val pessoa1 = Pessoa()

    print(pessoa1.pessoaInfo())

}