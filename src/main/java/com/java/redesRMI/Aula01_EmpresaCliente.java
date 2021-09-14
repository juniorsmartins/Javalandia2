package com.java.redesRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Aula01_EmpresaCliente 
{
    // Construtor Default
    public Aula01_EmpresaCliente()
    {super(); run();}

    // Método de start da aplicação
    public void run()
    {
        try
        {
            // Busca o objeto com a implementação do método pelo nome de registro
            String nomeDoObjeto = "rmi://localhost//cadastrar"; // Define o nome
            Aula01_ICadastro objetoRemoto = (Aula01_ICadastro) Naming.lookup(nomeDoObjeto); // Busca pelo nome
            
            // Aviso ao usuário
            System.out.println("\n---------- Cliente Ativo! ----------");
            
            // Cria o objeto pessoa para cadastrar
            Aula01_Pessoa pessoa = new Aula01_Pessoa();
            // Chama o método remoto de cadastro
            pessoa = (Aula01_Pessoa) objetoRemoto.cadastrarPessoa(pessoa);
            
            // Exibe o resultado do cadastro
            System.out.println("\nResultado: \n" + pessoa.toString());
            
        }catch(NotBoundException | MalformedURLException | RemoteException e)
        {System.err.println("Excecao!" + e.toString());}
    }


    // Método Driver
    public static void main(String[] args) 
    {new Aula01_EmpresaCliente();}
}