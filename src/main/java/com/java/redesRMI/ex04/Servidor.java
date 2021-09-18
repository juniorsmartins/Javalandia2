package com.java.redesRMI.ex04;

import com.java.redesRMI.ex04.MetodosRemotos;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements MetodosRemotos
{
    public Servidor() throws RemoteException
    {super();}
    
    @Override
    public String exibeValor(int valor) throws RemoteException
    {return "valor recebido " + valor + ".\n";}
    
    public static void main(String[] args) 
    {
        try
        {
            Registry registro = LocateRegistry.createRegistry(1099);
            Naming.rebind("MetodoRMI", new Servidor());
            System.out.println("Aguardando conexão de cliente...");
        }catch(Exception e)
        {e.printStackTrace();}
    }
}