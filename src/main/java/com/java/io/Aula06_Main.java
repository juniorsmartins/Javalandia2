package com.java.io;

import java.io.*;

public class Aula06_Main
{
    public static void main(String[] args) throws IOException
    {
        // Fluxo de entrada com console
        InputStream fis = System.in; // Faz a leitura de bytes do console
        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        // Fluxo de saída com console
        OutputStream fos2 = System.out; // Abre console para saída de bytes
        Writer osw2 = new OutputStreamWriter(fos2); // Transforma
        BufferedWriter bw = new BufferedWriter(osw2); // Transforma

        String linha = br.readLine();
        while(linha != null && !linha.isEmpty())
        {
            bw.write(linha);
            bw.newLine();
            bw.flush(); // Faz o texto sair imediatamente - sem ele, espera dar linha vazia para imprimir
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
