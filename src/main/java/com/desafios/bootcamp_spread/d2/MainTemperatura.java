package com.desafios.bootcamp_spread.d2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MainTemperatura
{
    public static void main(String[] args)
    {
        List<Temperatura> temps = new ArrayList<>()
        {{
            add(new Temperatura(Month.JANUARY, BigDecimal.valueOf(12.22).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.FEBRUARY, BigDecimal.valueOf(08.30).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.MARCH, BigDecimal.valueOf(15.43).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.APRIL, BigDecimal.valueOf(21.52).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.MAY, BigDecimal.valueOf(25.67).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.JUNE, BigDecimal.valueOf(19).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.JULY, BigDecimal.valueOf(20.08).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.AUGUST, BigDecimal.valueOf(28.87).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.SEPTEMBER, BigDecimal.valueOf(32.45).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.OCTOBER, BigDecimal.valueOf(42.91).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.NOVEMBER, BigDecimal.valueOf(34.65).setScale(4, RoundingMode.HALF_EVEN)));
            add(new Temperatura(Month.DECEMBER, BigDecimal.valueOf(23.02).setScale(4, RoundingMode.HALF_EVEN)));
        }};
        System.out.println("---------------------------------------------");
        System.out.println("Temperaturas do ano todo");
        temps.forEach(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("Temperaturas do primeiro semestre");
        temps.stream()
                .filter(temp -> temp.getMes().compareTo(Month.JULY) < 0 )
                .forEach(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("Temperaturas do segundo semestre");
        temps.stream()
                    .filter(temp -> temp.getMes().compareTo(Month.JUNE) > 0)
                    .forEach(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("Soma das temperaturas do primeiro semestre");
        BigDecimal b = temps.stream()
                .filter(temp -> temp.getMes().compareTo(Month.JULY) < 0)
                .map(Temperatura::getMedida)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(b);

        System.out.println("---------------------------------------------");
        System.out.println("Soma das temperaturas do segundo semestre");
        BigDecimal c = temps.stream()
                .filter(temp -> temp.getMes().compareTo(Month.JUNE) > 0)
                .map(Temperatura::getMedida)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(c);

        System.out.println("---------------------------------------------");
        System.out.println("Temperatura média do primeiro semestre: ");
        temps.stream()
                .filter(temp -> temp.getMes().compareTo(Month.JULY) < 0)
                .map(Temperatura::getMedida)
                .mapToDouble(BigDecimal::doubleValue)
                .average().ifPresent(System.out::println);

        System.out.println("---------------------------------------------");
        System.out.println("Temperatura média do segundo semestre: ");
        temps.stream()
                .filter(temp -> temp.getMes().compareTo(Month.JUNE) > 0)
                .map(Temperatura::getMedida)
                .mapToDouble(BigDecimal::doubleValue)
                .average().ifPresent(System.out::println);



    }


}



