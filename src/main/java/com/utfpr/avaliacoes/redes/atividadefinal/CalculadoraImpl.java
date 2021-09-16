package com.utfpr.avaliacoes.redes.atividadefinal;

import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements ICalculadora
{
    @Override
    public long add(long a, long b)
    {return (a + b);}
    
    @Override
    public long sub(long a, long b)
    {return (a - b);}
    
    @Override
    public long mul(long a, long b)
    {return (a * b);}

    @Override
    public long div(long a, long b)
    {
        long resposta = 0;
        try
        {
            resposta = (a / b);
        }catch(ArithmeticException ae)
        {System.err.println("\nExcecao! Divisão por zero!");}
        return resposta;
    }
}
