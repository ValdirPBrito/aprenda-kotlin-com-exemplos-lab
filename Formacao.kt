import ConteudoEducacional
import Nivel
import Usuario

data class Formacao(val id: Int,
                    val nome:String,
                    val nivel: Nivel,
                    val conteudos: MutableList<ConteudoEducacional> = mutableListOf(),
                    val inscritos: MutableList<Usuario> = mutableListOf()
){

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
    fun removerMatricula(usuario: Usuario){
        inscritos.remove(usuario)
        println("Usuário ${usuario.nome} foi removido da formação $nome.")
    }
    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
        println("Conteúdo '${conteudo.nome}' adicionado à formação $nome.")
    }

    fun removerConteudo(conteudo: ConteudoEducacional) {
        conteudos.remove(conteudo)
        println("Conteúdo '${conteudo.nome}' removido da formação $nome.")
    }

    fun exibirDetalhes() {
        println("Formação: $nome")
        println("Nível: $nivel")
        println("Conteúdos:")
        for (conteudo in conteudos) {
            println(" - ${conteudo.nome} ${conteudo.duracao} minutos - ${conteudo.descricao} por ${conteudo.autor} - nivel${conteudo.nivel}")
        }
        println("Inscritos:")
        for (inscrito in inscritos) {
            println(" - ${inscrito.nome} ${inscrito.email}")
        }
    }

}
