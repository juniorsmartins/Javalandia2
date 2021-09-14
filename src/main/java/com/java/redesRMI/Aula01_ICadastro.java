package com.java.redesRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Aula01_ICadastro extends Remote
{
    // Métodos abstratos
    public Aula01_Pessoa cadastrarPessoa(Aula01_Pessoa pessoa) throws RemoteException;
}