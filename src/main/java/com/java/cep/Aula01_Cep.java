package com.java.cep;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class Aula01_Cep
{
    public static void main(String[] args)
    {
        ViaCEPClient cliente = new ViaCEPClient();
        ViaCEPEndereco endereco = null;
        try
        {
            endereco = cliente.getEndereco("78020400");
        }catch (IOException e)
        {e.printStackTrace();}

        System.out.println(endereco.getUf() + " - " + endereco.getLocalidade() +
                " - " + endereco.getBairro() + " - " + endereco.getLogradouro() +
                " - " + endereco.getComplemento() + " - " + endereco.getIbge());
    }
}



