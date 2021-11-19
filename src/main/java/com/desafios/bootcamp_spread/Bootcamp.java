package com.desafios.bootcamp_spread;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class Bootcamp implements Serializable
{
    // -------------------- ATRIBUTOS DE CLASSE -------------------- //
    public static final long serialVersionUID = 1L;

    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate datafinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // -------------------- CONSTRUTORES -------------------- //
    public Bootcamp(){}

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public String getDescricao()
    {return descricao;}
    public void setDescricao(String descricao)
    {this.descricao = descricao;}
    public LocalDate getDataInicial()
    {return dataInicial;}
    public void setDataInicial(LocalDate dataInicial)
    {this.dataInicial = dataInicial;}
    public LocalDate getDatafinal()
    {return datafinal;}
    public void setDatafinal(LocalDate datafinal)
    {this.datafinal = datafinal;}
    public Set<Dev> getDevsInscritos()
    {return devsInscritos;}
    public void setDevsInscritos(Set<Dev> devsInscritos)
    {this.devsInscritos = devsInscritos;}
    public Set<Conteudo> getConteudos()
    {return conteudos;}
    public void setConteudos(Set<Conteudo> conteudos)
    {this.conteudos = conteudos;}

    // -------------------- MÉTODOS SOBRESCRITOS -------------------- //
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(dataInicial, bootcamp.dataInicial);
    }

    @Override
    public int hashCode()
    {return Objects.hash(nome, dataInicial);}



}



