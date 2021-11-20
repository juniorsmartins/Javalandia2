package com.desafios.bootcamp_spread;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public final class Dev implements Serializable
{
    // -------------------- ATRIBUTOS DE CLASSE -------------------- //
    public static final long serialVersionUID = 1l;

    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();;

    // -------------------- CONSTRUTORES -------------------- //
    public Dev(){}

    // -------------------- MÉTODOS EXECUTORES -------------------- //
    public void inscreverBootcamp(Bootcamp bootcamp)
    {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir()
    {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent())
        {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }
        else
        {System.err.println("Dev não matriculado!");}
    }

    public double calcularTotalXp()
    {
        return conteudosInscritos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public Set<Conteudo> getConteudosInscritos()
    {return conteudosInscritos;}
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos)
    {this.conteudosInscritos = conteudosInscritos;}
    public Set<Conteudo> getConteudosConcluidos()
    {return conteudosConcluidos;}
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos)
    {this.conteudosConcluidos = conteudosConcluidos;}

    // -------------------- MÉTODOS SOBRESCRITOS -------------------- //
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome);
    }



}



