package estudos.java.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // ver a linguagem definida pela JVM
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for ( String isoLanguage : isoLanguages){ // linguagens suportadas
            System.out.print(isoLanguage + " ");
        }
        System.out.println();

        for ( String isoCountry : isoCountries){ // paises suportados
            System.out.print(isoCountry + " ");
        }
    }
}
