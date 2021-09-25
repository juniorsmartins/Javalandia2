package com.java.io;

import java.io.*;

public class Aula02_Main
{
    public static void main(String[] args) throws IOException
    {
        // Padrão Decorator br->isr->fis->lorem.txt
        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura dos bytes do arquivo
        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        System.out.print("\n");
        String linha = br.readLine();
        while(linha != null)
        {
            System.out.println(linha);
            linha = br.readLine();
        };

        br.close();

        System.out.println("\n----------------------\n");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")));
        String linha2 = br2.readLine();
        while(linha2 != null)
        {
            System.out.println(linha2);
            linha2 = br2.readLine();
        };

        br2.close();
    }
}
