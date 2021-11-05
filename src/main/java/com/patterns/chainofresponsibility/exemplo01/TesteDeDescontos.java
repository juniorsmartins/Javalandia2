package com.patterns.chainofresponsibility.exemplo01;

import com.patterns.chainofresponsibility.exemplo01.desconto.CalculadoraDeDescontos;
import com.patterns.chainofresponsibility.exemplo01.orcamento.Orcamento;
import java.math.BigDecimal;

public class TesteDeDescontos
{
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento1));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
        System.out.println(calculadoraDeDescontos.calcular(orcamento3));
    }
}
