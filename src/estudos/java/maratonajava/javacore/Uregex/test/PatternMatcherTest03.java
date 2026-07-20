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
 * // [] = retorna as letras que estrao dentro das chaves
 * [a-zA-D]= retorna de a ate z minusculo, e do A até D maisuculo
 */

public class PatternMatcherTest03 {
    public static void main(String[] args) {



        String regex = "0[xX][0-9a-fA-F]"; // pegar oq começa com 0, aceita X maisculo e minusculo, numeros 0-9, a ate f minusculo e A ate F maiusculo
        String texto = "abaaba";
        String texto2 = "12 0x 0X 0XFFABC 0x109 0x1"; //string com numero hexa

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

        int hex = 0XFFFFFF; // para o java entender o número hexa, tem que ter o 0 e o X no começo / e a letra nao pode passar de F
//        System.out.println(hex);



    }
}
