package com.java.data;

import java.time.*;
import java.time.temporal.ChronoField;

public class Aula02_LocalDateTime
{
    public static void main(String[] args)
    {
        // LocalDate - Apenas data
        // LocalTime - Apenas hora
        // LocalDateTime - Data e hora
        // MonthDay - dia e mês
        // YearMonth - mês e ano

        // cria data com a data atual do sistema
        LocalDate date = LocalDate.now();
        // cria hora com a hora atual do sistema
        LocalTime time = LocalTime.now();
        // cria data e hora com a data e hora atuais do sistema
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date + " - " + time + " - " + dateTime);

        // Hora por localização geográfica
        LocalTime timeZone1 = LocalTime.now(ZoneId.of("America/Chicago"));
        LocalTime timeZone2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        LocalTime timeZone3 = LocalTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println(timeZone1);
        System.out.println(timeZone2);
        System.out.println(timeZone3);

        // converter em hora
        LocalTime lt1 = LocalTime.of(12, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(12, 35, 12);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(13, 40, 25, 34);
        System.out.println(lt3);

        // converter em data
        LocalDate ld1 = LocalDate.of(2021, 12, 25);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2022, Month.DECEMBER, 31);
        System.out.println(ld2);

        // converter em data e hora
        LocalDateTime ldt1 = LocalDateTime.of(2023, 11, 8, 12, 30);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2023, 11, 8, 12, 30, 44, 52);
        System.out.println(ldt2);

        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt2);
        System.out.println(ldt3);

        // métodos
        LocalDateTime ldt4 = LocalDateTime.now();
        // descobrir dia do mês da data e hora atuais
        System.out.println(ldt4.getDayOfMonth());
        // descobrir mês
        System.out.println(ldt4.getMonth());
        // descobrir ano
        System.out.println(ldt4.getYear());
        // descobrir dia do ano
        System.out.println(ldt4.getDayOfYear());
        // descobrir dia da semana
        System.out.println(ldt4.getDayOfWeek());
        // descobrir hora e minuto e segundo
        System.out.println(ldt4.getHour() + " - " + ldt4.getMinute() + " - " + ldt4.getSecond());

        // feito de outra forma
        System.out.println(ldt4.get(ChronoField.DAY_OF_YEAR));
        System.out.println(ldt4.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt4.get(ChronoField.DAY_OF_WEEK));
        System.out.println(ldt4.get(ChronoField.CLOCK_HOUR_OF_DAY));



    }


}








