package com.java.generics;

public class Gen_1<T> // Declara classe do tipo T
{
    T ob; // Declara objeto do tipo T
    
    Gen_1(T o) // Construtor com parâmetro do tipo T
    {ob = o;}
    
    T getOb() // Getters com retorno do tipo T     
    {return ob;}
    
    void showType() // Método para exibir o tipo
    {System.out.println("Tipo de T é: " + ob.getClass().getName());}
}
