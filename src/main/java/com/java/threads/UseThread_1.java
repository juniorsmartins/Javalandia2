package com.java.threads;

import com.java.threads.MyThread_1;

public class UseThread_1 
{
    public static void main(String[] args) 
    {
        System.out.println("Teste de thread iniciado! Driver");
        
        // Objeto thread instanciado 
        MyThread_1 th = new MyThread_1("Child #1");
        
        // Constroi thread no objeto
        Thread nwth = new Thread(th);
        // Inicia a execução da thread
        nwth.start();
        
        for(int i = 0; i < 50; i++)
        {
            System.out.print(".");
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie)
            {
                System.err.println("Main thread interrompida! Driver");
            }
        }
        System.out.println("Main thread finalizada! Driver");
    }
}