package estudos.java.maratonajava.javacore.Vio.test;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File = trabalhar com arquivo <br>
 * FileWriter = escrever no arquivo (low level/ nao utilizada)  <br>
 * FileReader = ler arquivo (low level/ nao utilizada) <br>
 * BufferWriter = escrita performatica <br>
 * BufferReader = leitura performatica
 */

public class FileWriterTest01 {
    public static void main(String[] args) {

        File file = new File("fileWriter.txt");

        try(FileWriter fw = new FileWriter(file, true)) { // fazendo o try com recursos, ele ja fecha automaticamente ( file.close())
            fw.write("Hello World\nOla 2"); // ecscrever no arquivo / caso voce mude o texto, ele vai  rescreever ( se colcoaar true no argumento, ele so adiciona)
            fw.flush(); // gospe tudo que ter no buffer e chama o close




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
