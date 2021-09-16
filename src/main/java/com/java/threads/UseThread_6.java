/*
 * Prioridade de thread
 */
package com.java.threads;

import com.java.threads.MyThread_6;

public class UseThread_6 
{
    public static void main(String args[]) 
    {
        MyThread_6 mt1 = new MyThread_6("High Priority"); 
        MyThread_6 mt2 = new MyThread_6("Low Priority");

        // define as prioridades 
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2); 
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        // inicia as threads 
        mt1.thrd.start(); 
        mt2.thrd.start();
    
        try 
        { 
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) 
        {
            System.out.println("Main thread interrupted.");
        }
    System.out.println("\nHigh priority thread counted to " + mt1.count); 
    System.out.println("Low priority thread counted to " + mt2.count);
    }
}