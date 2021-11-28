package com.estruturadedados.lista.aula01;

public class ListaEncadeada<T>
{
    private No<T> referenciaEntrada;

    public ListaEncadeada()
    {this.referenciaEntrada = null;}

    public boolean isEmpty()
    {return referenciaEntrada == null ? true : false;}

    public void add(T conteudo)
    {
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty())
        {
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size() - 1; i++)
        {noAuxiliar = noAuxiliar.getProximoNo();}
        noAuxiliar.setProximoNo(novoNo);
    }

    public No<T> getNo(int index)
    {
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i < this.size() -1; i++)
        {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public void validaIndice(int index)
    {
        if(index >= size())
        {throw new IndexOutOfBoundsException("Não existe conteúdo neste índice: " + index);}
    }

    public int size()
    {
        int tamanhoLista = 0;

        No<T> referenciaAuxiliar = referenciaEntrada;
        while(true)
        {
            if(referenciaAuxiliar != null)
            {
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null)
                {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }
                else
                {break;}
            }
            else
            {break;}
        }
        return tamanhoLista;
    }

}


