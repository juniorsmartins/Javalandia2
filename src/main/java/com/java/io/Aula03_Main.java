package com.java.io;

import java.io.*;

public class Aula03_Main
{
    public static void main(String[] args) throws IOException
    {
        // Padrão Decorator br->isr->fis->lorem.txt
        // Fluxo de saída com arquivo
        FileOutputStream fos = new FileOutputStream("lorem2.txt"); // Abre arquivo para saída de bytes
        OutputStreamWriter osw = new OutputStreamWriter(fos); // Transforma
        BufferedWriter br = new BufferedWriter(osw); // Transforma
        br.close();

        System.out.println("\n---------------\n");

        OutputStream fos2 = new FileOutputStream("lorem2.txt"); // Abre arquivo para saída de bytes
        Writer osw2 = new OutputStreamWriter(fos2); // Transforma
        BufferedWriter br2 = new BufferedWriter(osw2); // Transforma


        br2.close();

    }
}
