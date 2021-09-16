package com.utfpr.avaliacoes.redes.atividade06;

import java.io.Serializable;

public class Voto implements Serializable
{
    private String nomeDoCandidato;
    
    public Voto(){};
    public Voto(String nome)
    {nomeDoCandidato = nome;}
    
    public void setNomeDoCandidato(String nome)
    {nomeDoCandidato = nome;}
    public String getNomeDoCandidato()
    {return nomeDoCandidato;}
}