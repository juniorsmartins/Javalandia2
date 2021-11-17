package com.desafios;

import java.time.LocalTime;
import java.util.Scanner;

public class CalcularFusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = 0;
        int tempoviagem = 0;
        int fuso = 0;

        do {
            horasaida = sc.nextInt();
        } while (horasaida < 0 || horasaida > 23);
        LocalTime ajuste = LocalTime.of(horasaida, 0);

        do {
            tempoviagem = sc.nextInt();
        } while (tempoviagem < 1 || tempoviagem > 12);
        ajuste = ajuste.plusHours(tempoviagem);

        do {
            fuso = sc.nextInt();
        }
        while (fuso < -5 || fuso > 5);
        ajuste = ajuste.plusHours(fuso);

        System.out.println(ajuste.getHour());
        sc.close();
    }
}



