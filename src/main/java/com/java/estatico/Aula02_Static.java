package com.java.estatico;

public class Aula02_Static
{
    public static void main(String[] args) {
        x();
    }
    static void x() {
        System.out.println("x");
        y();
    }
    static void y() {
        System.out.println("y");
    }

}
