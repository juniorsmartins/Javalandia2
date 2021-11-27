package com.estruturadedados.fila.aula01;

public class MainFila
{
    public static void main(String[] args)
    {
        // Fifo - First in, First out
        Fila fila = new Fila();
        fila.enqueue(new No("primeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("quarto"));
        fila.enqueue(new No("quinto"));

        System.out.println("--------------");
        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println("--------------");
        System.out.println(fila);
        System.out.println("--------------");
        fila.enqueue(new No("último"));
        System.out.println(fila);
        System.out.println("--------------");
        System.out.println(fila.first());
        System.out.println("--------------");
        System.out.println(fila);
    }
}
