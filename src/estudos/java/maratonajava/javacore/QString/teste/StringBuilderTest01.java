package estudos.java.maratonajava.javacore.QString.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Pedro Janneo";
        nome.concat(" Peu");
        StringBuilder sb = new StringBuilder("Pedro"); // padrão 16 caracters
        sb.append(nome); // adicionando dentro do StringBuilder e ja printa
        System.out.println(sb);



    }
}
