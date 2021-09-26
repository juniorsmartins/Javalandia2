package com.java.serializable;

import java.io.Serializable;

public class Aula03_ContaCorrente extends Aula03_Conta implements Serializable
{
    private double taxaMensal;

    public Aula03_ContaCorrente(int agencia, int numero, Aula03_Cliente cliente, double taxaMensal)
    {
        super(agencia, numero, cliente);
        this.setTaxaMensal(taxaMensal);
    }

    public double getTaxaMensal()
    {return taxaMensal;}
    public void setTaxaMensal(double taxaMensal)
    {this.taxaMensal = taxaMensal;}

    @Override
    public String toString()
    {
        return "\nConta Poupanca"
                + "\nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nTaxa Mensal: " + this.getTaxaMensal()
                + "\nCliente: " + super.getCliente().getNome();
    }
}
