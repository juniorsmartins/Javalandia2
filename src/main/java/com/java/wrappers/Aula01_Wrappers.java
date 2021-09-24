package com.java.wrappers;

public class Aula01_Wrappers
{
    public static void main(String[] args)
    {
        // Integer
        int inteiro1 = 10;
        Integer inteiroObjeto = new Integer(29); // Padrão antigo deprecado
        Integer inteiroObj1 = Integer.valueOf(10); // Padrão atual
        Integer inteiroObj2 = Integer.valueOf(inteiro1); // Padrão atual
        int inteiro2 = inteiroObj2.intValue(); // Unboxing Integer para int

        String num1 = "20";
        Integer num2 = Integer.valueOf(num1); // Transforma String em Integer
        int num3 = Integer.parseInt(num1); // Transforma String em int
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("--------------------");

        String num4 = " 25 ";
        Integer num5 = Integer.valueOf(num4.trim());
        int num6 = Integer.parseInt(num4.trim());
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

        // Transformar em double
        System.out.println(Double.parseDouble(num4));
    }
}
