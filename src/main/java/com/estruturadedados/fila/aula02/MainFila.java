package com.estruturadedados.fila.aula02;

public class MainFila
{
    public static void main(String[] args)
    {
        // Fifo - First in, First out
        Fila fila = new Fila();
        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("3");
        fila.enqueue("true");
        fila.enqueue("quinto");

        System.out.println("--------------");
        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println("--------------");
        System.out.println(fila);
        System.out.println("--------------");
        fila.enqueue("último");
        System.out.println(fila);
        System.out.println("--------------");
        System.out.println(fila.first());
        System.out.println("--------------");
        System.out.println(fila);
    }
}
