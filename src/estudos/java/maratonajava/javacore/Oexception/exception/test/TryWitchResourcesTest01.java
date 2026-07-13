package estudos.java.maratonajava.javacore.Oexception.exception.test;

import estudos.java.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import estudos.java.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWitchResourcesTest01 {
    public static void main(String[] args) {
        lerArquivoTeste();
    }


    public static void lerArquivoTeste(){
        try( Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){ // o leitor é lido na ordem inversa da implementada, neste caso, Leitor2 vem primeiro e Leitor1 em segundo

        } catch (IOException e){

        }
    }
    // try com recursos
    // try com recursos pode ficar sem o CATCH, porém adicionamos o THROWS no metodo
    public static void  lerArquivo(){
        try( Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        } catch (IOException e){

        }
    }

    // try sem recursos (try normal)
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally { // recomendado fechar .close() no finally,  pois é certeza que vai ser executado
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
