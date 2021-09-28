package com.java.data;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Aula01_Main
{
    public static void main(String[] args)
    {
        System.out.println("\n----- Data de Agora -----");

        // LocalDate possui apenas data. Não possui horas, minutos e etc.
        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora);

        System.out.println("\n----- Quanto tempo falta para X data -----");

        LocalDate eventoX = LocalDate.of(2022, Month.JUNE, 30);
        int anosFaltam = eventoX.getYear() - dataAgora.getYear();
        System.out.println("Falta: " + anosFaltam + " ano(s).");

        Period periodoFalta = Period.between(dataAgora, eventoX);
        System.out.println("Falta " + periodoFalta.getMonths() + " meses e " + periodoFalta.getDays() + " dia(s).");

        System.out.println("\n----- Acrescenta em datas -----");

        LocalDate segundaEdicaoEventoX = eventoX.plusYears(5);
        System.out.println("Data da segunda edição: " + segundaEdicaoEventoX);

        System.out.println("\n----- Formatar data -----");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAgora.format(formatoData);
        System.out.println(dataFormatada);

        // ou

        System.out.println(dataAgora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\n----- Data com Hora -----");

        // LocalDateTime possui data e hora
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm")));

        System.out.println("\n----- Hora -----");

        LocalTime horario = LocalTime.now();
        System.out.println(horario);

    }
}
