package com.java.stream;

public class Aula01_Curso
{
    private String nome;
    private int numVagas;

    public Aula01_Curso(String nome, int numVagas)
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

    @Override
    public String toString() {
        return "\nCurso\nNome: " + this.getNome()
                + "\nNúmero de vagas: " + this.getNumVagas();
    }
}
