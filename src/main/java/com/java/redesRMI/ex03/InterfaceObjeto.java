package com.java.redesRMI.ex03;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceObjeto extends Remote
{
    String enviarObjeto(Pessoa pessoa) throws RemoteException;
}