package com.java.redesRMI.ex01;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente 
{
    public static void main(String[] args) 
    {
        try
        {
            // acessar servidor de registro
            Registry servidorRegistro = LocateRegistry.getRegistry("127.0.0.1", 1099);

            // procurar a referência no servidor de registro 
            iOlaMundo stub =(iOlaMundo) servidorRegistro.lookup("olaMundo");
            
            // acessar o método
            System.out.println("Acessar método no servidor: " + stub.olaMundo());
            
        }catch(RemoteException re)
        {Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, re);} 
        catch (NotBoundException ex) 
        {Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);}
    }
}