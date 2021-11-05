package com.patterns.state.exemplo01.situacao;

import com.patterns.state.exemplo01.Orcamento;
import com.patterns.state.exemplo01.SituacaoOrcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento
{
    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento)
    {return orcamento.getValor().multiply(new BigDecimal("0.02"));}

    @Override
    public void finalizar(Orcamento orcamento)
    {orcamento.setSituacao(new Finalizado());}


}









