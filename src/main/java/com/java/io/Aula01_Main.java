package com.java.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Aula01_Main
{
    public static void main(String[] args)
    {
        try(FileInputStream fis = new FileInputStream("lorem.txt");)
        {

        }catch(IOException ioe)
        {
            System.err.println("\nExceçao!\n");
            ioe.printStackTrace();
        }

    }
}
