package com.java.io;

import java.io.*;
import java.net.Socket;

public class Aula08_Main
{
    public static void main(String[] args) throws IOException
    {
        Socket con = new Socket();

        // Fluxo de entrada da rede
        InputStream fis = con.getInputStream(); // Faz a leitura de bytes da rede
        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        // Fluxo de saída da rede
        OutputStream fos2 = con.getOutputStream(); // Abre a rede para saída de bytes
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
