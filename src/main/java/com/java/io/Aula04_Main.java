package com.java.io;

import java.io.*;

public class Aula04_Main
{
    public static void main(String[] args) throws IOException
    {
        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura dos bytes do arquivo
        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        // Fluxo de saída com arquivo
        OutputStream fos2 = new FileOutputStream("lorem2.txt"); // Abre arquivo para saída de bytes
        Writer osw2 = new OutputStreamWriter(fos2); // Transforma
        BufferedWriter bw = new BufferedWriter(osw2); // Transforma

        String linha = br.readLine();
        while(linha != null)
        {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
