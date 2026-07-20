package estudos.java.maratonajava.javacore.Tresourcesbyddle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Como criar o arquivo? <br>
 * Tem que ter exatamente o nome messages, separado por _ com linguagem e o país, ficando: messages_pt_BR <br>
 * Sempre dentro do SRC
 * <b>PASSO A PASSO IMPORTANTE: </b> <br>
 *  Caso tenhamos um Locale ("fr","CA") ele vai procurar o messages_fr_CA.properties, se nao achar, ele vai procurar messages_fr.properties <br>
 *  se nao achar, vai procurar arquivo com o Locale.getDefault no meu caso, messages_pt_BR.properties) <br>
 *  se nao achar, vai procurar por messages_pt.properties, se não achar também, vai pro default/arquivo base: messages.properties <br>
 *  se mesmo assim nao achar, vem uma excessao MissingResourceException
 */

public class ResourceBuddleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR")); // fazendo a conexao ao arquivo
        boolean teste = bundle.containsKey("good morning"); // vereficar se existe dentro do arquivo messages_pt_BR
        System.out.println(teste);

        System.out.println(bundle.getString("hello")); // vai buscar a chave hello dentro do arquivo messages_pt_BR e "traduzir" para o que tiver laa
        System.out.println(bundle.getString("get"));
        System.out.println(bundle.getString("hi")); // neste caso, o hi, nao esta no message_pt_BR.properties, então ele foi direto para messages.properties
        System.out.println("good morning");

        System.out.println("_-----_");
       bundle = ResourceBundle.getBundle("messages", new Locale("en","US"));
        System.out.println(bundle.getString("Bom.dia"));
        System.out.println(bundle.getString("Oi"));

        System.out.println(bundle.getString("hi")); // neste caso, o hi, nao esta no message_en_US.properties, então ele foi direto para messages.properties



    }
}
