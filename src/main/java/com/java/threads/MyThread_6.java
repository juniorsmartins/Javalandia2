/*
 * Prioridade de thread
 */
package com.java.threads;

public class MyThread_6 implements Runnable
{
    int count; 
    Thread thrd;
    static boolean stop = false; 
    static String currentName;

    /* Constrói uma nova thread. Observe que esse construtor não inicia realmente a execução das threads. */
    MyThread_6(String name) 
    { 
        thrd = new Thread(this, name); 
        count = 0; 
        currentName = name;
    }

    // Começa a execução da nova thread. 
    public void run() 
    {
        System.out.println(thrd.getName() + " starting."); 
        do 
        {
            count++;
            
            if(currentName.compareTo(thrd.getName()) != 0) 
            { 
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            } 
        }while(stop == false && count < 10000000);
    
        stop = true;
        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}