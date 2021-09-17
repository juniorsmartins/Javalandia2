package com.java.redesRMI.ex03;

import com.java.redesRMI.ex03.Pessoa;
import com.java.redesRMI.ex03.InterfaceObjeto;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorObjeto implements InterfaceObjeto
{
    @Override
    public String enviarObjeto(Pessoa pessoa) throws RemoteException 
    {
        System.out.println("========================");
        System.out.println("Recebeu dados do cliente");
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        return "Dados recebidos pelo servidor!\n";
    }
    
    public static void main(String[] args) 
    {
        try
        {
            ServidorObjeto servidor = new ServidorObjeto();
            InterfaceObjeto skeleton = (InterfaceObjeto)UnicastRemoteObject.exportObject(servidor, 0);
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("metodoPessoa", skeleton);
            System.out.println("Aguardando conexão...\n");
        }catch(Exception e)
        {e.printStackTrace();}
    }
}