package com.java.collection.listas;

import java.util.ArrayList;
import java.util.List;

public class Aula01_Main
{
    public static void main(String[] args)
    {
        List<Aula01_Conta> listaContas = new ArrayList<>();

        Aula01_ContaCorrente cc1 = new Aula01_ContaCorrente(12, 222333, 0.03);
        Aula01_ContaCorrente cc2 = new Aula01_ContaCorrente(57, 777555, 0.025);
        Aula01_ContaCorrente cc3 = new Aula01_ContaCorrente(84, 444111, 0.029);
        Aula01_ContaPoupanca pp1 = new Aula01_ContaPoupanca(91, 111999, 0.02);
        Aula01_ContaPoupanca pp2 = new Aula01_ContaPoupanca(96, 666999, 0.023);
        Aula01_ContaPoupanca pp3 = new Aula01_ContaPoupanca(98, 888999, 0.017);

        listaContas.add(cc2);
        listaContas.add(pp3);
        listaContas.add(cc1);
        listaContas.add(cc3);
        listaContas.add(pp2);
        listaContas.add(pp1);

        listaContas.forEach(conta -> System.out.println(conta));

        System.out.println("-----------------------");

        Aula01_ComparatorAgencia compar = new Aula01_ComparatorAgencia();
        listaContas.sort(compar);
        listaContas.forEach(conta -> System.out.println(conta));
    }
}
