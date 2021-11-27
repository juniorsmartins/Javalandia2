package com.estruturadedados.fila.aula01;

public class No
{
    private Object o;
    private No refNo;

    public No(){}
    public No(Object o)
    {
        this.o = o;
        this.refNo = null;
    }

    public Object getO()
    {return o;}
    public void setO(Object o)
    {this.o = o;}
    public No getRefNo()
    {return refNo;}
    public void setRefNo(No refNo)
    {this.refNo = refNo;}

    @Override
    public String toString()
    {return "No{ Objeto = " + o + " }";}
}
