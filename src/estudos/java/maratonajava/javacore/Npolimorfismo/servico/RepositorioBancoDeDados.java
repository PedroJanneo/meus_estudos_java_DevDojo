package estudos.java.maratonajava.javacore.Npolimorfismo.servico;

import estudos.java.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
