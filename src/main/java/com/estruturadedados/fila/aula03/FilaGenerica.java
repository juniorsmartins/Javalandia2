package com.estruturadedados.fila.aula03;

public class FilaGenerica<T>
{
    private NoGenerico<T> refNoGenericoEntradaFila;

    public FilaGenerica()
    {this.refNoGenericoEntradaFila = null;}

    public boolean isEmpty()
    {return refNoGenericoEntradaFila == null ? true : false;}

    public void enqueue(T objGenerico)
    {
        NoGenerico<T> novoNoGenerico = new NoGenerico<>(objGenerico);
        novoNoGenerico.setRefNo(refNoGenericoEntradaFila);
        refNoGenericoEntradaFila = novoNoGenerico;
    }

    public T first()
    {
        if(!this.isEmpty())
        {
            NoGenerico<T> buscaPrimeiroNoGenerico = refNoGenericoEntradaFila;
            while(true)
            {
                if(buscaPrimeiroNoGenerico.getRefNo() != null)
                {
                    buscaPrimeiroNoGenerico = buscaPrimeiroNoGenerico.getRefNo();}
                else
                {break;}
            }
            return buscaPrimeiroNoGenerico.getObjGenerico();
        }
        return null;
    }

    public T dequeue()
    {
        if(!this.isEmpty())
        {
            NoGenerico<T> buscaPrimeiroNoGenerico = refNoGenericoEntradaFila;
            NoGenerico<T> noGenericoAuxiliar = refNoGenericoEntradaFila;
            while(true)
            {
                if(buscaPrimeiroNoGenerico.getRefNo() != null)
                {
                    noGenericoAuxiliar = buscaPrimeiroNoGenerico;
                    buscaPrimeiroNoGenerico = buscaPrimeiroNoGenerico.getRefNo();
                }
                else
                {
                    noGenericoAuxiliar.setRefNo(null);
                    break;
                }
            }
            return buscaPrimeiroNoGenerico.getObjGenerico();
        }
        return null;
    }

    @Override
    public String toString()
    {
        String retorno = "";

        NoGenerico<T> noGenericoAuxiliar = refNoGenericoEntradaFila;
        if(refNoGenericoEntradaFila != null)
        {
            while(true)
            {
                retorno += "[No{objeto = " + noGenericoAuxiliar.getObjGenerico() + " }]\n";
                if(noGenericoAuxiliar.getRefNo() != null)
                {
                    noGenericoAuxiliar = noGenericoAuxiliar.getRefNo();
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
