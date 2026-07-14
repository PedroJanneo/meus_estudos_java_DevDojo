package estudos.java.maratonajava.javacore.QString.teste;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Pedro"; // String constant pool (literal)
        String nome2 = "pedro";

        System.out.println(nome.equals(nome2)); // verifica o valor
        System.out.println(nome == nome2); // verifica a ref de memoria


        System.out.println(nome.concat(" Janneo ")); // concatenar strings
        System.out.println(nome + 2 );// concatenar string e numeros);
        nome= nome.concat(" Janneo");
        System.out.println(nome2);
        String nome3 = new String("pedro"); // 1 variavel de referencia, 2 obejto do tipo string, 3 string do tipo pool
        System.out.println("---");
        System.out.println(nome2 == nome3); // nome3 é uma nova memória
        System.out.println(nome2 == nome3.intern()); // verifica o valor
    }
}
