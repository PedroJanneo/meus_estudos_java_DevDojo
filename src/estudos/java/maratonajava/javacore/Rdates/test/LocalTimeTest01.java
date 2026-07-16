package estudos.java.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23,32,12);
        LocalTime now = LocalTime.now();



        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getHour()); //pegar so a hora
        System.out.println(time.getMinute()); // pegar so o minuto
        System.out.println(time.getSecond()); // pegar so o segundo
        System.out.println(time.get(ChronoField.HOUR_OF_DAY)); // hora
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM)); // PM ou AM
        System.out.println(LocalTime.MIN); // hora que começa o dia
        System.out.println(LocalTime.MAX); // hora que termina o dia


    }
}
