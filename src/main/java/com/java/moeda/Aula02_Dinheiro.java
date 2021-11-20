package com.java.moeda;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

public class Aula02_Dinheiro
{
    public static void main(String[] args)
    {
        moedaBrasileira();
        moedaEstadunidense();

    }
    public static void moedaBrasileira()
    {
        System.out.println("----------------------------------");
        // Passo 1 - Definir com qual moeda trabalharemos
        CurrencyUnit moedaDoBrasil = Monetary.getCurrency("BRL");
        // Passo 2 - Criar o valor
        MonetaryAmount dinheiro = Money.of(75, moedaDoBrasil);
        // Passo 3 - imprimir resultado
        System.out.println("Parcela: " + dinheiro);
        // multiplicar
        MonetaryAmount total = dinheiro.multiply(12);
        System.out.println("Total: " + total);
    }
    public static void moedaEstadunidense()
    {
        System.out.println("----------------------------------");
        // Passo 1 - Definir com qual moeda trabalharemos
        CurrencyUnit moedaDoEUA = Monetary.getCurrency("USD");
        // Passo 2 - Criar o valor
        MonetaryAmount dinheiro = Money.of(75, moedaDoEUA);
        // Passo 3 - imprimir resultado
        System.out.println(dinheiro);
    }



}





