package com.java.threads;

public class MyThread_2 implements Runnable
{
    // Atributo de Instância - Uma referência ao objeto thread é armazenada
    Thread minhaThread;
    
    MyThread_2(String name)
    {
        minhaThread = new Thread(this, name); // A thread é nomeada quando é criada
        minhaThread.start(); // Começa a executar a thread
    }

    // Começa a execução da nova thread
    @Override
    public void run() 
    {
        System.out.println(minhaThread.getName() + " starting."); 
        try 
        {
            for(int count = 0; count < 10; count++) 
            { 
                Thread.sleep(400);
                System.out.println("In " + minhaThread.getName() + ", count is " + count);
            } 
        }
        catch(InterruptedException exc) 
        {
            System.out.println(minhaThread.getName() + " interrupted."); 
        }
        System.out.println(minhaThread.getName() + " terminating.");
    }
}