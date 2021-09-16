package com.utfpr.avaliacoes.redes.atividadefinal;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor 
{
    public static void main(String[] args) 
    {
        try
        {
            ICalculadora calculadoraImpl = new CalculadoraImpl();
            String nomeObjetoRemoto = "rmi://localhost/calcular";
            LocateRegistry.createRegistry(1099);
            Naming.rebind(nomeObjetoRemoto, calculadoraImpl);
        
        }catch(MalformedURLException | RemoteException re)
        {System.err.println("\nExcecao no Servidor!");}
        
        System.out.println("\n---------- Servidor Ativo! ----------");
    }
}