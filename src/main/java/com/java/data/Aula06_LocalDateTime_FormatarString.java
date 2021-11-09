package com.java.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula06_LocalDateTime_FormatarString
{
    public static void main(String[] args)
    {
        LocalDateTime data1 = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formato.format(data1));

        System.out.println("-------------------------");

        LocalDateTime data2 = LocalDateTime.now();
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(data2.format(formato2));

        System.out.println("-------------------------");

        LocalDate dataLocal2 = LocalDate.parse("17/06/1978", formato);
        System.out.println(dataLocal2);



    }

}




