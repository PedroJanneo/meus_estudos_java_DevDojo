package estudos.java.maratonajava.javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/***
 * Forma de capturar multiplas exceções <br>
 * Colocar os tipos de erros mais especifico antes,depois os mais genericos
 */
public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
                throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e ){
            System.out.println("Dentro do IndexOutOfBoundsException ");
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }

        try{
            talvezTenhaException();

        } catch (Exception e){

        }
    }

    private static  void talvezTenhaException() throws SQLException, FileNotFoundException{

    }
}
