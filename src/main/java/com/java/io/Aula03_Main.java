package com.java.io;

import java.io.*;

public class Aula03_Main
{
    public static void main(String[] args) throws IOException
    {
        // Padrão Decorator br->isr->fis->lorem.txt
        // Fluxo de saída com arquivo -
        FileOutputStream fos = new FileOutputStream("lorem2.txt"); // Abre arquivo para saída de bytes
        OutputStreamWriter osw = new OutputStreamWriter(fos); // Transforma
        BufferedWriter bw = new BufferedWriter(osw); // Transforma
        bw.close();
        System.out.println("\n---------------\n");

        // Fluxo de saída com arquivo
        OutputStream fos2 = new FileOutputStream("lorem2.txt"); // Abre arquivo para saída de bytes
        Writer osw2 = new OutputStreamWriter(fos2); // Transforma
        BufferedWriter bw2 = new BufferedWriter(osw2); // Transforma

        bw2.write("It is a long established fact that a reader will be distracted by the readable content " +
                "of a page when looking at");
        bw2.newLine();
        bw2.write("its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution " +
                "of letters, as opposed");

        bw2.close();

    }
}
