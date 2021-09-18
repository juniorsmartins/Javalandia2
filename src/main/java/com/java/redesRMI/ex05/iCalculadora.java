package com.java.redesRMI.ex05;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iCalculadora extends Remote
{
    public long adicionar(long a, long b) throws RemoteException;
    public long subtrair(long a, long b) throws RemoteException;
    public long multiplicar(long a, long b) throws RemoteException;
    public long dividir(long a, long b) throws RemoteException;
}