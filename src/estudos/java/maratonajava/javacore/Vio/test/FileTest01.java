package estudos.java.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {


        File file = new File("file.txt"); // ao passar o argumento, 2 opções: 1°: onde o prohgram ta sendo executado / 2° salavr em um llugar especifico, copiar o caminho absoluto (botao direito na pasta)
        try {

            boolean isCreated = file.createNewFile(); // criar arquivo
            System.out.println(isCreated);
            boolean isExist = file.exists(); // verificar se o arquivo existe

            System.out.println("path: " + file.getPath()); // caminho onde o arquivo está
            System.out.println("path absolute: " + file.getAbsolutePath()); // caminho ABSOLUTO onde o arquivo está
            System.out.println("is directory : " + file.isDirectory()); // se é um diretorio
            System.out.println("is file : " + file.isFile()); // se é um arquivo
            System.out.println("is hidden : " + file.isHidden()); // se é um oculto
            System.out.println("last modified : " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // ultima vez modificado (long)


            if(isExist){ // se o existir vir como V, ele entar no if e apaga o existente
                System.out.println("Deletado: " + file.delete()); // deletar o arquivo

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
