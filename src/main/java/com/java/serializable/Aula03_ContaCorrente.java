package com.java.serializable;

public class Aula03_ContaCorrente extends Aula03_Conta
{
    private double taxaMensal;

    public Aula03_ContaCorrente(int agencia, int numero, double taxaMensal)
    {
        super(agencia, numero);
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
