package com.patterns.chainofresponsibility.exemplo01.desconto;

import com.patterns.chainofresponsibility.exemplo01.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto
{
    public SemDesconto()
    {super(null);}

    public BigDecimal calcular(Orcamento orcamento)
    {return BigDecimal.ZERO;}
}
