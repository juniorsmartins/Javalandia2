package com.java.redesRMI.ex05;

import com.utfpr5.interfaces.iRandomico;
import com.utfpr5.interfaces.iCalculadora;
import com.utfpr5.interfaces.iCadastro;
import java.rmi.Naming;

public class ClienteRMI 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Requisições cliente!\n");
            iCadastro cad = (iCadastro) Naming.lookup("rmi://127.0.0.1/cadastro");
            iCalculadora calc = (iCalculadora) Naming.lookup("rmi://127.0.0.1/calculadora");
            iRandomico randomico = (iRandomico) Naming.lookup("rmi://127.0.0.1/randomico");
            
            System.out.println("Cadastro: " + cad.consultarID(10) + "\n");
            System.out.println("Calculadora: " + calc.adicionar(2, 2));
            System.out.println("Consulta servidor OlaMundo: " + cad.consultarNome("Aluno"));
            Thread.sleep(2000);
            
            System.out.println("\nMostrando valores randômicos: \n================================");
            for(int i = 0; i < 10; i++)
            {
                System.out.println("\nValor " + i + ": " + randomico.retornaValorRandomico());
                System.out.println("Valor entre 50 e 100: " + randomico.retornaValorRandomicoIntervalo(50, 100));
                Thread.sleep(300);
            }
        }catch(Exception e)
        {e.printStackTrace();}
        System.out.println("Cliente Finalizado!");
    }
}