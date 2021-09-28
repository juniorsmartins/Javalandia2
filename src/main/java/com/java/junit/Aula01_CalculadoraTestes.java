package com.java.junit;

public class Aula01_CalculadoraTestes
{
    public static void main(String[] args)
    {
        // Abordagem ineficiente de teste automatizados - funciona, mas ha formas mais eficientes = JUnit

        Aula01_Calculadora calc = new Aula01_Calculadora();
        int resultado = calc.somar(3, 2);
        System.out.println(resultado);

        resultado = calc.somar(3, 0);
        System.out.println(resultado);

        resultado = calc.somar(0, 0);
        System.out.println(resultado);

        resultado = calc.somar(3, -1);
        System.out.println(resultado);


    }
}
