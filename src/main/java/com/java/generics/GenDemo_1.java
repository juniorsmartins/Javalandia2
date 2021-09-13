package com.java.generics;

public class GenDemo_1 
{
    public static void main(String[] args) 
    {
        Gen_1<Integer> iob; // Cria uma referência Gen para Integer
        
        iob = new Gen_1<Integer> (88); // Instancia um objeto do tipo Gen<Integer>
        iob.showType(); // Exibe o tipo de dado usado em iob
        
        int v = iob.getOb();
        System.out.println("Valor: " + v + "\n");
        
        Gen_1<String> strOb = new Gen_1<String>("Generics Test"); // Cria uma referência Gen para String
        strOb.showType(); // Exibe o tipo de dado usado em strOb
        
        String str = strOb.getOb();
        System.out.println("Valor: " + str + "\n");
    }
}