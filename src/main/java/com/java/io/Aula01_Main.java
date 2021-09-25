package com.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aula01_Main
{
    public static void main(String[] args) throws IOException
    {
        // Padrão Decorator br->isr->fis->lorem.txt
        FileInputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura dos bytes do arquivo
        InputStreamReader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
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
