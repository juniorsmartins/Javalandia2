package com.java.collection.listas;

import java.util.ArrayList;
import java.util.Collections;

public class Aula02_MainLista
{
    public static void main(String[] args)
    {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando em cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);

        System.out.println("\n----------------");

        for (String aula : aulas)
        {System.out.println(aula);}

        System.out.println("\n----------------");

        aulas.forEach(aula -> System.out.println(aula));

        System.out.println("\n----------------");

        aulas.add("Aumentando nosso conhecimento!");
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
