package com.estruturadedados.pilha.aula01;

public class MainPilha
{
    public static void main(String[] args)
    {
        // Lifo - Last in, First out
        Pilha pilha = new Pilha();
        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));

        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.push(new No(99));
        System.out.println(pilha);

    }
}
