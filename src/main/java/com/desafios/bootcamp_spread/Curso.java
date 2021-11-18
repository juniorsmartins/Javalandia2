package com.desafios.bootcamp_spread;

import java.io.Serializable;

public final class Curso implements Serializable
{
    // -------------------- ATRIBUTOS DE CLASSE -------------------- //
    public static final long serialVersionUID = 1l;

    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    // -------------------- CONSTRUTORES -------------------- //
    public Curso(){}
    public Curso(String titulo, String descricao, int cargaHoraria)
    {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    // -------------------- MÉTODOS EXECUTORES -------------------- //
    public void calcularXp()
    {}

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public String getTitulo()
    {return titulo;}
    public void setTitulo(String titulo)
    {this.titulo = titulo;}
    public String getDescricao()
    {return descricao;}
    public void setDescricao(String descricao)
    {this.descricao = descricao;}
    public int getCargaHoraria()
    {return cargaHoraria;}
    public void setCargaHoraria(int cargaHoraria)
    {this.cargaHoraria = cargaHoraria;}

    // -------------------- MÉTODOS SOBRESCRITOS -------------------- //
    @Override
    public String toString() {
        return "Curso { " + "\n" +
                "Titulo = " + titulo + "\n" +
                "Descricao = " + descricao + "\n" +
                "Carga Horaria = " + cargaHoraria + " }";
    }


}


