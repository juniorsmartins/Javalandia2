package com.java.serializable;

import java.io.Serializable;

public class Aula03_ContaPoupanca extends Aula03_Conta implements Serializable
{
    private double rendaMensal;

    public Aula03_ContaPoupanca(int agencia, int numero, Aula03_Cliente cliente, double rendaMensal)
    {
        super(agencia, numero, cliente);
        this.setRendaMensal(rendaMensal);
    }

    public double getRendaMensal()
    {return rendaMensal;}
    public void setRendaMensal(double rendaMensal)
    {this.rendaMensal = rendaMensal;}

    @Override
    public String toString()
    {
        return "\nConta Poupanca"
                + "\nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nRenda Mensal: " + this.getRendaMensal()
                + "\nCliente: " + super.getCliente().getNome();
    }
}
