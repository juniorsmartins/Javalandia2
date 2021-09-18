package com.java.redesRMI.ex05;

import com.utfpr5.interfaces.iCalculadora;
import java.io.Serializable;
import java.rmi.RemoteException;

public class ImplCalculadora implements iCalculadora, Serializable
{
    @Override
    public long adicionar(long a, long b) throws RemoteException 
    {return a + b;}

    @Override
    public long subtrair(long a, long b) throws RemoteException 
    {return a - b;}

    @Override
    public long multiplicar(long a, long b) throws RemoteException 
    {return a * b;}

    @Override
    public long dividir(long a, long b) throws RemoteException 
    {return a / b;}
}