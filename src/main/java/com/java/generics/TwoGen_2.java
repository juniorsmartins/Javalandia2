package com.java.generics;

public class TwoGen_2<T, V> // Classe Genérica com dois parâmetros de tipo
{
    T ob1;
    V ob2;
    
    TwoGen_2(T ob1, V ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    
    void showTypes()
    {
        System.out.println("\nType of T is: " + ob1.getClass().getName());
        System.out.println("Type of V is: " + ob2.getClass().getName());
    }
    
    T getOb1()
    {return ob1;}
    V getOb2()
    {return ob2;}
}