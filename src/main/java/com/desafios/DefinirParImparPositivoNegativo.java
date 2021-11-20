package com.desafios;

import java.io.IOException;
import java.util.Scanner;

public class DefinirParImparPositivoNegativo
{
    public static void main(String[] args) throws IOException
    {
        Scanner leitor = new Scanner(System.in);

        int N = 0;
        do{
            System.out.println("Quantia de testes: ");
            N = leitor.nextInt();
        }while(N >= 10000);

        for (int i = 0; i < N; i++)
        {
            int valor = 0;
            do{
                valor = leitor.nextInt();
            }while(valor < -107 || valor > 107);

            if(valor == 0)
                System.out.println("NULL");
            else if(valor % 2 == 0)
                System.out.print("EVEN ");
            else if(valor % 2 != 0)
                System.out.print("ODD ");

            if(valor > 0)
                System.out.println("POSITIVE");
            else if(valor < 0)
                System.out.println("NEGATIVE");
        }
    }


}



