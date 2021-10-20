package com.patterns.chainofresponsibility.loja02.desconto;

import com.patterns.chainofresponsibility.loja02.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoVendaMaior500 extends Desconto
{
    public DescontoVendaMaior500(Desconto proximo)
    {super(proximo);}

    public BigDecimal calcular(Orcamento orcamento)
    {
        if(orcamento.getValor().compareTo(new BigDecimal("500.00")) > 0)
        {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }
}
