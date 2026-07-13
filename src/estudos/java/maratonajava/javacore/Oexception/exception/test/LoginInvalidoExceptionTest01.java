package estudos.java.maratonajava.javacore.Oexception.exception.test;

import estudos.java.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);


        String usernameDB = "Goku";
        String senhaDB = "123";
        System.out.println("Usuario: ");
        String userIn = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaIn = scanner.nextLine();

        if(!usernameDB.equals(userIn) || !senhaDB.equals(senhaIn)){
            throw new LoginInvalidoException("Usuario ou senha invalido");
        }
        System.out.println("Login logado com sucesso");

    }
}
