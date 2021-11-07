package com.patterns.comportamental.strategy.exemplo01;

import com.patterns.comportamental.strategy.exemplo01.imposto.*;
import com.patterns.strategy.exemplo01.imposto.*;
import com.patterns.comportamental.strategy.exemplo01.orcamento.Orcamento;
import java.math.BigDecimal;

public class TestesImpostos
{
    public static void main(String[] args)
    {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        System.out.println(calc.calcular(orcamento, new ICMS()));
        System.out.println(calc.calcular(orcamento, new ISS()));
        System.out.println(calc.calcular(orcamento, new PIS()));
        System.out.println(calc.calcular(orcamento, new Cofins()));
    }
}
