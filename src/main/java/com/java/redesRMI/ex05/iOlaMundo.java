package com.java.redesRMI.ex05;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iOlaMundo extends Remote
{
    public String olaMundo() throws RemoteException;
}