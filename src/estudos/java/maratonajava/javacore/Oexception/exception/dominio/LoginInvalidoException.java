package estudos.java.maratonajava.javacore.Oexception.exception.dominio;

/**
 * Todas exceções (arquivos) vão terminar co, Exception no nome
 */
public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(){
        super("Login Invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
