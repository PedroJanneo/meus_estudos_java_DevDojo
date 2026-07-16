package estudos.java.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * <b>LocalDate</b><br> Nao pode criar instancias <br>
 * O mesmo que o Calendar e o Date <br>
 * Imutavel <br>
 * <b> O mais recomendado para o uso nas versoes atuais</b>
 */
public class LocaleDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.FEBRUARY,2);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // descobrir e o ano é BISSEXTO, true pra sim / false para nao

        System.out.println(date.get(ChronoField.YEAR)); // pegar o ano
        System.out.println(date.get(ChronoField.DAY_OF_MONTH)); // pegar o dia

        LocalDate agora = LocalDate.now(); // pegar a data atual
        System.out.println(agora);

        System.out.println(LocalDate.MAX); // data maxima que pode usar
        System.out.println(LocalDate.MIN); // data minima que pode usar
    }
}
