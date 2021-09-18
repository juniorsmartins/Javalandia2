package com.java.redesRMI.ex04;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MetodosRemotos extends Remote
{
    public String exibeValor(int valor) throws RemoteException;
}