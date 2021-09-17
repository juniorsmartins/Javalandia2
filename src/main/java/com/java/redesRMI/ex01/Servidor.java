package com.java.redesRMI.ex01;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor implements iOlaMundo
{
    public static void main(String[] args) 
    {
        try
        {
            // lançar servidor de registro
            Registry servidorRegistro = LocateRegistry.createRegistry(1099);
            // criar skeleton
            Servidor serv = new Servidor();
            iOlaMundo skeleton = (iOlaMundo) UnicastRemoteObject.exportObject(serv, 0); // conecta o servidor com o servidor de registro
            
            // inserir no servidor de registro uma referência dos meus métodos
            servidorRegistro.bind("olaMundo", skeleton);
            System.out.println("Servidor aguardando conexão...");
            
        }catch(RemoteException e)
        {e.printStackTrace();}
        catch(AlreadyBoundException ae)
        {ae.printStackTrace();}
    }

    @Override
    public String olaMundo() throws RemoteException 
    {return "Olá, Mundio RMI!";}
}