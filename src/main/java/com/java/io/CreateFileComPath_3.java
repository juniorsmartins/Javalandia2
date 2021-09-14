package com.java.io;

import java.io.File;
import java.io.IOException;

public final class CreateFileComPath_3 
{
    public static void main(String[] args) 
    {
        String nomeArquivo = "Abracadabra.txt";
        String caminhoRaiz = System.getProperty("user.dir");
        String caminhoAbsoluto = caminhoRaiz + File.separator + nomeArquivo;

        System.out.println("caminho final: " + caminhoAbsoluto);
                
        final File file = new File(caminhoAbsoluto);
        
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