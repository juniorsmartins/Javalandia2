package com.java.redesRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Aula01_servidorDoSomador implements Aula01_somador
{
    public static void main(String[] args) 
    {
        try
        {
            // Instanciao o objeto servidor
            Aula01_servidorDoSomador server = new Aula01_servidorDoSomador();
            // Instancia um stub
            Aula01_somador stub = (Aula01_somador) UnicastRemoteObject.exportObject((Remote)server, 5000);
            // Registra o stub no RMI Registry para disponibilizá-lo aos clientes
            Registry registro = LocateRegistry.getRegistry();
            registro.rebind("Somar", stub);
            
            System.out.println("Servidor Pronto!");

        }catch(RemoteException e)
        {System.err.println(e.toString());}
    }

    @Override
    public int somar(int a, int b)
    {return (a + b);}
}