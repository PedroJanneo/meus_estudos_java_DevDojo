package estudos.java.maratonajava.javacore.Vio.test;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File = trabalhar com arquivo <br>
 * FileWriter = escrever no arquivo (low level/ nao utilizada)  <br>
 * FileReader = ler arquivo (low level/ nao utilizada) <br>
 * BufferWriter = escrita performatica <br>
 * BufferReader = leitura performatica
 */

public class FileReaderTest01 {
    public static void main(String[] args) {

        File file = new File("fileReader.txt");
        try(FileReader fr = new FileReader(file)){ // fazendo o try com recursos, ele ja fecha automaticamente ( file.close())
            // metodo de leitura:
//            char[] in = new char[30]; // retorna um inteiro (quantidade de caracter que ele leu)
//            fr.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            }
            // metodo de leitura melhor
            int i;
            while((i =fr.read()) != -1){
                System.out.print((char) i);


            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
