package com.java.serializable;

public abstract class Aula03_Conta
{
    private int agencia;
    private int numero;
    private Aula03_Cliente cliente;

    public Aula03_Conta(int agencia, int numero)
    {
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

    public int getAgencia()
    {return agencia;}
    public void setAgencia(int agencia)
    {this.agencia = agencia;}
    public int getNumero()
    {return numero;}
    public void setNumero(int numero)
    {this.numero = numero;}
    public Aula03_Cliente getCliente()
    {return cliente;}
    public void setCliente(Aula03_Cliente cliente)
    {this.cliente = cliente;}
}
