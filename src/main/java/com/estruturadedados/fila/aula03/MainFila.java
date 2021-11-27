package com.estruturadedados.fila.aula03;

public class MainFila
{
    public static void main(String[] args)
    {
        // Fifo - First in, First out
        FilaGenerica<String> filaGenerica = new FilaGenerica<>();
        filaGenerica.enqueue("primeiro");
        filaGenerica.enqueue("segundo");
        filaGenerica.enqueue("terceiro");
        filaGenerica.enqueue("quarto");
        filaGenerica.enqueue("quinto");

        System.out.println("--------------");
        System.out.println(filaGenerica);
        System.out.println(filaGenerica.dequeue());
        System.out.println("--------------");
        System.out.println(filaGenerica);
        System.out.println("--------------");
        filaGenerica.enqueue("último");
        System.out.println(filaGenerica);
        System.out.println("--------------");
        System.out.println(filaGenerica.first());
        System.out.println("--------------");
        System.out.println(filaGenerica);
    }
}
