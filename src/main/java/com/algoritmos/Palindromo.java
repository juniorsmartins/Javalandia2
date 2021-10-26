package com.algoritmos;

public class Palindromo
{
    public static void main(String[] args)
    {
        // Entrada de valor
        String palavraQualquer = "reviver ".toUpperCase().trim();

        // Regra de negócio
        String palavraInvertida = new StringBuffer(palavraQualquer).reverse().toString();
        if(!palavraInvertida.equals(palavraQualquer))
        {
            System.out.println("Não é palíndromo!");
            System.exit(0);
        }

        // Resposta
        System.out.println("É palíndromo!");

        int quadrado[][] = new int[3][3];
        System.out.println(quadrado.length);

    }
}
