package com.java.streams;

import com.java.collection.listas.Aula04_Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Aula01_Main
{
    public static void main(String[] args)
    {
        List<Aula01_Curso> listaCursos = new LinkedList<>();

        Aula01_Curso curso1 = new Aula01_Curso("Introdução a POO", 200);
        Aula01_Curso curso2 = new Aula01_Curso("Spring Framework", 250);
        Aula01_Curso curso3 = new Aula01_Curso("Java RMI", 110);
        Aula01_Curso curso4 = new Aula01_Curso("Threads em Java", 70);
        Aula01_Curso curso5 = new Aula01_Curso("Java Swing e JavaFX", 80);
        Aula01_Curso curso6 = new Aula01_Curso("Estrutura de Dados", 75);

        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);
        listaCursos.add(curso5);
        listaCursos.add(curso6);

        listaCursos.stream()
                .filter(c1 -> c1.getNumVagas() >= 80)
                .sorted(Comparator.comparing(c1 -> c1.getNumVagas()))
                .forEach(System.out::println);

        System.out.println("----------------------");

        List<Aula01_Curso> cursos = listaCursos.stream()
                .filter(c1 -> c1.getNumVagas() >= 100)
                .collect(Collectors.toList());

        cursos.stream().forEach(System.out::println);

        System.out.println("----------------------");

        Map<String, Integer> mapaCursos = listaCursos.stream()
                .filter(c -> c.getNumVagas() > 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getNumVagas()));

        mapaCursos.forEach((nome, numVagas) -> System.out.println(nome + " - " + numVagas));
    }
}
