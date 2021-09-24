package com.java.generics;

import java.util.Objects;

public abstract class Aula01_Conta
{
    private int agencia;
    private int numero;

    public Aula01_Conta(int agencia, int numero)
    {
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {

        Aula01_Conta conta = (Aula01_Conta) o;

        if (this.getAgencia() != conta.getAgencia())
        {return false;}

        if (this.getNumero() != conta.getNumero())
        {return false;}

        return true;
    }

    @Override
    public int hashCode()
    {return Objects.hash(getAgencia(), getNumero());}
}
