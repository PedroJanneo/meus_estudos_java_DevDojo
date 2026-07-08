package estudos.java.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt"); // o contra barra duplo, serve para transformar a segunda contra barra em string ( ficando arquivo/teste.txt )

        // try -> tenta executar tudo o que tiver dentro deste bloco
        try{
            boolean isCriado = true;
            System.out.println("arquivo criado: " + isCriado);
            file.createNewFile();
            // catch ele pega o erro dado ( NUNCA deixar em branco ) / se entarr no catch, o TRY não foi executado
            // nao usar logica de negocio dentro do catch
        } catch (IOException e){
            e.printStackTrace(); // imprimir rastros do erro na execucao, mostrando exatamente o erro e os metodos que foram chamados até dar a falha
        }

    }
}
