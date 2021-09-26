package com.java.collection.listas;

public class Aula03_Aula
{
    private String titulo;
    private int tempo;

    public Aula03_Aula(){}
    public Aula03_Aula(String titulo, int tempo)
    {
        this.setTitulo(titulo);
        this.setTempo(tempo);
    }

    public String getTitulo()
    {return titulo;}
    public void setTitulo(String titulo)
    {this.titulo = titulo;}
    public int getTempo()
    {return tempo;}
    public void setTempo(int tempo)
    {this.tempo = tempo;}

    @Override
    public String toString() {
        return "\nAula\nTitulo: " + this.getTitulo()
                + "\nTempo: " + this.getTempo();
    }
}
