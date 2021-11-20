package com.java.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula07_LocalDate_Formatter
{
    public static void main(String[] args)
    {
        executarDatas();
        executarDatasHoras();
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







}








