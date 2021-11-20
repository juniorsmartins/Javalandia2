package com.desafios.bootcamp_spread.d2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Temperatura implements Serializable
{
    /* -------------------- ATRIBUTOS DE CLASSE -------------------- */
    public static final long serialVersionUID = 1L;

    /* -------------------- ATRIBUTOS DE INSTÂNCIA -------------------- */
    private Month mes;
    private BigDecimal medida;

    /* -------------------- CONSTRUTORES -------------------- */
    public Temperatura(){}
    public Temperatura(Month mes, BigDecimal medida)
    {
        super();
        this.mes = mes;
        this.medida = medida;
    }

    /* -------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO -------------------- */
    public Month getMes()
    {return mes;}
    public void setMes(Month mes)
    {this.mes = mes;}
    public BigDecimal getMedida()
    {return medida;}
    public void setMedida(BigDecimal medida)
    {this.medida = medida;}

    /* -------------------- MÉTODOS SOBRESCRITOS -------------------- */
    @Override
    public String toString()
    {return "Temperatura { Mês = " + mes + " - Medida = " + medida + " }";}

}
