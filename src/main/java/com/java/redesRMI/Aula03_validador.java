package com.java.redesRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Aula03_validador extends Remote
{
    boolean validarCPF(String cpf) throws RemoteException;
}