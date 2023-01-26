package org.raphinho.testandodatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestandoLocalDate {

    public static void main(String[] args) {
        LocalDateTime hoje = LocalDateTime.now();
        LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
        LocalDateTime dataComHorario = data.atTime(10, 30);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        Period tempoEntreDatas = Period.between(hoje.toLocalDate(), data);

        System.out.println(hoje.format(formatador));
        System.out.println(dataComHorario.format(formatador));
        System.out.println(tempoEntreDatas);
    }
}
