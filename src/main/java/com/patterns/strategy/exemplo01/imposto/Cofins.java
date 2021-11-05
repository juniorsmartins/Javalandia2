package com.patterns.strategy.exemplo01.imposto;

import com.patterns.strategy.exemplo01.orcamento.Orcamento;

import java.math.BigDecimal;

public class Cofins implements Imposto
{
    public BigDecimal calcular(Orcamento orcamento)
    {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }
}
