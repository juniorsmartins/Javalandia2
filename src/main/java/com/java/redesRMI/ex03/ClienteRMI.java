package com.java.redesRMI.ex03;

import com.utfpr3.InterfaceObjeto;
import com.utfpr3.Pessoa;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI 
{
    public static void main(String[] args) 
    {
        try
        {
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);
            InterfaceObjeto stub = (InterfaceObjeto) registro.lookup("metodoPessoa");
            Pessoa pessoa = new Pessoa("Mario Mendes", 45);

            System.out.println("Enviar método ao servidor: " + stub.enviarObjeto(pessoa));

        }catch(Exception e)
        {e.printStackTrace();}
    }
}