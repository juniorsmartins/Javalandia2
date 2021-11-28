package com.desafios.bootcampcognizant.d4;

import java.io.IOException;
import java.util.Scanner;

public class ParImparPositivoNegativo
{
    public static void main(String[] args) throws IOException
    {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int t = 0;

        //continue a solução
        for(int i = 0; i < 5; i++)
        {
            t = leitor.nextInt();
            if(t > 0)
                positivos++;
            if(t < 0)
                negativos++;
            if(t % 2 == 0)
                pares++;
            if(t % 2 != 0)
                impares++;
        }

        //insira suas variaveis corretamente
        System.out.println( pares + " par(es)");
        System.out.println( impares + " impar(es)");
        System.out.println( positivos + " positivo(s)");
        System.out.println( negativos + " negativo(s)");
    }
}
