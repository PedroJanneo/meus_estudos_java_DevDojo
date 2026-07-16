package estudos.java.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(2004, Month.DECEMBER,22,07,40,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));


    }
}
