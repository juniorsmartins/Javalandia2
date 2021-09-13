package com.java.generics;

public class SimpGen_2 
{
    public static void main(String[] args) 
    {
        TwoGen_2<Integer, String> tgObj = new TwoGen_2<Integer, String>(88, "Generics");
        
        tgObj.showTypes();
        
        int t = tgObj.getOb1();
        String v = tgObj.getOb2();
        
        System.out.println("\nValor de t: " + t);
        System.out.println("Valor de v: " + v);
    }
}