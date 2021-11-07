package com.patterns.comportamental.chainofresponsibility.exemplo01.desconto;

import com.patterns.comportamental.chainofresponsibility.exemplo01.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto
{
    protected Desconto proximo;

    public Desconto(Desconto proximo)
    {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
