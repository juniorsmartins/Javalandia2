package com.java.collection.listas;

public class Aula04_Cursos
{
    private String nome;
    private int numVagas;

    public Aula04_Cursos(String nome, int numVagas)
    {
        this.setNome(nome);
        this.setNumVagas(numVagas);
    }

    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public int getNumVagas()
    {return numVagas;}
    public void setNumVagas(int numVagas)
    {this.numVagas = numVagas;}
}
