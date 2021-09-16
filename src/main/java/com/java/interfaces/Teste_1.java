package com.java.interfaces;

import com.java.interfaces.TesteControler_1;
import com.javalandia2.treino.interfac.TesteInterface_1;

public final class Teste_1 
{
    private TesteInterface_1 testeInter;
    
    public static void main(String[] args) 
    {
        Teste_1 teste = new Teste_1();
        teste.setTesteInter(new TesteControler_1());
        
        teste.getTesteInter().imprimir();
    }

    public TesteInterface_1 getTesteInter()
    {return testeInter;}
    public void setTesteInter(TesteInterface_1 testeInter)
    {this.testeInter = testeInter;}
}