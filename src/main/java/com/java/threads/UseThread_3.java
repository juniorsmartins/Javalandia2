package com.java.threads;

import com.java.threads.MyThread_3;

public class UseThread_3 
{
    public static void main(String[] args) 
    {
        System.out.println("Main thread starting.");

        MyThread_3 mt = new MyThread_3("Child #1");

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
        System.out.println("Main thread ending.");
    }
}