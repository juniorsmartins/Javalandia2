package com.patterns.state.exemplo01;

import java.math.BigDecimal;

public class Orcamento
{
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens)
    {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra()
    {}

    public BigDecimal getValor()
    {return valor;}
    public int getQuantidadeItens()
    {return quantidadeItens;}
    public void setValor(BigDecimal valor)
    {this.valor = valor;}
    public void setQuantidadeItens(int quantidadeItens)
    {this.quantidadeItens = quantidadeItens;}

}








