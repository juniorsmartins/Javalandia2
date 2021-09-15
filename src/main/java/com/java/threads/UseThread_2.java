package com.java.threads;

import com.java.threads.MyThread_2;

public class UseThread_2 
{
    public static void main(String[] args) 
    {
        MyThread_2 mt = new MyThread_2("Child #1"); //  A thread já start ao ser é criada

        for(int i=0; i < 50; i++) 
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