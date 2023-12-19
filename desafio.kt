enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val name: String, val idade: Int, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun adicionarConteudo(conteudo: ConteudoEducacional){
        conteudos.add(conteudo)
    }
}

fun main() {
    val usuario = Usuario("Joao", 20, "joao@email.com")

    val conteudo = ConteudoEducacional("Logica de Programacao")

    val formacao = Formacao("Desenvolvedor Full Stack", mutableListOf(conteudo))
    
    formacao.matricular(usuario)
   	formacao.adicionarConteudo(ConteudoEducacional("Bancos de Dados", 80))
    formacao.adicionarConteudo(ConteudoEducacional("Kotlin backend", 120))
    
    println(usuario)
    println(formacao.nome)
    println(formacao.conteudos)
    println(conteudo) 
}