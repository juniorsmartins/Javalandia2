/*
 * Ler arquivo
 */
package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_6 
{
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\treinoler.txt"));
            String linha;
            if((linha = br.readLine()) != null)
            {
                System.out.println("Saída: " + linha);
            }
        }
        catch(IOException oe)
        {oe.printStackTrace();}
    }
}