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
 * ? = zero ou uma ocorrencia
 * * = zero ou mais ocorrencia
 * + = uma ou mais ocorrencias
 * {n,m} = de n ate m (de 3,5) ocorrencias
 * () = agrupamento
 * | = o(v|c)o vai acertar ocrrencias de ovo ou oco
 * $ = fim da linha
 *
 */

public class PatternMatcherTest04 {
    public static void main(String[] args) {



        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        // Quero pegar tudo que comece com 0 e tenha x ou X = "0[xX]"
        // tem que ter umero do 0 ao 9 / letras do a ao f / letras do A ao F = [0-9a-fA-F]
        // com uma ou mais ocorrencias = +
        // tendo espaços em brancos OU até o fim da linha = \\s | $
        // o () serve para agrupamento

        String texto2 = "12 0x 0X 0XFFABC 0x10G 0x1"; //string com numero hexa

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 012345678910");
        System.out.println("Regex: " + regex);
        System.out.println("Posicoes encontradas: ");


        while ( matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n") ; // aqui le vai procurar e mostrar oq achou
        }





    }
}
