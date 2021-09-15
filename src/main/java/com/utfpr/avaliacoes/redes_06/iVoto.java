package com.utfpr.avaliacoes.redes_06;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface iVoto extends Remote
{
    // Assinatura de Métodos
    public Voto criarVotos(String opcaoDeVoto, Voto voto) throws RemoteException;
    public void enviarVotosParaContagem(List<Voto> votos) throws RemoteException;
    public void calcularResultados() throws RemoteException;
}