package estudos.java.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now(); // quase uma junção do LocalDate e LocalTime

        LocalDate date = LocalDate.of(2022, Month.AUGUST,6);
        LocalTime time = LocalTime.parse("09:45:00");

        System.out.println(localDateTime);
        System.out.println(time);

       LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);


    }
}
