package com.patterns.comportamental.state.exemplo01;

import com.patterns.comportamental.state.exemplo01.situacao.EmAnalise;

import java.math.BigDecimal;

public class Orcamento
{
    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    // -------------------- CONSTRUTORES -------------------- //
    public Orcamento(BigDecimal valor, int quantidadeItens)
    {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.setSituacao(new EmAnalise());
    }

    // -------------------- MÉTODOS CONTROLADORES -------------------- //
    public void aplicarDescontoExtra()
    {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    public void aprovar()
    {this.situacao.aprovar(this);}
    public void reprovar()
    {this.situacao.reprovar(this);}
    public void finalizar()
    {this.situacao.finalizar(this);}

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public BigDecimal getValor()
    {return valor;}
    public int getQuantidadeItens()
    {return quantidadeItens;}
    public SituacaoOrcamento getSituacao()
    {return situacao;}
    public void setValor(BigDecimal valor)
    {this.valor = valor;}
    public void setQuantidadeItens(int quantidadeItens)
    {this.quantidadeItens = quantidadeItens;}
    public void setSituacao(SituacaoOrcamento situacao)
    {this.situacao = situacao;}

}








