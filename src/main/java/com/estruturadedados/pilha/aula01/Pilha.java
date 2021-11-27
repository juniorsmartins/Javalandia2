package com.estruturadedados.pilha.aula01;

public class Pilha
{
    private No refNoEntradaPilha;

    public Pilha()
    {this.refNoEntradaPilha = null;}

    public boolean isEmpty()
    {return refNoEntradaPilha == null ? true : false;}

    public No top()
    {return refNoEntradaPilha;}

    public void push(No novoNo)
    {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop()
    {
        if(!this.isEmpty())
        {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString()
    {
        String retorno = "-----------\n";
        retorno += "   Pilha \n";
        retorno += "-----------\n";

        No noAuxiliar = refNoEntradaPilha;
        while(true)
        {
            if(noAuxiliar != null)
            {
                retorno += "[No {Dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else
            {break;}
        }
        retorno += "-----------\n";
        return retorno;
    }


}
