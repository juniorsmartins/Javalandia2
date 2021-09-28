package com.java.collection.listas;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Aula04_Main
{
    public static void main(String[] args)
    {
        List<Aula04_Curso> listaCursos = new Vector<>();

        Aula04_Curso curso1 = new Aula04_Curso("Introdução a POO", 200);
        Aula04_Curso curso2 = new Aula04_Curso("Spring Framework", 250);
        Aula04_Curso curso3 = new Aula04_Curso("Java RMI", 110);
        Aula04_Curso curso4 = new Aula04_Curso("Threads em Java", 70);
        Aula04_Curso curso5 = new Aula04_Curso("Java Swing e JavaFX", 80);
        Aula04_Curso curso6 = new Aula04_Curso("Estrutura de Dados", 75);

        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);
        listaCursos.add(curso5);
        listaCursos.add(curso6);

        // Uso de stream com Lambda Expression
//        listaCursos.stream().sorted(Comparator.comparing(c1 -> c1.getNumVagas())).forEach(c1 -> System.out.println(c1));

        // Uso de stream com Method Reference
//        listaCursos.stream().sorted(Comparator.comparing(Aula04_Curso::getNumVagas)).forEach(System.out::println);

        listaCursos.stream()
                .filter(c1 -> c1.getNumVagas() >= 100)
                .sorted(Comparator.comparing(c2 -> c2.getNumVagas()))
                .forEach(c3 -> System.out.println(c3));

        System.out.println("-------------------------");

        listaCursos.stream()
                .filter(c1 -> c1.getNumVagas() > 90)
                .sorted(Comparator.comparing(c1 -> c1.getNumVagas()))
                .map(c1 -> c1.getNumVagas())
                .forEach(c1 -> System.out.println(c1));

        System.out.println("-------------------------");

        // Mesma coisa do anterior, mas com Method Reference
        listaCursos.stream()
                .filter(c1 -> c1.getNumVagas() > 90)
                .sorted(Comparator.comparing(Aula04_Curso::getNumVagas))
                .map(Aula04_Curso::getNumVagas)
                .forEach(System.out::println);
    }
}
