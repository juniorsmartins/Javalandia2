/*
 * Deletar arquivo
 */
package com.java.io;

import java.io.File;

public class DeleteFile_5 
{
    public static final String caminhoEarquivo = "D:" + File.separator + "TesteIO.txt";
    
    public static void main(String[] args) 
    {
        File file = new File(caminhoEarquivo);

        if(file.delete())
        {System.out.println("Arquivo deletado!");}
        else
        {System.out.println("Arquivo não existe!");}
    }
}