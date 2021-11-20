package com.java.moeda;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class Aula01_NumPorExtenso
{
    public static void main(String[] args)
    {
        jeito1();
        jeito2();
        comFormatoMoeda();
    }

    public static void jeito1()
    {
        System.out.println("---------------------------------");
        NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
        double valor = 77.12;
        String valorPorExtenso = conversor.toWords(valor);
        System.out.println(valor + " - " + valorPorExtenso);
    }

    public static void jeito2()
    {
        System.out.println("---------------------------------");
        NumericToWordsConverter conversor2 = new NumericToWordsConverter(new InteiroSemFormato());
        BigDecimal valor2 = new BigDecimal("72.25");
        String valorPorExtenso2 = conversor2.toWords(valor2.doubleValue());
        System.out.println(valor2 + " - R$ " + valorPorExtenso2 + "reais.");
    }

    public static void comFormatoMoeda()
    {
        System.out.println("---------------------------------");
        NumericToWordsConverter conversor3 = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor3 = new BigDecimal("57.28");
        String valorPorExtenso3 = conversor3.toWords(valor3.doubleValue());
        System.out.println(valor3 + " - " + valorPorExtenso3);
    }
}



