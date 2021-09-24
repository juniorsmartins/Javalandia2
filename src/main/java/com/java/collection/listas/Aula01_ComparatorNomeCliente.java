package com.java.collection.listas;

import java.util.Comparator;

public class Aula01_ComparatorNomeCliente implements Comparator<Aula01_Cliente>
{
    @Override
    public int compare(Aula01_Cliente o1, Aula01_Cliente o2)
    {
        String nomeO1 = o1.getNome();
        String nomeO2 = o2.getNome();
        return nomeO1.compareToIgnoreCase(nomeO2);
    }
}
