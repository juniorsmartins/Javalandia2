package com.desafios;

import java.math.BigInteger;
import java.util.Scanner;

public class CalcularTrigoTabuleiro
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean numCerto = false;
        int n = 0;
        do{
            try{
                n = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e)
            {System.err.println("Exception");}
            if(n >= 1 && n <= 100)
                numCerto = true;
        }while(numCerto == false);

        for(int i = 0; i < n; i++)
        {
            BigInteger graos = new BigInteger("1");
            BigInteger grama = new BigInteger("0");
            BigInteger quilos = new BigInteger("0");

            boolean numTabCerto = false;
            int x = 0;
            do{
                try{
                    x = Integer.parseInt(sc.nextLine());
                    if(x >= 1 && x <= 64)
                        numTabCerto = true;
                }catch(Exception e)
                {System.err.println("Exception");}
            }while(numTabCerto == false);

            for(int cont = 0; cont < x; cont++){
                graos = graos.multiply(new BigInteger("2"));
            }
            grama = graos.divide(new BigInteger("12"));
            quilos = grama.divide(new BigInteger("1000"));
            System.out.printf("%d kg \n", quilos);   //Complete o código aqui.
        }
        sc.close();
    }
}



