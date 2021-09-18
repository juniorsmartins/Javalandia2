package com.java.redesRMI.ex05;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorServico extends UnicastRemoteObject
{
    public ServidorServico() throws RemoteException
    {super();}
    
    public static void main(String[] args) 
    {
        try 
        {
            new ServidorServico().iniciar();
        } catch (RemoteException ex) 
        {
            Logger.getLogger(ServidorServico.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void iniciar()
    {    
        try 
        {
            Registry conexao = LocateRegistry.getRegistry(1099);
            Naming.rebind("servicoOla", new ImplOlaMundo());
            System.out.println("Servidor OlaMundo iniciado...");
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorServico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}