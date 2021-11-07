package com.patterns.comportamental.command.exemplo01;

import java.math.BigDecimal;

public class Orcamento
{
    private BigDecimal valor;
    private int quantidade;

    public Orcamento(BigDecimal valor, int quantidade)
    {
        super();
        this.valor = valor;
        this.quantidade = quantidade;
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










