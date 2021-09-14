package com.java.redesRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Aula02_calculadoraServer 
{
    public Aula02_calculadoraServer(){};
    
    public static void main(String args[]) 
    {
        try
        {
            Aula02_calculadora calc = new Aula02_calculadoraImpl();
            
            Registry registro = LocateRegistry.createRegistry(1099);
            
            Naming.rebind("rmi://localhost:1099/CalcServer", calc);

        }catch(Exception e) 
        {System.out.println("Erro RMI: " + e.toString());}
    }
}