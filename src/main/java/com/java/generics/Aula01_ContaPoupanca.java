package com.java.generics;

import java.util.Objects;

public class Aula01_ContaPoupanca extends Aula01_Conta
{
    private double rendaMensal;

    public Aula01_ContaPoupanca(int agencia, int numero, double rendaMensal)
    {
        super(agencia, numero);
        this.setRendaMensal(rendaMensal);
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    @Override
    public String toString()
    {
        return "\nContaPoupanca\nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nRendaMensal: " + this.getRendaMensal();
    }
}
