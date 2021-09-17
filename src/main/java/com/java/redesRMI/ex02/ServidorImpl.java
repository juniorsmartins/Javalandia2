package com.java.redesRMI.ex02;



import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorImpl implements Validadora
{

    @Override
    public boolean validarCPF(String cpf) throws RemoteException {
        return cpf.length() == 11;
    }

    @Override
    public String maiorMenorZero(int valor) throws RemoteException {
        if(valor > 0)
        {return "maior do que zero";}
        else
        {return "menor ou igual a zero";}
    }

    public static void main(String[] args) 
    {
        try
        {
            ServidorImpl serv = new ServidorImpl();
            // Criar skeleton
            Validadora skeleton = (Validadora) UnicastRemoteObject.exportObject(serv, 0);
            // Criar servidor de registro
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("metodosValidadores", skeleton);
            
            System.out.println("Servidor RMI pronto!");
        }catch(Exception e)
        {e.printStackTrace();}
    }
}