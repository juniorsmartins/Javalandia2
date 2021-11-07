package com.patterns.comportamental.strategy.exemplo01.imposto;

import com.patterns.comportamental.strategy.exemplo01.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto
{
    BigDecimal calcular(Orcamento orcamento);
}
