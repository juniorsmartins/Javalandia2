package com.java.redesRMI.ex01;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iOlaMundo extends Remote
{
    public String olaMundo() throws RemoteException;
}