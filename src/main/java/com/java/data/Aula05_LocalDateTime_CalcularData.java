package com.java.data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Aula05_LocalDateTime_CalcularData
{
    public static void main(String[] args)
    {
        // O Instant representa os milisegundos desde a data 01/01/1970
        // O now() gera os milisegundos de 01/01/1970 até agora
        Instant i1 = Instant.now();
        Duration dur1 = Duration.ofSeconds(10); // criei uma duração de 10 segundos (poderia ser duração de horas e meses)
        Instant i2 = i1.plus(dur1); // Acrescentei 10 segundos no instante atual - também poderia subtrair
        System.out.println(i1 + " + " + dur1 + " = " + i2);

        System.out.println("-----------------------");

        // saber a duração de tempo entre duas datas
        Instant i3 = Instant.EPOCH; // Epoch é a data inicial do Instant (01/01/1970)
        Instant i4 = Instant.now(); // Now é a data de agora presente no sistema
        System.out.println(i3);
        System.out.println(i4);
        long segundos = Duration.between(i3, i4).getSeconds();
        System.out.println(segundos);

        System.out.println("----------------------------");

        // diferença entre duas datas
        LocalDate dataNascimento = LocalDate.of(1978, 6, 17);
        LocalDate dataAtual = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(dataNascimento, dataAtual)); // quantos anos entre as datas
        System.out.println(ChronoUnit.MONTHS.between(dataNascimento, dataAtual)); // quantia de meses entre as datas
        System.out.println(ChronoUnit.DAYS.between(dataNascimento, dataAtual));

        System.out.println("-----------------------------");

        // uma visão diferente do ChronoUnit
        Period tempoDeVida = Period.between(dataNascimento, dataAtual);
        System.out.println(tempoDeVida.getYears());
        System.out.println(tempoDeVida.getMonths());
        System.out.println(tempoDeVida.getDays());

    }



}





