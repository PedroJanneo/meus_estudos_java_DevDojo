package estudos.java.maratonajava.javacore.Lclassesabstratas.test;

import estudos.java.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import estudos.java.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import estudos.java.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("Toya", 12000);
        System.out.println(dev);

        gerente.imprime();
        dev.imprime();
    }
}
