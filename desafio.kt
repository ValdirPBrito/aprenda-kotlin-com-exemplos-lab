import Formacao


    fun main(){
        val listaUsuarios: MutableList<Usuario> = mutableListOf()
        val listaConteudos: MutableList<ConteudoEducacional> = mutableListOf()
        listaUsuarios.add(Usuario(1,"Antonio","antonio@gmail.com"))
        listaUsuarios.add(Usuario(2,"Bill","bill@gmail.com"))
        listaUsuarios.add(Usuario(3,"Carlos","carlos@gmail.com"))
        listaUsuarios.add(Usuario(4,"Danny","danny@gmail.com"))
        listaConteudos.add(ConteudoEducacional(1,"Apresentação", 10,
            "Apresentação do curso de Kotlin","João",Nivel.BASICO))
        listaConteudos.add(ConteudoEducacional(2,"Variáveis", 40,
            "Tipos de Variáveis em Kotlin","João",Nivel.BASICO))
        listaConteudos.add(ConteudoEducacional(3,"Funções", 60,
            "Apresentação de funções em Kotlin","João",Nivel.BASICO))
        listaConteudos.add(ConteudoEducacional(4,"Classes", 60,
            "Apresentação das classes de Kotlin","João",Nivel.BASICO))

        val formacaoKotlin:Formacao = Formacao(1,"Formação Kotlin", Nivel.BASICO, listaConteudos,listaUsuarios)
        formacaoKotlin.adicionarConteudo(ConteudoEducacional(5,"Exceções",60,
                                "Tratamento de Exceções em Kotlin","João",Nivel.INTERMEDIARIO))
        formacaoKotlin.removerConteudo(listaConteudos[1])
        formacaoKotlin.matricular(Usuario(5,"Elias","elias@gmail.com"))
        formacaoKotlin.removerMatricula(listaUsuarios[3])
        formacaoKotlin.exibirDetalhes()
    }
