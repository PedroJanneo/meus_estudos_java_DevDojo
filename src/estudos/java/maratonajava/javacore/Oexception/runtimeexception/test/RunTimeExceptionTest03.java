package estudos.java.maratonajava.javacore.Oexception.runtimeexception.test;

import java.io.IOException;

/**
 * quando abrir um TRY tem que ter ou um Catch ou um Finally
 */
public class RunTimeExceptionTest03 {
    public static void main(String[] args) {

        extracted();
        extracte2d();

    }

    private static String extracted() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("escrevendo");
            System.out.println("fechando SO try");
            return "Conexao aberta";
        } catch (Exception e){
         System.out.println("Fechando SO catch");
         e.printStackTrace();
        } finally { // bloco de codigo SEMPRE será executaado
            System.out.println("Fechando SO finally");
        }
        return null;
    }

    private static String extracte2d() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("escrevendo");
            System.out.println("fechando SO try");
            return "Conexao aberta";
        } finally {
            System.out.println("SO finally");
        }

    }
}
