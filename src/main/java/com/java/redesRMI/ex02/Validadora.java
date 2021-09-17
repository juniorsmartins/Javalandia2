package com.java.redesRMI.ex02;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Validadora extends Remote
{
    boolean validarCPF(String cpf) throws RemoteException;
    String maiorMenorZero(int valor) throws RemoteException;
}