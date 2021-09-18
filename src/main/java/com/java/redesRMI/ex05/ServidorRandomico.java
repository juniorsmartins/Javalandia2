package com.java.redesRMI.ex05;

import com.utfpr5.impl.ImplRandomico;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorRandomico extends UnicastRemoteObject
{
    public ServidorRandomico() throws RemoteException
    {super();}
    
    public void iniciar()
    {
        try
        {
            ImplRandomico randomico = new ImplRandomico();
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            Naming.rebind("randomico", randomico);
            System.out.println("Servidor randomico iniciado...");
        }catch(Exception e)
        {e.printStackTrace();}
    }
    
    public static void main(String[] args) throws RemoteException
    {
        ServidorRandomico serv= new ServidorRandomico();
        serv.iniciar();
    }
}