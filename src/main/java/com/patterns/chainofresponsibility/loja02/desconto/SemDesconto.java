package com.patterns.chainofresponsibility.loja02.desconto;

import com.patterns.chainofresponsibility.loja02.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto
{
    public SemDesconto()
    {super(null);}

    public BigDecimal calcular(Orcamento orcamento)
    {return BigDecimal.ZERO;}
}
