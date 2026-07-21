package estudos.java.maratonajava.javacore.Vio.test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * File = trabalhar com arquivo <br>
 * FileWriter = escrever no arquivo (low level/ nao utilizada)  <br>
 * FileReader = ler arquivo (low level/ nao utilizada) <br>
 * BufferWriter = escrita performatica <br>
 * BufferReader = leitura performatica
 */

public class FileBufferedReaderTest01 {
    public static void main(String[] args) {

        File file = new File("fileBufferedReader.txt");
        try(FileReader fr = new FileReader(file); BufferedReader bf = new BufferedReader(fr)){ // fazendo o try com recursos, ele ja fecha automaticamente ( BufferReader.close())


            String linha;
 // leitura por linha
            while( (linha = bf.readLine()) != null){
                System.out.println(linha);
            }


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
