package com.java.serializable;

import java.io.*;

public class Aula02_SerializacaoCliente
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Aula02_Cliente cliente = new Aula02_Cliente();
        cliente.setNome("Franz");
        cliente.setIdade(34);
        cliente.setSalario(3450.57);

        ObjectOutputStream objSaida = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objSaida.writeObject(cliente);
        objSaida.close();


        ObjectInputStream objEntrada = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Aula02_Cliente cliente2 = (Aula02_Cliente) objEntrada.readObject();
        System.out.println(cliente);
        objEntrada.close();

    }
}
