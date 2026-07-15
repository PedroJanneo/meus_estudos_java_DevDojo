package estudos.java.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localCanada = Locale.CANADA;
        Locale localeJP = Locale.JAPAN;
        Locale localItaly = Locale.ITALY;


        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getNumberInstance();
        nfa[1] = NumberFormat.getNumberInstance(localCanada);
        nfa[2] = NumberFormat.getNumberInstance(localeJP);
        nfa[3] = NumberFormat.getNumberInstance(localItaly);

    double valor = 10_000.2121;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2); // setando o maaximo fracional pra 2
            System.out.println(numberFormat.format(valor)); // ver valores de cada pais, de como eles formatam o numero
            System.out.println(numberFormat.getMaximumFractionDigits());
            
        }

        String valorTexto = "1_000.21";

        try {
            System.out.println(nfa[0].parse(valorTexto)); // ele ai ignorar o _ ele é ocnsiderado como texto
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
