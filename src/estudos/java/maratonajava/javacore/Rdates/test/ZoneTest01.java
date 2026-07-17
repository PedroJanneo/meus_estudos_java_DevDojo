package estudos.java.maratonajava.javacore.Rdates.test;



import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; // listar zonas
        System.out.println(shortIds);

        System.out.println(ZoneId.systemDefault()); // mostrar minha zona


        ZoneId tokyoid = ZoneId.of("Asia/Tokyo");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime ZonedDateTime  = now.atZone(tokyoid);
        System.out.println(ZonedDateTime); // mostra a difernça do horario + regiao


        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        java.time.ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoid);
        System.out.println(zonedDateTime2); // ele ja muda a hora


        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        System.out.println(now.atOffset(zoneOffset)); // so mostra a dferenca do horario



        OffsetDateTime offsetDateTime1 = nowInstant.atOffset(zoneOffset);
        System.out.println(offsetDateTime1);


        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now()); // ver o dia de hoje no calendario japones
        System.out.println(japaneseDate);

        LocalDate dataAleaoria = LocalDate.of(1900, 2, 1);

        JapaneseDate dataJaponesa = JapaneseDate.from(dataAleaoria);
        System.out.println(dataJaponesa);


    }
}
