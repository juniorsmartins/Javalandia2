package com.java.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Aula01_CalculadoraTest
{
    @Test
    public void deveriaSomarDoisNumerosPositivos()
    {
        Aula01_Calculadora calc1 = new Aula01_Calculadora();
        int soma1 = calc1.somar(3,7);

        Assertions.assertEquals(10, soma1);
    }
}
