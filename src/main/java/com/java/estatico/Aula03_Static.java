package com.java.estatico;


public class Aula03_Static extends Bbb
{
    public static void main(String[] args)
    {
        ww();
        Aula03_Static.qq();
    }
}

class Bbb
{
    static void ww() {
        System.out.println("x");
    }
    static void qq() {
        System.out.println("y");
    }
}