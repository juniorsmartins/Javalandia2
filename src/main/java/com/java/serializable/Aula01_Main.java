package com.java.serializable;

import java.io.*;

public class Aula01_Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        // Saída - serialização
//        String nome = "Harry Potter";
//        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        obj.writeObject(nome);
//        obj.close();

        // Entrada - desserialização
        ObjectInputStream ob = new ObjectInputStream((new FileInputStream("objeto.bin")));
        String nome = (String) ob.readObject();
        ob.close();
        System.out.println(nome);

    }
}
