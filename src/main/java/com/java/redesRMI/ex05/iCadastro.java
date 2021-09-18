package com.java.redesRMI.ex05;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iCadastro extends Remote
{
    public boolean cadastrar(String[] dados) throws RemoteException;
    public String consultarID(int id) throws RemoteException;
    public String consultarNome(String nome) throws RemoteException;
    public boolean removerID(String id) throws RemoteException;
}