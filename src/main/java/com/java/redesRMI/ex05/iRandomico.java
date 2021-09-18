package com.java.redesRMI.ex05;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iRandomico extends Remote
{
    public int retornaValorRandomico() throws RemoteException;
    public int retornaValorRandomicoIntervalo(int a, int b) throws RemoteException;
}