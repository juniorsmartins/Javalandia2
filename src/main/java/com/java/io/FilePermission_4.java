/*
 * 
 */
package com.java.io;

import java.io.File;
import java.io.IOException;

public class FilePermission_4 
{
    public static final String caminhoEarquivo = "D:" + File.separator + "TesteIO.txt";

    public static void main(String[] args) 
    {
        
        File file = new File(caminhoEarquivo);
        if(file.exists())
        {
            System.out.println("Executar: " + file.canExecute());
            System.out.println("Escrever: " + file.canWrite());
            System.out.println("Ler: " + file.canRead());
        }

        file.setExecutable(true);
        file.setReadable(true);
        file.setWritable(true);

        System.out.println("Executar: " + file.canExecute());
        System.out.println("Escrever: " + file.canWrite());
        System.out.println("Ler: " + file.canRead());

        try
        {
            if(file.createNewFile())
            {System.out.println("Arquivo criado!");}
            else
            {System.out.println("Arquivo já criado!");}
        }
        catch(IOException ioe)
        {ioe.printStackTrace();}
    }
}