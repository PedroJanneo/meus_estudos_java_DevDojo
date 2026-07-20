package estudos.java.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        // palavras: Format -> transformando objeto numa string
        // palavras: Parse -> transformando uma String num objeto


        LocalDate date = LocalDate.now();

        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        String stringData = "2026-07-20";
        String stringData2 = "20260720";

        LocalDate dateString = LocalDate.parse(stringData);
        System.out.println(dateString);
        LocalDate dateString2 = LocalDate.parse(stringData2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dateString2);


        // forcar a data pro Brasil
        DateTimeFormatter formatBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatoBR = LocalDate.now().format(formatBR);
        System.out.println(formatoBR);

        LocalDate parseBr = LocalDate.parse("20/07/2026", formatBR);
        System.out.println(parseBr);

        DateTimeFormatter dateTimeFormatterGerman = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN); // formatar
        String formatGerman = LocalDate.now().format(dateTimeFormatterGerman);
        System.out.println(formatGerman);

        LocalDate parseGerman = LocalDate.parse("20.Juli.2026", dateTimeFormatterGerman); //desformatar
        System.out.println(parseGerman);


    }
}
