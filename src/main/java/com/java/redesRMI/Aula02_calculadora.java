package com.java.redesRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Aula02_calculadora extends Remote
{
    public int add(int a, int b) throws RemoteException;
}