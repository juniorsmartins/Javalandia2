/*
 *  Usa a sincronização para controlar o acesso
 */
package com.java.threads;

import com.javalandia2.aulas.threads.SumArray_7;

public class MyThread_7 implements Runnable
{
    Thread thrd; 
    static SumArray_7 sa = new SumArray_7(); 
    int a[];
    int answer;

    // Constrói uma nova thread. 
    MyThread_7(String name, int nums[]) 
    {
        thrd = new Thread(this, name); 
        a = nums; 
        thrd.start(); // inicia a thread
    }

    // Começa a execução da nova thread
    @Override
    public void run() 
    {
        int sum; 
        System.out.println(thrd.getName() + " starting.");
        answer = sa.sumArray_7(a); 
        System.out.println("Sum for " + thrd.getName() + " is " + answer); 
        System.out.println(thrd.getName() + " terminating.");
    }
}