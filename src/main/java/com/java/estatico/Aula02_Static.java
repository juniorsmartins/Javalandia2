package com.java.estatico;

public class Aula02_Static
{
    // Pegadinha de prova - Parece focar em Static, mas o foco está na falta de tipo de retorno (não compila)
    public static void main(String[] args) {
        x();
    }
    static x() {
        System.out.println("x");
        y();
    }
    static y() {
        System.out.println("y");
    }

}
