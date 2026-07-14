package estudos.java.maratonajava.javacore.QString.teste;

import javax.swing.*;

/**
 * Classe para testar a performance de concatenação de Strings.<br>
 * * --- ENTENDENDO OS TIPOS --- <br>
 * * <b>1. String (Imutável): </b>
 * - O que é: Uma sequência de caracteres imutável.
 * - Como funciona: Toda vez que você altera uma String (ex: texto += "a"), o Java não altera o texto original.
 * Ele cria um NOVO objeto String na memória (String Pool) e descarta o anterior.
 * - Quando usar: Para valores que mudam pouco ou nunca, ou em concatenações muito simples e isoladas. <br>
 * * <b> 2. StringBuilder (Mutável / Single-Thread): </b>
 * - O que é: Uma classe mutável (permite modificar o conteúdo sem criar novos objetos na memória).
 * - Como funciona: Trabalha internamente com um array de caracteres que se expande conforme necessário.
 * - Quando usar: Em loops, concatenações massivas ou dinâmicas executadas por APENAS UMA THREAD (Single-thread).
 * É a escolha padrão para quase 100% dos casos do dia a dia por ser extremamente rápida. <br>
 * * <b> 3. StringBuffer (Mutável / Multi-Thread): </b>
 * - O que é: Exatamente igual ao StringBuilder, mas com segurança de thread (Thread-safe).
 * - Como funciona: Seus métodos são sincronizados (`synchronized`). Isso impede que duas threads alterem o buffer ao mesmo tempo, evitando corrupção de dados.
 * - Quando usar: Apenas quando MÚLTIPLAS THREADS precisarem ler/escrever no mesmo objeto ao mesmo tempo.
 * Por ter o peso da sincronização, ele é um pouco mais lento que o StringBuilder.
 */
public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); // Pegar tempo inicial em milissegundos
        concatString(100_000); // Esse _ serve para facilitar a leitura de números grandes (igual ao ponto comercial)
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String comum: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer: " + (fim - inicio) + " ms");
    }

    /**
     * PÉSSIMA PERFORMANCE
     * Cria 100 mil objetos temporários na memória devido à imutabilidade.
     */
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    /**
     * EXCELENTE PERFORMANCE (Single-Thread)
     * Altera o mesmo objeto na memória de forma direta e rápida.
     */
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    /**
     * BOA PERFORMANCE (Multi-Thread / Seguro)
     * Altera o mesmo objeto na memória, mas com travas de segurança para sincronismo.
     */
    private static void concatStringBuffer(int tamanho){
        StringBuffer bf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            bf.append(i);
        }
    }
}