package estudos.java.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
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
 * [] = retorna as letras que estrao dentro das chaves
 * [a-zA-D] = retorna de a ate z minusculo, e do A até D maisuculo
 * ? = zero ou uma ocorrencia
 * * = zero ou mais ocorrencia
 * + = uma ou mais ocorrencias
 * {n,m} = de n ate m (de 3,5) ocorrencias
 * () = agrupamento
 * | = o(v|c)o vai acertar ocrrencias de ovo ou oco
 * . = retorna qualquer caractere (ex: 1.3 aceita 1A3, 1@3, 123)
 * [1-3] = retorna numeros no intervalo de 1 a 3 (ex: aceita 1, 2 ou 3)
 * $ = fim da linha
 * ^ = comeco da linha (ex: ^Bom acerta "Bom dia", mas nao acerta "Muito Bom dia")
 * [^] = negacao/tudo exceto (ex: [^0-9] acerta qualquer coisa que NAO seja numero)
 */

public class PatternMatcherTest05 {
    public static void main(String[] args) {



        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        // ([a-zA-Z0-9\\._-])+ = aceita letras a até z, A até Z, 0 até 9, com . (podendo ter uma ou mais ocorrencias)
        // @ = tem que ter o @
        // ([a-zA-Z])+ aceita letras a até z, A até Z (podendo ter uma ou mais ocorrencias)
        // (\.([a-zA-Z])+)+ = tem que ter o ., podendo ter letras de a até z, A até Z (podendo ter uma ou mais ocorrencias)
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail"; //string emails
        System.out.println("Valido: " + "#@!zoro@mail.br".matches(regex)); // verificar se o email é valido
        System.out.println(Arrays.toString(texto2.split(",")));
        System.out.println(texto2.split(",")[1].trim()); // remover espaço

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
