package com.java.redesRMI.ex04;

import com.utfpr4.MetodosRemotos;
import java.rmi.Naming;

public class Cliente 
{
    public static void main(String[] args) 
    {
        try
        {
            MetodosRemotos stub = (MetodosRemotos)Naming.lookup("rmi://127.0.0.1/MetodoRMI");
            System.out.println("Executando método servidor: \n" + stub.exibeValor(50));
        }catch(Exception e)
        {e.printStackTrace();}
    }
}