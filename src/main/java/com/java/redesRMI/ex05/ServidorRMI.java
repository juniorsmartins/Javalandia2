package com.java.redesRMI.ex05;

import com.utfpr5.impl.ImplCalculadora;
import com.utfpr5.impl.ImplCadastro;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorRMI extends UnicastRemoteObject
{
    public ServidorRMI() throws RemoteException
    {super();}
    
    ImplCalculadora calc;
    ImplCadastro cadastro;
    
    public static void main(String[] args) 
    {
        try
        {
            new ServidorRMI().iniciar();
        }catch(RemoteException re)
        {re.printStackTrace();}
    }

    private void iniciar()
    {
        try
        {
            calc = new ImplCalculadora();
            cadastro = new ImplCadastro();
            Registry registro = LocateRegistry.createRegistry(1099);
            System.out.println("Servidor Geral RMI iniciado...");
            registro.rebind("calculadora", calc);
            registro.rebind("cadastro", cadastro);
        }catch(Exception e)
        {e.printStackTrace();}
    }
}