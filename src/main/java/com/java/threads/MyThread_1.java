package com.java.threads;

public class MyThread_1 implements Runnable
{
    // Atributo de instância
    private String meuNome;
    
    // Construtores
    public MyThread_1(String meuNome)
    {this.meuNome = meuNome;}

    // Método de start da thread - Ponto de entrada
    @Override
    public void run() 
    {
        System.out.println("\n" + meuNome + " Starting.");
        try
        {
            for(int count = 0; count < 10; count++)
            {
                Thread.sleep(400);
                System.out.println(meuNome + " - contador: " + count);
            }
        }
        catch(InterruptedException inte)
        {
            System.err.println("Thread interrompida!");
        }
        System.out.println("Thread terminada!");
    }
}