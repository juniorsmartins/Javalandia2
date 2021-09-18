package com.java.redesRMI.ex05;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ImplCadastro implements iCadastro, Serializable
{
    @Override
    public boolean cadastrar(String[] dados) throws RemoteException 
    {System.out.println("Dados: " + dados); return true;}

    @Override
    public String consultarID(int id) throws RemoteException 
    {System.out.println("ID: " + id); return "Nome";}

    @Override
    public String consultarNome(String nome) throws RemoteException 
    {
        String resposta = nome;
        try
        {
            iOlaMundo stub = (iOlaMundo) Naming.lookup("rmi://127.0.0.1/servicoOla");
            resposta = nome + " - " + stub.olaMundo();
            System.out.println("Servidor OlaMundo: " + stub.olaMundo());
        }catch(Exception e)
        {e.printStackTrace();}
        return resposta;
    }

    @Override
    public boolean removerID(String id) throws RemoteException 
    {System.out.println("ID: " + id); return true;}    
}