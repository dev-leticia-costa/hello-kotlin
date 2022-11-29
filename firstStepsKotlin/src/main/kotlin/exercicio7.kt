import java.util.*

//recebe um valor e verifica se é divisivel por 2, se sim -> é divisivel
fun main()  {
    var scanner = Scanner(System.`in`)
    print("Digite um valor: " )
    var numero: Int
    numero = scanner.nextInt()
println("Esse é o seu número: $numero")
    when (numero % 2 ) {
        0 -> println("É divisível por 2")
        else -> println("Não é divisível por 2")

    }



//
//    var valor: Int = scanner.nextInt()
//    if(valor % 2 = 0 ) {
//        print("É divisível")
//    }


//    println("Olá, eu sou o meu primeiro front")//println já pula linha
//    print("Digite seu nome: ")
//    val nome = scanner.nextLine()
//    println("Prazer $nome")
}