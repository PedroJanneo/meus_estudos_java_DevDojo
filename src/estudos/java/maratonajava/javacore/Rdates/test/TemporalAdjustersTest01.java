package estudos.java.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        now = now.with(ChronoField.DAY_OF_MONTH,17);


        System.out.println(now);
        System.out.println(now.getDayOfMonth());



        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfMonth());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // proximo dia do mes, na sexta feira
        System.out.println(now);
        System.out.println(now.getDayOfMonth());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)); // ultima sexta feira
        System.out.println(now);
        System.out.println(now.getDayOfMonth());

        // tendi varias manipulações, podendo ver primeiro dia do proximo ano, mes, semana, etc
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); // ultimo dia e semana do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); // primeiro dia e semana do mes
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
