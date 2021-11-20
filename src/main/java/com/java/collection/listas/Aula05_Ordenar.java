package com.java.collection.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula05_Ordenar
{
    public static void main(String[] args)
    {
/*
        Gato gato1 = new Gato();
        gato1.nome = "Jon";
        gato1.idade = 18;
        gato1.cor = "preto";

        Gato gato2 = new Gato();
        gato2.nome = "Simba";
        gato2.idade = 6;
        gato2.cor = "tigrado";

        Gato gato3 = new Gato();
        gato3.nome = "Jon";
        gato3.idade = 12;
        gato3.cor = "amarelo";
*/

        List<Gato> gatos = new ArrayList<>()
        {{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem de inserção");
        gatos.forEach(System.out::println);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem aleatória");
        Collections.shuffle(gatos);
        gatos.forEach(System.out::println);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem natural por nome - com interface Comparable");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem natural por idade - com classe/interface Comparator");
        // Collections.sort(gatos, new ComparatorIdade());
        // ou
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem natural por idade");
        gatos.stream().sorted(Comparator.comparing(Gato::getIdade)).forEach(System.out::println);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem decrescente por idade");
        gatos.stream().sorted(Comparator.comparing(Gato::getIdade).reversed()).forEach(System.out::println);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem natural de nome/cor/idade");
        // Collections.sort(gatos, new ComparatorNomeCorIdade());
        // ou
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);

        System.out.println("----------------------------------");
        System.out.println("Impressão em ordem decrescente de nome/cor/idade");
        // Collections.sort(gatos, new ComparatorNomeCorIdade().reversed());
        // ou
        gatos.sort(new ComparatorNomeCorIdade().reversed());
        System.out.println(gatos);

    }

}

class Gato implements Comparable<Gato>
{
    private String nome;
    private int idade;
    private String cor;

    Gato(){}
    Gato(String nome, int idade, String cor)
    {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public int getIdade()
    {return idade;}
    public void setIdade(int idade)
    {this.idade = idade;}
    public String getCor()
    {return cor;}
    public void setCor(String cor)
    {this.cor = cor;}

    @Override
    public String toString()
    {return "Gato { Nome = " + nome + " - Idade = " + idade + " - Cor = " + cor + " }";}

    @Override
    public int compareTo(Gato o)
    {return this.getNome().compareToIgnoreCase(o.getNome());}
}

class ComparatorIdade implements Comparator<Gato>
{
    @Override
    public int compare(Gato g1, Gato g2)
    {return Integer.compare(g1.getIdade(), g2.getIdade());}
}

class ComparatorNomeCorIdade implements Comparator<Gato>
{
    @Override
    public int compare(Gato g1, Gato g2)
    {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}