package com.patterns.strategy.loja01.imposto;

import com.patterns.strategy.loja01.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto
{
    BigDecimal calcular(Orcamento orcamento);
}
