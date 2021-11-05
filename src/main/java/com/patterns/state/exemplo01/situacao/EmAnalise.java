package com.patterns.state.exemplo01.situacao;

import com.patterns.state.exemplo01.Orcamento;

import java.math.BigDecimal;

public class EmAnalise
{
    public BigDecimal calcularValorDescontroExtra(Orcamento orcamento)
    {return orcamento.getValor().multiply(new BigDecimal("0.05"));}


}








