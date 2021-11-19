package com.desafios.bootcamp_spread;

import java.io.Serializable;

public abstract class Conteudo implements Serializable
{
    // -------------------- ATRIBUTOS DE CLASSE -------------------- //
    public static final long serialVersionUID = 1l;
    protected static final double XP_PADRAO = 10d;

    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private String titulo;
    private String descricao;

    // -------------------- CONSTRUTORES -------------------- //
    public Conteudo(){}
    public Conteudo(String titulo, String descricao)
    {
        super();
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // -------------------- MÉTODOS EXECUTORES -------------------- //
    public abstract double calcularXp();

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public String getTitulo()
    {return titulo;}
    public void setTitulo(String titulo)
    {this.titulo = titulo;}
    public String getDescricao()
    {return descricao;}
    public void setDescricao(String descricao)
    {this.descricao = descricao;}




}





