package estudos.java.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy dd 'de' MMMM 'de' 'São Paulo' 'de' G"; // 'desenhar' formato
        String novaData = "dd/MM/yyyy 'as' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern); // carregar 'desemho' do formato
        SimpleDateFormat dataNew = new SimpleDateFormat(novaData);

        System.out.println(sdf.format(new Date())); // pegar o formato e aplicar no dia de hoje, colcocando no console
        System.out.println(dataNew.format(new Date()));



    }
}
