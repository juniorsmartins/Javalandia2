package com.java.threads;

public class MyThread_3 extends Thread
{
    // Constrói uma nova thread. 
    MyThread_3(String nome) 
    {
        super(nome); // nomeia a thread 
        start(); // inicia a thread
    }
    
    // Começa a execução da nova thread. 
    public void run() 
    {
        System.out.println(getName() + " starting."); 

        try 
        {
            for(int count=0; count < 10; count++) 
            { 
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            } 
        } catch(InterruptedException exc) 
        {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}