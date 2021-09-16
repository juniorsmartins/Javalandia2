/*
 *  Usa a sincronização para controlar o acesso
 */
package com.java.threads;

public class SumArray_7 
{
    private int sum;

    synchronized int sumArray_7(int nums[]) // redefine sum
    { 
        sum = 0;
        for(int i = 0; i < nums.length; i++) 
        { 
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try 
            { 
                Thread.sleep(10); // permite a alternância de tarefas
            } catch(InterruptedException exc) 
            {System.out.println("Thread interrupted.");} 
        }
        return sum;
    }
}