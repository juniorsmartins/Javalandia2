package com.desafios.bootcamp_spread.d1;

import java.io.Serializable;
import java.time.LocalDate;

public final class Mentoria extends Conteudo implements Serializable
{
    // -------------------- ATRIBUTOS DE CLASSE -------------------- //
    public static final long serialVersionUID = 1l;

    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private LocalDate data;

    // -------------------- CONSTRUTORES -------------------- //
    public Mentoria(){}
    public Mentoria(String titulo, String descricao, LocalDate data)
    {
        super(titulo, descricao);
        this.data = data;
    }

    // -------------------- MÉTODOS EXECUTORES -------------------- //
    @Override
    public final double calcularXp()
    {return Conteudo.XP_PADRAO + 30D;}

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public LocalDate getData()
    {return data;}
    public void setData(LocalDate data)
    {this.data = data;}

    // -------------------- MÉTODOS SOBRESCRITOS -------------------- //
    @Override
    public String toString()
    {
        return "Mentoria { Titulo = " + super.getTitulo() + " - Descricao = " + super.getDescricao() + " - " +
                "Data = " + data + " }\n";
    }
}





