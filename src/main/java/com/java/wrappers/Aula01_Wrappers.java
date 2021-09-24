package com.java.wrappers;

public class Aula01_Wrappers
{
    public static void main(String[] args)
    {
        int inteiro1 = 10;
        Integer inteiroObjeto = new Integer(29); // Padrão antigo deprecado
        Integer inteiroObj1 = Integer.valueOf(10); // Padrão atual
        Integer inteiroObj2 = Integer.valueOf(inteiro1); // Padrão atual
        int inteiro2 = inteiroObj2.intValue(); // Unboxing Integer para int


    }
}
