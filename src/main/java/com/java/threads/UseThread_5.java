package com.java.threads;

import com.java.threads.MyThread_5;

public class UseThread_5 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Main thread starting.");

        // Cria e começa a executar três threads
        MyThread_5 mt1 = new MyThread_5("Child #1"); 
        MyThread_5 mt2 = new MyThread_5("Child #2"); 
        MyThread_5 mt3 = new MyThread_5("Child #3");

        try 
        { 
            mt1.thrd.join(); 
            System.out.println("Child #1 joined."); 
            mt2.thrd.join(); 
            System.out.println("Child #2 joined."); 
            mt3.thrd.join(); 
            System.out.println("Child #3 joined.");
        } catch(InterruptedException exc) 
        {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread interrupted.");
    }
}