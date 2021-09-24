package com.java.generics;

public class Aula01_ContaCorrente extends Aula01_Conta {
    private double taxaMensal;

    public Aula01_ContaCorrente(int agencia, int numero, double taxaMensal) {
        super(agencia, numero);
        this.setTaxaMensal(taxaMensal);
    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(double taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    public String toString()
    {
        return "\nContaCorrente\nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nTaxaMensal: " + this.getTaxaMensal();
    }
}
