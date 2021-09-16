/*
 *  Usa a sincronização para controlar o acesso
 */
package com.java.threads;

import com.java.threads.MyThread_7;

public class UseThread_7 
{
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 3, 4, 5};
        MyThread_7 mt1 = new MyThread_7("Child #1", a); 
        MyThread_7 mt2 = new MyThread_7("Child #2", a);

        try 
        { 
            mt1.thrd.join();
            mt2.thrd.join();
        }catch(InterruptedException exc) 
        {System.out.println("Main thread interrupted.");}
    }
}