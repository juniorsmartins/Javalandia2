package com.patterns.estrutural.adapter.exemplo01;

import java.math.BigDecimal;

public class Orcamento
{
    private BigDecimal valor;
    private int quantidade;

    public Orcamento(BigDecimal valor, int quantidade)
    {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public boolean isFinalizado()
    {
        // sem regras - apenas para teste
        return true;
    }

    public BigDecimal getValor()
    {return valor;}
    public void setValor(BigDecimal valor)
    {this.valor = valor;}
    public int getQuantidade()
    {return quantidade;}
    public void setQuantidade(int quantidade)
    {this.quantidade = quantidade;}


}










