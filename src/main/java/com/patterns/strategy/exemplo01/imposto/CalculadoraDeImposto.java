package com.patterns.strategy.exemplo01.imposto;

import com.patterns.strategy.exemplo01.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto
{
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto)
    {
        return imposto.calcular(orcamento);
    }
}
