package com.java.redesRMI.ex05;

import java.rmi.Naming;

public class ClienteRMIGeral 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Consultar serviço \n=============================");
            String[] lista = Naming.list("rmi://127.0.0.1");
            for(String nome : lista)
                System.out.println("Nome: " + nome);
            
        }catch(Exception e)
        {e.printStackTrace();}
    }
}