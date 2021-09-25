package com.java.io;

import java.io.*;

public class Aula07_Main
{
    public static void main(String[] args) throws IOException
    {
        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura de bytes do arquivo
        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        // Fluxo de saída com console
        OutputStream fos2 = System.out; // Abre console para saída de bytes
        Writer osw2 = new OutputStreamWriter(fos2); // Transforma
        BufferedWriter bw = new BufferedWriter(osw2); // Transforma

        String linha = br.readLine();
        while(linha != null)
        {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
