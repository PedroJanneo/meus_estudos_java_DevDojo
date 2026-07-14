package estudos.java.maratonajava.javacore.QString.teste;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "         Peu             ";

        System.out.println(nome.charAt(2)); // procura a letra dentro do index
        System.out.println(nome.length()); // metodo para recuoerar o tamanho da String
        System.out.println(nome.replace("P","l")); // trocar as letras, sai o primeiro argumento e entra o segundo
        System.out.println(nome.toLowerCase()); //transformar em minuscula
        System.out.println(nome.toUpperCase()); // transfomar em MAIUSCULA
        System.out.println(nome.trim()); //tirar o espaco em branco do começo e fim

        String numeros = "012345";

        System.out.println(numeros.length());
        System.out.println(numeros.substring(3));
        System.out.println(numeros.replace("3","4").substring(3));

    }
}
