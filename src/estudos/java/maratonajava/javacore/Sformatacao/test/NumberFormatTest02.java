package estudos.java.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localCanada = Locale.CANADA;
        Locale localeJP = Locale.JAPAN;
        Locale localItaly = Locale.ITALY;




        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localCanada);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localItaly);

    double valor = 10_000.2121;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor)); // ver valores de cada pais, de como eles formatam o valor monetario
            System.out.println(numberFormat.getMaximumFractionDigits()); // ver valores fracionais ( pós vírgula )
            
        }


        String valorTexto = "R$ 10.000,21"; // transfomando essa var em valor monetario, o try funciona

        try {
            System.out.println(nfa[0].parse(valorTexto));
        } catch (ParseException e) {
           e.printStackTrace();
        }

    }
}
