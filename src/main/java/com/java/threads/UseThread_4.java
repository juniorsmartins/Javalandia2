package com.java.threads;

import com.java.threads.MyThread_4;

public class UseThread_4 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Main thread starting.");

        // Cria e começa a executar três threads
        MyThread_4 mt1 = new MyThread_4("Child #1"); 
        MyThread_4 mt2 = new MyThread_4("Child #2"); 
        MyThread_4 mt3 = new MyThread_4("Child #3");

        for(int i = 0; i < 50; i++) 
        { 
            System.out.print(".");
            try 
            {
                Thread.sleep(100);
            } catch(InterruptedException exc) 
            {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread interrupted.");
    }
}