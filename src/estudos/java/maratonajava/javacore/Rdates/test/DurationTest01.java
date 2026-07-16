package estudos.java.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Nao aceita LocalDate
 */
public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAftertwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8); // acrescenta dois anos

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusMinutes(7);

        Duration d1 = Duration.between(now, nowAftertwoYears);
        Duration d2 = Duration.between(timeNow, timeMinusSevenHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Duration duration = Duration.ofDays(20);
        System.out.println(duration);


    }
}
