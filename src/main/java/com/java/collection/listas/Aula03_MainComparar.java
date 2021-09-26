package com.java.collection.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula03_MainComparar
{
    public static void main(String[] args)
    {
        Aula03_Aula aula1 = new Aula03_Aula("Java com Collections", 15);
        Aula03_Aula aula2 = new Aula03_Aula("Java com Wrappers", 21);
        Aula03_Aula aula3 = new Aula03_Aula("Introdução a POO", 14);
        Aula03_Aula aula4 = new Aula03_Aula("Certificação Java - OCA", 17);

        List<Aula03_Aula> listaAulas = new ArrayList<>();
        listaAulas.add(aula1);
        listaAulas.add(aula2);
        listaAulas.add(aula3);
        listaAulas.add(aula4);

        Collections.sort(listaAulas, Comparator.comparing(Aula03_Aula::getTempo));
        listaAulas.forEach(aula -> System.out.println(aula));

    }
}
