package com.estruturadedados.lista.aula01;

public class No<T>
{
    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private T conteudo;
    private No<T> proximoNo;

    // -------------------- CONSTRUTORES -------------------- //
    public No()
    {this.proximoNo = null;}
    public No(T conteudo)
    {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }
    public No(T conteudo, No<T> proximoNo)
    {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public T getConteudo()
    {return conteudo;}
    public void setConteudo(T conteudo)
    {this.conteudo = conteudo;}
    public No<T> getProximoNo()
    {return proximoNo;}
    public void setProximoNo(No<T> proximoNo)
    {this.proximoNo = proximoNo;}

    // -------------------- MÉTODOS SOBRESCRITOS -------------------- //
    @Override
    public String toString()
    {return "No {conteudo = " + conteudo + "}";}


}



