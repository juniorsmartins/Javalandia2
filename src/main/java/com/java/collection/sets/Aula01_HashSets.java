package com.java.collection.sets;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Aula01_HashSets
{
    public static void main(String[] args)
    {
        Set notas1 = new HashSet(); // antes do Java 5
        Set<Double> notas2 = new HashSet<Double>(); // Java 5 - Generics
        Set<Double> notas3 = new HashSet<>(); // Java 7 - Operador Diamante/losango
        notas3.add(8d);
        notas3.add(2.5);
        notas3.add(8.1);
        notas3.remove(8d);

        Set<Double> notas5 = new HashSet<>(Arrays.asList(2.4, 4.1, 5.8, 7d, 7.9, 8.3, 9d, 10d, 9.7, 6.4));
        notas5.forEach(System.out::println);

        System.out.println("Notas5 contém nota 7: " + notas5.contains(7d));
        System.out.println("Qual a menor nota de Notas5: " + notas5.stream().min(Double::compare).get());
        System.out.println("Qual a menor nota de Notas5: " + Collections.min(notas5));
        System.out.println("Qual a maior nota: " + notas5.stream().max(Double::compare).get());
        System.out.println("Qual a maior nota: " + Collections.max(notas5));
        System.out.println("Soma das notas: " + notas5.stream().reduce((a, b) -> a = a + b).get());
        Iterator<Double> iterator = notas5.iterator();
        Double soma = 0d;
        while(iterator.hasNext())
        {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas: " + soma);
        System.out.println("Nota média: " + soma/notas5.size());
        System.out.println("Mostre notas acima de 7: ");
        notas5.stream().filter((a) -> a > 7).forEach(System.out::println);
        System.out.println("-----------------------");
        while(iterator.hasNext())
        {
            Double next = iterator.next();
            if(next > 7)
                System.out.println(next);
        }


    }


}









