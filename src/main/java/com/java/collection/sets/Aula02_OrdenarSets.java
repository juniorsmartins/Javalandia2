package com.java.collection.sets;

import java.util.*;

public class Aula02_OrdenarSets
{
    public static void main(String[] args)
    {
        System.out.println("-------------------------------");
        System.out.println("Impressão Aleatória");
        Set<Serie> series = new HashSet<>()
        {{
            add(new Serie("Maria", "Romance", 50));
            add(new Serie("Pedro", "Gospel", 66));
            add(new Serie("Alucard", "Anime", 45));
            add(new Serie("Paul", "Faroeste", 120));
        }};
        System.out.println(series);


        System.out.println("-------------------------------");
        System.out.println("Impressão por ordem de inserção");
        Set<Serie> series2 = new LinkedHashSet<>()
        {{
            add(new Serie("Maria", "Romance", 50));
            add(new Serie("Pedro", "Gospel", 66));
            add(new Serie("Alucard", "Anime", 45));
            add(new Serie("Paul", "Faroeste", 120));
        }};
        System.out.println(series2);



    }
}

class Serie
{
    public String nome;
    public String genero;
    public Integer tempoEpisodio;

    public Serie(){}
    public Serie(String nome, String genero, Integer tempoEpisodio)
    {this.nome = nome; this.genero = genero; this.tempoEpisodio = tempoEpisodio;}

    @Override
    public String toString()
    {
        return "Serie { " +
                "nome = " + nome + " - genero = " + genero + " - tempoEpisodio = " + tempoEpisodio + "}\n";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}



