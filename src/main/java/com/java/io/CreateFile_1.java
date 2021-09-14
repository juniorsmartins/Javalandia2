/*
* Criar arquivo
*/
package com.java.io;

import java.io.File;
import java.io.IOException;

public class CreateFile_1 
{
    public static void main(String[] args) 
    {
        File file = new File("D:\\AulaJava.txt");
        try
        {
            if(file.createNewFile())
            {System.out.println("Arquivo Criado!");}
            else
            {System.out.println("Arquivo já existe!");}
        }catch(IOException ioe)
        {ioe.printStackTrace();}
    }
}