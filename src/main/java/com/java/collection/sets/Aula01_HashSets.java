package com.java.collection.sets;

import java.util.*;

public class Aula01_HashSets
{
    public static void main(String[] args)
    {
        Set notas1 = new HashSet(); // antes do Java 5
        Set<Double> notas2 = new HashSet<Double>(); // Java 5 - Generics
        Set<Double> notas3 = new HashSet<>(); // Java 7 - Operador Diamante/losango
        Set<Double> notas4 = Set.of(8d, 9d, 8.4, 10d, 7.3, 6.2, 4.6, 6d);
        notas4.add(2.5);
        notas4.add(8.1);
        notas4.remove(8d);

        Set<Double> notas5 = new HashSet<>(Arrays.asList(2.4, 4.1, 5.8, 7d, 8d, 7.9, 8.3, 9d, 10d, 9.7, 3.2, 6.4));
        notas5.forEach(System.out::println);

    }


}









