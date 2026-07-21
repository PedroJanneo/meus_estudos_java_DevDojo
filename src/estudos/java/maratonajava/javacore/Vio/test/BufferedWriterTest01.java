package estudos.java.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
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


public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("fileBufferedWriter.txt");

        try(FileWriter fw = new FileWriter(file, true);
        BufferedWriter bf = new BufferedWriter(fw)){ // bf dentro do try catch com recursos, para ter o close automatico
            bf.write("Hello World ");
            bf.newLine(); // pular linha
            bf.write("Ola 2");
            bf.flush();




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
