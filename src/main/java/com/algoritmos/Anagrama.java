package com.algoritmos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagrama
{
    public static List<String> lista;

    public static void main(String[] args)
    {
        lista = new Vector<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\testeSabium.txt"));
            String linha;

            boolean haPalavras = true;
            do
            {
                if ((linha = br.readLine()) != null)
                {
                    System.out.println("Saída: " + linha);
                    lista.add(linha);
                }
                else
                {haPalavras = false;}
            }while(haPalavras);
        }
        catch(IOException ioe)
        {ioe.printStackTrace();}

        System.out.println("\n");

        for(String palavra1 : lista)
            for (String palavra2 : lista)
            {existeAnagramas(palavra1, palavra2);}

    }

    public static void existeAnagramas(String palavra1, String palavra2)
    {
        if( (palavra1.equalsIgnoreCase(palavra2)) || (palavra1.length() != palavra2.length()) )
            return;

        char[] p1 = palavra1.toCharArray();
        char[] p2 = palavra2.toCharArray();
        Arrays.sort(p1);
        Arrays.sort(p2);

        if(Arrays.equals(p1, p2))
            System.out.println(palavra1 + " é anagrama de " + palavra2);
    }
}
