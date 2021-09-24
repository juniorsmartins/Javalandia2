package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Aula01_Main
{
    public static void main(String[] args)
    {
        List<Aula01_Conta> contas = new ArrayList<>();

        Aula01_ContaCorrente cc1 = new Aula01_ContaCorrente(57, 113344, 0.03);
        Aula01_ContaCorrente cc2 = new Aula01_ContaCorrente(70, 882266, 0.025);
        Aula01_ContaPoupanca pp1 = new Aula01_ContaPoupanca(26, 334455, 0.02);
        Aula01_ContaPoupanca pp2 = new Aula01_ContaPoupanca(26, 779999, 0.028);

        contas.add(cc1);
        contas.add(pp1);
        contas.add(cc2);
        contas.add(pp2);

        contas.forEach(conta -> System.out.println(conta));
    }
}
