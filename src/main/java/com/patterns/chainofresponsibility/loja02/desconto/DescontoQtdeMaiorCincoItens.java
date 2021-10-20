package com.patterns.chainofresponsibility.loja02.desconto;

import com.patterns.chainofresponsibility.loja02.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQtdeMaiorCincoItens extends Desconto
{
    public DescontoQtdeMaiorCincoItens(Desconto proximo)
    {super(proximo);}

    public BigDecimal calcular(Orcamento orcamento)
    {
        if(orcamento.getQuantidadeItens() > 5)
        {return orcamento.getValor().multiply(new BigDecimal("0.1"));}

        return proximo.calcular(orcamento);
    }
}




