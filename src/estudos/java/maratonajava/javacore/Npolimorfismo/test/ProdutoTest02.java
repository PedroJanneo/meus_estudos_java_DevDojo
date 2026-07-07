package estudos.java.maratonajava.javacore.Npolimorfismo.test;

import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("NC100", 15000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println(" ------------------------------- ");
        Produto produto2 = new Tomate("Americano", 5);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        System.out.println(" ------------------------------- ");
        Produto produto3 = new Televisao("LG 55\" ", 1999.99);

        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.calcularImposto());
    }
}
