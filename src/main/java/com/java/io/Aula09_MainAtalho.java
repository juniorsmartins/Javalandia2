package com.java.io;

import java.io.*;

public class Aula09_MainAtalho
{
    public static void main(String[] args) throws IOException
    {
        // Fluxo de entrada com arquivo
//        InputStream fis = new FileInputStream("lorem.txt"); // Faz a leitura de bytes do arquivo
//        Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
//        BufferedReader br = new BufferedReader(isr); // Transforma os caracteres em linhas

        FileWriter fw = new FileWriter("lorem2.txt");
        fw.write("Um conto brasileiro do século XXI: Luladrão e os 400 ladrões!");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("Autor: judiciário brasileiro.");
        fw.write("\r\n");
        fw.close();

        // ou pode ser feito assim

        FileWriter fw2 = new FileWriter("lorem2.txt");
        BufferedWriter br2 = new BufferedWriter(fw2);
        br2.write("Brasil - Um conto nacional do século XXI: Luladrão e os 400 ladrões!");
        br2.newLine();
        br2.newLine();
        br2.write("Autor: judiciário brasileiro.");
        br2.newLine();
        br2.close();

        // ou pode ser feito assim

        BufferedWriter br3 = new BufferedWriter(new FileWriter("lorem2.txt"));
        br3.write("Brasil - Um conto do século XXI: Luladrão e os 400 ladrões!");
        br3.newLine();
        br3.newLine();
        br3.write("Autor: judiciário brasileiro.");
        br3.newLine();
        br3.close();
    }
}
