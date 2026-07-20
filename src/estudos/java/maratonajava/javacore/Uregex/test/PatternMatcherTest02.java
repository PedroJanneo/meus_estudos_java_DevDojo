package estudos.java.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b> Metas caracters: </b> <br>
 * \d = retorna todos os digitos (numeros)
 * \D = retorna tudo que nao for numero
 * \s = retorna espaco em branco ( \t \n \f \r )
 * \S = retorna tudo excluindo os espaços em brancos
 * \w = retorna a-ZA-Z, digito e _
 * \W = retorna o oposto do \w
 */

public class PatternMatcherTest02 {
    public static void main(String[] args) {



        String regex = "\\W";
        String texto = "abaaba";
        String texto2 = "h@hj212 gvh21 kh\t2_";

        Pattern pattern =Pattern.compile(regex); // oqo é para achar
        Matcher matcher = pattern.matcher(texto2); // onde procurar

        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 012345678910");
        System.out.println("Regex: " + regex);
        System.out.println("Posicoes encontradas: ");

        // loop para procurar
        while ( matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n") ; // aqui le vai procurar e mostrar oq achou
        }



    }
}
