package com.java.classeanonima;

public class Aula01_ContaCorrente extends Aula01_Conta
{
    private double taxaMensal;

    public Aula01_ContaCorrente(int agencia, int numero, Aula01_Cliente cliente, double taxaMensal)
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
        return "\nConta Corrente\nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nTaxa Mensal: " + this.getTaxaMensal()
                + "\nNome Cliente: " + super.getCliente().getNome();
    }
}
