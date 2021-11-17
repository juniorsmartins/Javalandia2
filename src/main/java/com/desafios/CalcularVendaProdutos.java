package com.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalcularVendaProdutos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int produtos=0, quantidade=0;
        double res=0, valor=0;
        System.out.println("Quantia de compras: ");
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> listaProd = new ArrayList<>();

        for (int x=0 ; x<N ; x++)
        {
            boolean numRepetido = true;
            do {
                System.out.println("Qual produto: ");
                produtos = sc.nextInt();
                numRepetido = false;
                for (Integer produto : listaProd) {
                    if (produtos == produto) {
                        numRepetido = true;
                    }
                }
            }while(numRepetido == true);
            listaProd.add(produtos);

            System.out.println("Qual quantia: ");
            quantidade  = sc.nextInt();

            if (produtos == 1001)
                valor = 1.50;
            else if (produtos == 1002)
                valor = 2.50;
            else if (produtos == 1003)
                valor = 3.50;
            else if (produtos == 1004)                  //complete o código nos espaços em branco
                valor = 4.50;
            else if (produtos == 1005)
                valor = 5.50;

            res += valor * quantidade;
        }
        System.out.printf("%.2f\n",res);
        sc.close();
    }

}
