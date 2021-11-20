package com.desafios.bootcamp_spread.d1;

import java.io.Serializable;

public final class Curso extends Conteudo implements Serializable
{
    // -------------------- ATRIBUTOS DE CLASSE -------------------- //
    public static final long serialVersionUID = 1l;

    // -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- //
    private int cargaHoraria;

    // -------------------- CONSTRUTORES -------------------- //
    public Curso(){}
    public Curso(String titulo, String descricao, int cargaHoraria)
    {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    // -------------------- MÉTODOS EXECUTORES -------------------- //
    public double calcularXp()
    {return Conteudo.XP_PADRAO * cargaHoraria;}

    // -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- //
    public int getCargaHoraria()
    {return cargaHoraria;}
    public void setCargaHoraria(int cargaHoraria)
    {this.cargaHoraria = cargaHoraria;}

    // -------------------- MÉTODOS SOBRESCRITOS -------------------- //
    @Override
    public String toString()
    {
        return "Curso { Titulo = " + super.getTitulo() + " - Descricao = " + super.getDescricao() + " - " +
                "Carga Horaria = " + cargaHoraria + " } \n";
    }


}


