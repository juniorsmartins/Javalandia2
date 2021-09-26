package com.java.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Aula03_MainDesserializacao
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream oEntrada1 = new ObjectInputStream(new FileInputStream("clientes.bin"));
        Aula03_Cliente cliente1 = (Aula03_Cliente) oEntrada1.readObject();
        System.out.println(cliente1);
    }
}
