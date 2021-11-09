package com.java.data;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

public class Aula03_LocalDateTime
{
    public static void main(String[] args)
    {
        // Mês e dia
        MonthDay diaMes1 = MonthDay.of(1, 1);
        System.out.println(diaMes1);
        MonthDay diaMes2 = MonthDay.of(5, 2);
        System.out.println(diaMes2);

        // Verifica se data 1 é anterior a data 2
        System.out.println(diaMes1.isBefore(diaMes2));
        // Verifica se data 1 é posterior a data 2
        System.out.println(diaMes1.isAfter(diaMes2));
        // Verifica se datas são iguais
        System.out.println(diaMes1.equals(diaMes2));

        // Datas são objetos imutáveis - não podem ser alteradas - pode-se criar novos objetos
        LocalDate ld1 = LocalDate.of(2014, 3, 6);
        LocalDate ld2 = ld1.withMonth(2).withYear(2020);
        System.out.println(ld1 + " - " + ld2);

        // acrescenta na data
        LocalDate ld3 = ld1.plusYears(7).plusMonths(3).plusDays(11);
        System.out.println(ld3);

        // subtrai da data
        LocalDate ld4 = ld3.minusYears(10).minusMonths(4).minusDays(15);
        System.out.println(ld4);

        // para operações é melhor usar o enum
        LocalDate ld5 = ld1.minus(4, ChronoUnit.YEARS);
        System.out.println(ld5);



    }



}







