package com.java.collection.listas;

import java.util.*;

public class Aula05_ArrayList
{
    public static void main(String[] args)
    {
        // Formas de instanciar um ArrayList
        List notas1 = new ArrayList(); // antes do Java 5
        List<Double> notas2 = new ArrayList<Double>(); // Generics (Java 5)
        List<Double> notas3 = new ArrayList<>(); // Diamond Operator (Java 7)
        List<Double> notas4 = new ArrayList<>(Arrays.asList(8d, 10d, 5d, 3.5d, 4.8d, 9d));
        List<Double> notas5 = Arrays.asList(8d, 10d, 5d, 3.5d, 4.8d, 9d); // bloqueia adicionar e remover notas - não pode
        List<Double> notas6 = List.of(8d, 10d, 5d, 3.5d, 4.8d, 9d); // bloqueia adicionar e remover - não pode

        List<Double> notas7 = new ArrayList<>();
        notas7.add(8d);
        notas7.add(8.5);
        notas7.add(9.1);
        notas7.add(10d);
        notas7.add(5d);
        notas7.forEach(System.out::println);

        System.out.println("---------------------");
        System.out.println("Exibe a posição da nota 9.1: " + notas7.indexOf(9.1));
        System.out.println("---------------------");
        System.out.println("Adiciona a nota 7,2 na posição 3: ");
        notas7.add(3, 7.2);
        notas7.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("Substitua a nota 5,0 por nota 6.0: ");
        notas7.set(notas7.indexOf(5d), 6d);
        notas7.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("A nota 8.5 está na lista? " + (notas7.contains(8.5d) ? "sim" : "não"));
        System.out.println("---------------------");
        System.out.println("Exiba a nota na terceira posiçao: " + notas7.get(2));
        System.out.println("---------------------");
        System.out.println("Exibir a menor nota: " + Collections.min(notas7));
        System.out.println("---------------------");
        System.out.println("Exibir a maior nota: " + Collections.max(notas7));
        System.out.println("---------------------");
        Iterator<Double> iterator = notas7.iterator();
        Double soma = 0d;
        while(iterator.hasNext())
        {
            Double next = iterator.next();
            soma += next;
        }
        System.out.printf("Exibir a soma dos valores: %s \n", soma);
        System.out.println("---------------------");
        System.out.println("Exibir a média das notas: " + soma/notas7.size());
        System.out.println("---------------------");
        System.out.println("Remova a nota 10: ");
        notas7.remove(10d); // Remoção por objeto
        System.out.println(notas7);
        System.out.println("Remova a posição 2: ");
        notas7.remove(1); // Remoção por posição
        System.out.println(notas7);
        System.out.println("---------------------");

        System.out.println("Remova as notas menores do que 7,5 e imprima a lista");
        Iterator<Double> iterator2 = notas7.iterator();
        while(iterator2.hasNext())
        {
            Double next = iterator2.next();
            if(next >= 7.5)
                System.out.println(next);
        }

        System.out.println("---------------------");
        System.out.println("Remova as notas menores do que 7,5 e imprima a lista (jeito 2)");
        notas7.stream().filter(nota -> nota >= 7.5).forEach(System.out::println);

        System.out.println("---------------------");
        System.out.println("Apagar toda a lista");
        notas7.clear();
        notas7.forEach(System.out::println);

        System.out.println("---------------------");
        System.out.println("A lista está vazia? " + (notas7.isEmpty() ? "sim" : "não"));

    }

}



