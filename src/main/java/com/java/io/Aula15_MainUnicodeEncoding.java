package com.java.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Aula15_MainUnicodeEncoding
{
    public static void main(String[] args) throws IOException
    {
        // Padrão Decorator br->isr->fis->lorem.txt
        InputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura dos bytes do arquivo
        Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_16BE); // Transforma bytes em caracter - num encoding específico
        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        System.out.print("\n");

        String linha = br.readLine();
        while(linha != null)
        {
            System.out.println(linha);
            linha = br.readLine();
        };

        br.close();
     }
}
