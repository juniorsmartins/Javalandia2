package com.patterns.chainofresponsibility.loja02.orcamento;

import java.math.BigDecimal;

public class Orcamento
{
    private BigDecimal valor;
    private int quantidadeItens;

    public Orcamento(BigDecimal valor, int quantidadeItens)
    {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor(){return valor;}
    public int getQuantidadeItens(){return quantidadeItens;}
}
