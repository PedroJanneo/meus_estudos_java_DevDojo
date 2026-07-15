package estudos.java.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;


public class LocaleTest01 {
    public static void main(String[] args) {
        // configurando o locale: "lingua", "PAIS"
        Locale localeItaly = new Locale("it","IT"); // colocando a config. do país
        Locale localeEUA = new Locale("eng","EUA");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeEUA);// data no formato EUA
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);// data formato italia
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL); // data formato BR



        System.out.println("EUA " + df1.format(calendar.getTime()));
        System.out.println("Italy " + df2.format(calendar.getTime()));
        System.out.println("BR " + df3.format(calendar.getTime()));

        System.out.println(localeEUA.getDisplayCountry()); // mostrar o país do locale
        System.out.println(localeItaly.getDisplayCountry(localeEUA)); // mostra o país na lingua escolhida dentro do getDisplayCountry
    }
}
