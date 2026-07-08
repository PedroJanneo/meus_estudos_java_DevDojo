package estudos.java.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt"); // o contra barra duplo, serve para transformar a segunda contra barra em string ( ficando arquivo/teste.txt )
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado: " + isCriado);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }




    }
}
