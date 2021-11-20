package com.java.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Aula07_LocalDate_Formatter
{
    public static void main(String[] args)
    {
        executarDatas();
        executarDatasHoras();
        executarDatasHorasSemPrecisarDefinirFormato();
        executarDataSemPrecisarDefinirFormato();
    }

    public static void executarDatas()
    {
        // gerar data
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        // formatar data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));
    }

    public static void executarDatasHoras()
    {
        // gerar data e hora
        LocalDateTime agora = LocalDateTime.now();
        // formatar data e hora
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatador));
    }

    public static void executarDatasHorasSemPrecisarDefinirFormato()
    {
        System.out.println("------------------------------");
        // gerar data e hora
        LocalDateTime dataHora1 = LocalDateTime.now();

        // formatar sem definir formato - Fazer com formato padrão (Short ou Medium)
        DateTimeFormatter formatadorPadrao1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dataHora1.format(formatadorPadrao1));
    }

    public static void executarDataSemPrecisarDefinirFormato()
    {
        System.out.println("--------------------------------");
        // gerar data
        LocalDate data2 = LocalDate.now();
        // formatar com formato padrão (Long ou Full)
        DateTimeFormatter formatadorPadrao2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(data2.format(formatadorPadrao2));
    }
}








