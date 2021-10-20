package com.java.estatico;

public class Aula01_Static
{
    static int b = getMetodo();
    public static int getMetodo() {
        return a;
    }
    static int a = 15;

    // Imprime 0 e 15 - O método getMetodo inicializou a variável "a" com valor padrão zero
    public static void main(String[] args)
    {
        System.out.println(b);
        System.out.println(a);
    }

}


