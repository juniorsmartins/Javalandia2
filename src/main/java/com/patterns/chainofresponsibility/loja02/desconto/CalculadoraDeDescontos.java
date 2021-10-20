package com.patterns.chainofresponsibility.loja02.desconto;

import com.patterns.chainofresponsibility.loja02.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos
{
    public BigDecimal calcular(Orcamento orcamento)
    {
        Desconto desconto = new DescontoQtdeMaiorCincoItens(new DescontoVendaMaior500(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
