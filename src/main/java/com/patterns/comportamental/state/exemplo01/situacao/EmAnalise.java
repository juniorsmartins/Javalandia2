package com.patterns.comportamental.state.exemplo01.situacao;

import com.patterns.comportamental.state.exemplo01.Orcamento;
import com.patterns.comportamental.state.exemplo01.SituacaoOrcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento
{
    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento)
    {return orcamento.getValor().multiply(new BigDecimal("0.05"));}

    @Override
    public void aprovar(Orcamento orcamento)
    {orcamento.setSituacao(new Aprovado());}

    @Override
    public void reprovar(Orcamento orcamento)
    {orcamento.setSituacao(new Reprovado());}

}








