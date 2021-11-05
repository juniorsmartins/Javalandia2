package com.patterns.state.exemplo01.situacao;

import com.patterns.state.exemplo01.Orcamento;
import com.patterns.state.exemplo01.SituacaoOrcamento;

public class Reprovado extends SituacaoOrcamento
{
    @Override
    public void finalizar(Orcamento orcamento)
    {orcamento.setSituacao(new Finalizado());}
}










