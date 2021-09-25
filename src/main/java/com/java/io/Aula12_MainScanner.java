package com.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula12_MainScanner
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("contas.csv"));
        System.out.println();

        while(scan.hasNextLine())
        {
            String linha = scan.nextLine();
            System.out.println(linha);
        }

        scan.close();
    }
}
