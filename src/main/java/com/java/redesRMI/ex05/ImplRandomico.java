package com.java.redesRMI.ex05;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class ImplRandomico extends UnicastRemoteObject implements iRandomico, Serializable
{
    private Random random = new Random();
    
    public ImplRandomico() throws RemoteException
    {super();}
    
    @Override
    public int retornaValorRandomico() throws RemoteException 
    {
        int valor = random.nextInt();
        return valor;
    }

    @Override
    public int retornaValorRandomicoIntervalo(int a, int b) throws RemoteException 
    {
        int valor = a + random.nextInt(a + b);
        return valor;
    }
}