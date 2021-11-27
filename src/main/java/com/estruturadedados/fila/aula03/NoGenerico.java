package com.estruturadedados.fila.aula03;

public class NoGenerico<T>
{
    private T objGenerico;
    private NoGenerico<T> refNoGenerico;

    public NoGenerico(){}
    public NoGenerico(T objGenerico)
    {
        this.objGenerico = objGenerico;
        this.refNoGenerico = null;
    }

    public T getObjGenerico()
    {return objGenerico;}
    public void setO(T objGenerico)
    {this.objGenerico = objGenerico;}
    public NoGenerico<T> getRefNo()
    {return refNoGenerico;}
    public void setRefNo(NoGenerico<T> refNoGenerico)
    {this.refNoGenerico = refNoGenerico;}

    @Override
    public String toString()
    {return "No{ Objeto = " + objGenerico + " }";}
}
