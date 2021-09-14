package com.java.redesRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Aula01_somador extends Remote
{
    public int somar(int a, int b) throws RemoteException;
}