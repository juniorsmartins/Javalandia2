package com.java.redesRMI.ex05;

import com.utfpr5.interfaces.iOlaMundo;
import java.io.Serializable;
import java.rmi.RemoteException;

public class ImplOlaMundo implements iOlaMundo, Serializable
{
    @Override
    public String olaMundo() throws RemoteException 
    {return "Olá, Mundo dos serviços!";}    
}