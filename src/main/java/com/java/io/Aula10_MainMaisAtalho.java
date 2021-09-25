package com.java.io;

import java.io.*;

public class Aula10_MainMaisAtalho
{
    public static void main(String[] args) throws IOException
    {
        // Fluxo de entrada com arquivo
//        InputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura de bytes do arquivo
//        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
//        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        // Fluxo de saída para arquivo.txt
        PrintStream ps = new PrintStream(new File("lorem2.txt"));
        ps.println("Século XXI - Luladrão e os 400 ladrões");
        ps.println();
        ps.close();

        // ou pode ser assim

        // Fluxo de saída para arquivo.txt
        PrintStream ps2 = new PrintStream("lorem2.txt");
        ps2.println("Luladrão e os 400 ladrões");
        ps2.println();
        ps2.close();

        // ou pode ser assim

        // Fluxo de saída para arquivo.txt
        PrintWriter pw = new PrintWriter("lorem2.txt");
        pw.println("Brasil - Século XXI - O conto de Luladrão e os 400 ladrões");
        pw.println();
        pw.close();
    }
}
