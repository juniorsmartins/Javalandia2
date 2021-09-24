package com.java.collection.listas;

public class Aula01_ContaPoupanca extends Aula01_Conta
{
    private double rendaMensal;

    public Aula01_ContaPoupanca(int agencia, int numero, double rendaMensal)
    {
        super(agencia, numero);
        this.setRendaMensal(rendaMensal);
    }

    public double getRendaMensal()
    {return rendaMensal;}
    public void setRendaMensal(double rendaMensal)
    {this.rendaMensal = rendaMensal;}

    @Override
    public String toString()
    {
        return "\nConta Poupanca\nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nRenda Mensal: " + this.getRendaMensal();
    }
}
