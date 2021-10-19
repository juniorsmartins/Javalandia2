package com.patterns.strategy.loja01.imposto;

import com.patterns.strategy.loja01.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto
{
    public BigDecimal calcular(Orcamento orcamento)
    {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
