package estudos.java.maratonajava.javacore.Rdates.test;

import java.util.Date;

/**
 * DATE (classe) é antiga, ninguem usa em sistemas modernos
 * Seu tempo, comeca a contar a apartir de 1 janeiro de 1970
 */

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1784116644264L); // contar tempo por milisegundos; seu argumento tem que ser em long
        System.out.println(date); // entro da classe date, ja tem o .toString

        date.setTime(date.getTime() + 3_600_000); // acrescentando 1h no fuso
        System.out.println(date);

    }
}
