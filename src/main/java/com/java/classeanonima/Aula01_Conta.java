package com.java.classeanonima;

import java.util.Objects;

public abstract class Aula01_Conta
{
    private int agencia;
    private int numero;
    Aula01_Cliente cliente;

    public Aula01_Conta(int agencia, int numero, Aula01_Cliente cliente)
    {
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setCliente(cliente);
    }

    public int getNumero()
    {return numero;}
    public void setNumero(int numero)
    {this.numero = numero;}
    public int getAgencia()
    {return agencia;}
    public void setAgencia(int agencia)
    {this.agencia = agencia;}
    public Aula01_Cliente getCliente()
    {return cliente;}
    public void setCliente(Aula01_Cliente cliente)
    {this.cliente = cliente;}

    @Override
    public boolean equals(Object o)
    {
        Aula01_Conta conta = (Aula01_Conta) o;
        if(this.getAgencia() != conta.getAgencia())
        {return false;}
        if(this.getNumero() != conta.getNumero())
        {return false;}
        return true;
    }

    @Override
    public int hashCode()
    {return Objects.hash(getAgencia(), getNumero());}
}
