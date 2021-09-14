package com.java.redesRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Aula02_calculadoraImpl extends UnicastRemoteObject implements Aula02_calculadora
{
    public Aula02_calculadoraImpl() throws RemoteException 
    {super();}

    public int add(int a, int b) throws RemoteException 
    {return a + b;}
}