package estudos.java.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe criada APÓS o date <br>
 * È uma classe abstrata, ou seja, nao pode ser inicialziada
 */
public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        Date date = c.getTime();
        System.out.println(date);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Primeiro dia da semana é domingo");
        }
        else {
            System.out.println("Primeiro dia da semana é segunda");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // dia do mes
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // dia da semana no mes
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // dia da semana
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // dia do ano

        c.add(Calendar.DAY_OF_MONTH,0); // acrescentar 2 dias
        c.roll(Calendar.HOUR,12); // acrescenta as 12h, mas sem virar o dia
        date = c.getTime(); // transformar o Calendar em Date
        System.out.println(date);

    }
}
