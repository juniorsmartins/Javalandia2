package com.java.collection.listas;

import java.util.Comparator;

public class Aula01_ComparatorAgencia implements Comparator<Aula01_Conta>
{
    @Override
    public int compare(Aula01_Conta o1, Aula01_Conta o2)
    {
/*        if(o1.getAgencia() < o2.getAgencia())
        {return -1;}
        if(o1.getAgencia() > o2.getAgencia())
        {return 1;}
        return 0;
*/

        // Ou pode fazer assim

        return o1.getAgencia() - o2.getAgencia();
    }
}
