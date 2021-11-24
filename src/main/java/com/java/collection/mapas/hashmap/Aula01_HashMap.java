package com.java.collection.mapas.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Aula01_HashMap
{
    public static void main(String[] args)
    {
        Map carros1 = new HashMap(); // forma de criar map anterior ao Java 5
        Map<String, Float> carros2 = new HashMap<>(); // forma de criar Java 5 - inserção de generics
        HashMap<String, Integer> carros3 = new HashMap<>();
        Map<String, Double> carros4 = Map.of("Gol", 14.4, "Uno", 15.6, "Corsa", 12.5, "Jeep", 11.1);
        System.out.println("-------------------------------------");
        carros4.forEach((c, a) -> System.out.println("Modelo: " + c + " - KM/L: " + a));
        System.out.println("-------------------------------------");
        Map<String, Double> carros5 = new HashMap<>()
        {{
            put("Ferrari", 7.4);
            put("Porsch", 8.3);
            put("Lamborguini", 5.2);
            put("Subaru", 9.6);
        }};
        System.out.println(carros5);
        System.out.println("-------------------------------------");
        System.out.println("Atualizar");
        carros5.put("Lamborguini", 5.9);
        carros5.forEach((a, b) -> System.out.println("Modelo: " + a + " - km/l: " + b));
        System.out.println("-------------------------------------");
        carros5.entrySet().stream().filter(c -> c.getValue() > 8).forEach(System.out::println);
        System.out.println("-------------------------------------");
        System.out.println(carros5.containsKey("Subaru"));
        System.out.println("-------------------------------------");
        System.out.println("Qual o consumo do Subaru: " + carros5.get("Subaru"));

        System.out.println("-------------------------------------");
        System.out.println("Soma dos valores: ");
        Double soma = 0.0;
        Iterator<Double> iterator = carros5.values().iterator();
        while(iterator.hasNext())
        {soma += iterator.next();}
        System.out.println("Total: " + soma);

        System.out.println("-------------------------------------");





    }

}




