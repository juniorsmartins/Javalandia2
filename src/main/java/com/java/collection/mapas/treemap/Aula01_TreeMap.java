package com.java.collection.mapas.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class Jogador
{
    public String cpf;
    public String nome;
    public int pontos;
    public Jogador(String cpf, String nome, int pontos)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.pontos = pontos;
    };

    public int getPontos()
    {return pontos;}


}

public class Aula01_TreeMap
{
    public static void main(String[] args)
    {
        NavigableMap<String, Jogador> pessoas = new TreeMap<>();
        Jogador j1 = new Jogador("555888", "Mariana", 10);
        Jogador j2 = new Jogador("122333", "Roberta", 14);
        Jogador j3 = new Jogador("968897", "Bertoldo", 1);
        Jogador j4 = new Jogador("666998", "Fronline", 40);
        Jogador j5 = new Jogador("299877", "Bernardete", 8);
        pessoas.put("555888", j1);
        pessoas.put("122333", j2);
        pessoas.put("968897", j3);
        pessoas.put("666998", j4);
        pessoas.put("299877", j5);

        // imprime em ordem crescente - da chave menor para a maior
        pessoas.forEach((p1, p2) -> System.out.println(p1 + " - " + p2));

        System.out.println("-------------------");

        // imprime em ordem decrescente - da chave maior para a chave menor
        pessoas.descendingMap().forEach((p1, p2) -> System.out.println(p1 + " - " + p2));

        System.out.println("-------------------");

        pessoas.entrySet().stream().forEachOrdered((j) -> {
            Comparator.comparing(Jogador::getPontos);
            System.out.println(j.getValue().nome + " - " + j.getValue().pontos);
        });

        System.out.println("-------------------");

        pessoas.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Jogador::getPontos).reversed()))
                .forEach(j -> System.out.println(j.getValue().nome + " - " + j.getValue().pontos));

        /*
        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        list.forEach(System.out::println);

        Stream<Map.Entry<Integer, Integer>> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        sorted.forEach(System.out::println);

        Map<Integer, Integer> result = map.entrySet().stream()
                .sorted(Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        result.forEach((k,v)->System.out.println(k+"="+v));
        */
    }
}







