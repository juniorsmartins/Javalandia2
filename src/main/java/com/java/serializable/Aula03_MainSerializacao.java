package com.java.serializable;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

public class Aula03_MainSerializacao
{
    public static void main(String[] args) throws IOException
    {
        List<Aula03_Cliente> listaClientes = new Vector<>();
        List<Aula03_Conta> listaContas = new Vector<>();

        Aula03_Cliente cliente1 = new Aula03_Cliente("Ludwig", "999.888.777-60", "Analista de Dados");
        Aula03_Cliente cliente2 = new Aula03_Cliente("Franz", "666.444.777-55", "Cientista de Dados");
        Aula03_Cliente cliente3 = new Aula03_Cliente("Montesquié", "333.111.222-69", "Programador Java");
        Aula03_Cliente cliente4 = new Aula03_Cliente("Bethoven", "585.666.444-81", "Programador C#");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);

        Aula03_ContaCorrente cc1 = new Aula03_ContaCorrente(108, 113355, cliente1,0.03);
        Aula03_ContaCorrente cc2 = new Aula03_ContaCorrente(102, 661144, cliente4,0.028);
        Aula03_ContaPoupanca pp1 = new Aula03_ContaPoupanca(123, 227788, cliente3, 0.04);
        Aula03_ContaPoupanca pp2 = new Aula03_ContaPoupanca(111, 559911, cliente2, 0.027);

        listaContas.add(pp1);
        listaContas.add(cc2);
        listaContas.add(cc1);
        listaContas.add(pp2);

        ObjectOutputStream oSaida1 = new ObjectOutputStream(new FileOutputStream("clientes.bin"));
        oSaida1.writeObject(cliente1);
        oSaida1.close();
        ObjectOutputStream oSaida2 = new ObjectOutputStream(new FileOutputStream("contas.bin"));
        oSaida2.writeObject(cc1);
        oSaida2.close();
    }
}
