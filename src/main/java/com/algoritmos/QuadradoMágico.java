package com.algoritmos;

import java.util.Scanner;

public class QuadradoMágico
{
    public static void main(String[] args)
    {
        // Declaração de matriz quadrada
        int n = 4;
        int quadrado[][] = new int[n][n];
        int somaPrimeiraLinha = 0;
        int somaPrimeiraColuna = 0;
        int somaLinhaDiagonal1 = 0;
        int somaLinhaDiagonal2 = 0;

        // Entrada dos valores
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
            {
                System.out.print("Digite: [" + i + "][" + j + "]: ");
                quadrado[i][j] = scan.nextInt();
            }


        // Regras de negócio - Verificação de linhas horizontais
        for(int i = 0; i < quadrado.length; i++)
            somaPrimeiraLinha += quadrado[0][i];

        for(int i = 1; i < quadrado.length; i++)
        {
            int somaDemaisLinhas = 0;
            for(int c = 0; c < quadrado.length; c++)
                somaDemaisLinhas += quadrado[i][c];

            if(somaDemaisLinhas != somaPrimeiraLinha)
            {
                System.out.println("Não é Quadrado Mágico!");
                System.exit(0);
            }
        }

        // Regras de negócio - Verificação de linhas verticais
        for(int i = 0; i < quadrado.length; i++)
            somaPrimeiraColuna += quadrado[i][0];

        for(int i = 1; i < quadrado.length; i++)
        {
            int somaDemaisColunas = 0;
            for(int c = 0; c < quadrado.length; c++)
                somaDemaisColunas += quadrado[c][i];

            if(somaDemaisColunas != somaPrimeiraColuna)
            {
                System.out.println("Não é Quadrado Mágico!");
                System.exit(0);
            }
        }

        // Regras de negócio - Verificação de linhas diagonais
        for(int i = 0; i < quadrado.length; i++)
            for(int e = 0; e < quadrado.length; e++)
            {
                if(i == e)
                    somaLinhaDiagonal1 += quadrado[i][e];
                if((i + e) == (quadrado.length - 1))
                    somaLinhaDiagonal2 += quadrado[i][e];
            }

        if(!(somaLinhaDiagonal1 == somaLinhaDiagonal2 && somaLinhaDiagonal1 == somaPrimeiraLinha && somaLinhaDiagonal1 == somaPrimeiraColuna))
        {
            System.out.println("Não é Quadrado Mágico");
            System.exit(0);
        }

        System.out.println("É Quadrado Mágico!");
    }
}
