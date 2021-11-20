package com.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreverCorTabuleiro
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean numFormatOk = false;
        int L = 0;
        int C = 0;

        do
        {
            try
            {
                L = Integer.parseInt(sc.nextLine());
                C = Integer.parseInt(sc.nextLine());
                numFormatOk = true;
            } catch (Exception e)
            {System.err.println("Exception");}

        }while(numFormatOk == false);

        if ((L + C)%2 == 0)
            System.out.println("1");
        else                                               //complete o código nos espaços em branco
            System.out.println("0");

        sc.close();
    }

}
