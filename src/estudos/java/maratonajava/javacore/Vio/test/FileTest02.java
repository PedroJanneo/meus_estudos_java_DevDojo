package estudos.java.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {

        // criando pasta
        File direc = new File("pasta");
        boolean diretorio = direc.mkdir();
        System.out.println("Pasta criada " + diretorio);

        // Criando arquivo dentro da pasta:
        // metodo 1: copiar o cainho absoluto da pasta
        File arquivo = new File("C:\\Users\\Pedro\\Desktop\\PedroProjeto\\meus_estudos_java_maratonajava\\pasta\\arquivoDebtroPasta01.txt");
        try {
            boolean newFile = arquivo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // metodo 2: colcoar a variavel da pasta no argumento (codigo mais limpo)
        // direct tem a relação com a pasta, na linha 10
        File arquivodentroPasta = new File(direc,"arquivoDentroPasta02.txt");
        try {
            boolean newFile = arquivodentroPasta.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileAleatorio = new File(direc,"arquivoTeste.txt");// se eu passar o diretorio, ele vai ser renomeado e jogadopro mesmo diretorio, se NAO passar, ele vai ser renomeado e jogado pra raiz
        File fileAleatorioRaiz = new File("arquivoTesteRaiz.txt"); // se eu passar o diretorio, ele vai ser renomeado e jogadopro mesmo diretorio, se NAO passar, ele vai ser renomeado e jogado pra raiz
        File fileRename = new File(direc,"arquivo_renomeado.txt");  // com diretorio
        File fileRenameRaiz = new File("arquivo_renomeado_raiz.txt"); // sem diretorio
        boolean isRename = fileAleatorio.renameTo(fileRename);// o arquivoTeste, vai ser renomeado para arquivo_renomeado ( dentro da pasta)
        boolean isRenameRaiz = fileAleatorioRaiz.renameTo(fileRenameRaiz); // arquivoTesteRaiz vai ser renomeado para arquivo_renomeado_raiz ( na raiz)
        System.out.println("Arquivo dentro da pasta renomeado " + isRename); // diretorio passado
        System.out.println("Arquivo dentro da raiz renomeado " + isRenameRaiz); // diretorio nao passado

        File diretorioRename = new File("pasta2"); // novo nome para a pasta
        boolean isRenameDiretorio = direc.renameTo(diretorioRename); // renomeando a pasta (var: direct) para pasta2 (var: diretorioRename)
        System.out.println("Pasta renomeada: " + isRenameDiretorio);

    }
}
