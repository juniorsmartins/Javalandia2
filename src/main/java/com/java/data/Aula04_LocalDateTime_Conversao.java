package com.java.data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Aula04_LocalDateTime_Conversao
{
    public static void main(String[] args)
    {
        // Converter data e hora de API antiga para a atual
        Date data = new Date();
        Instant inst = data.toInstant();
        LocalDateTime ldt1 = LocalDateTime.ofInstant(inst, ZoneId.systemDefault());
        System.out.println(ldt1);

        Calendar calendario = Calendar.getInstance();
        Instant in = calendario.toInstant();
        LocalDateTime ldt2 = LocalDateTime.ofInstant(in, ZoneId.systemDefault());
        System.out.println(ldt2);

        // inverter a conversão - levar da API nova para a antiga
        LocalDateTime ldt3 = LocalDateTime.now();
        Instant i1 = ldt3.toInstant(ZoneOffset.UTC); // precisa informar o fuso horário
        Date data2 = Date.from(i1);
        System.out.println(data2);

        // inverter a conversão - levar da API nova para a antiga
        // usa-se o Date como intermediário para converter de LocalDateTime para Calendar
        LocalDateTime ldt4 = LocalDateTime.now();
        Instant i2 = ldt4.toInstant(ZoneOffset.UTC); // precisa informar o fuso horário
        Date data3 = Date.from(i2);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(data3);
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getTime());
        System.out.println(c1.toInstant());


    }



}





