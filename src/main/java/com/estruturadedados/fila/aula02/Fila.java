package com.estruturadedados.fila.aula02;

public class Fila
{
    private No refNoEntradaFila;

    public Fila()
    {this.refNoEntradaFila = null;}

    public boolean isEmpty()
    {return refNoEntradaFila == null ? true : false;}

    public void enqueue(Object obj)
    {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public Object first()
    {
        if(!this.isEmpty())
        {
            No buscaPrimeiroNo = refNoEntradaFila;
            while(true)
            {
                if(buscaPrimeiroNo.getRefNo() != null)
                {buscaPrimeiroNo = buscaPrimeiroNo.getRefNo();}
                else
                {break;}
            }
            return buscaPrimeiroNo.getO();
        }
        return null;
    }

    public Object dequeue()
    {
        if(!this.isEmpty())
        {
            No buscaPrimeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true)
            {
                if(buscaPrimeiroNo.getRefNo() != null)
                {
                    noAuxiliar = buscaPrimeiroNo;
                    buscaPrimeiroNo = buscaPrimeiroNo.getRefNo();
                }
                else
                {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return buscaPrimeiroNo.getO();
        }
        return null;
    }

    @Override
    public String toString()
    {
        String retorno = "";

        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null)
        {
            while(true)
            {
                retorno += "[No{objeto = " + noAuxiliar.getO() + " }]\n";
                if(noAuxiliar.getRefNo() != null)
                {
                    noAuxiliar = noAuxiliar.getRefNo();
                }
                else
                {
                    retorno += "null";
                    break;
                }
            }
        }
        else
        {retorno = "null";}

        return retorno;
    }

}
