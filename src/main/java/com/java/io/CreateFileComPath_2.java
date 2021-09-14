package com.java.io;

import java.io.File;
import java.io.IOException;

public final class CreateFileComPath_2 
{
    public static void main(String[] args) 
    {
        String nomeArquivo = "Abracadabra.txt";
        String caminhoArquivo = "";
        caminhoArquivo = "D:\\" + File.separator + nomeArquivo;
        System.out.println("caminho final: " + caminhoArquivo);
                
        final File file = new File(caminhoArquivo);
        
        try
        {
            if(file.createNewFile())
            {System.out.println("Arquivo criado!");}
            else
            {System.out.println("Arquivo já criado!");}
        }catch(IOException ioe)
        {ioe.printStackTrace();}
    }
}