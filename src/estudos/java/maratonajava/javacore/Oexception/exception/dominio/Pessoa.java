package estudos.java.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;


public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException { // nenhuma, uma ou RunTime; nao usar exceçoes genericas
        System.out.println("Salvando pessoa");

    }
}
