package estudos.java.maratonajava.javacore.Npolimorfismo.test;

import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import estudos.java.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import estudos.java.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("NC100", 15000);
        // Produto produto2 = new Tomate("Americano", 5);
        // precisamos agora add uma data de validade, somente no tomate
        Tomate tomate = new Tomate("Americano", 5);
        tomate.setDataValidade("10/02/2024");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
