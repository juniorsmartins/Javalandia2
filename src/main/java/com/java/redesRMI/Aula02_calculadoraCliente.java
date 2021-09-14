package com.java.redesRMI;

import java.rmi.Naming;

public class Aula02_calculadoraCliente 
{
    public static void main(String args[]) 
    {
        try 
        {
            Aula02_calculadora calc = (Aula02_calculadora) Naming.lookup("rmi://localhost/CalcServer");
            
            System.out.println("A soma de 1 + 5 é: " + calc.add(1, 5));
            
        } catch(Exception e) 
        {System.out.println("Erro RMI: " + e.toString());}
    }
}