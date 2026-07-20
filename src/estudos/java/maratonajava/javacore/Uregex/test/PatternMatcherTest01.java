package estudos.java.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // padroes no texto
        // usadado para validacoes

        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern pattern =Pattern.compile(regex); // oqo é para achar
        Matcher matcher = pattern.matcher(texto2); // onde procurar

        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posicoes encontradas: ");

        // loop para procurar
        while ( matcher.find()){
            System.out.print(matcher.start()+ " ") ; // com regex novo e o texto 2, ele vaicomeçar contar do incice 3, e vai ignorar o indice 3, pois o regex comeca com a // so mostrar onde achou (posicao)
        }



    }
}
