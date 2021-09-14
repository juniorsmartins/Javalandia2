package com.java.redesRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Aula01_Servidor 
{
    // Método Driver
    public static void main(String[] args) 
    {
        try
        {
            // Cria um objeto da implementação para os métodos se tornarem acessíveis via rede.
            // Usa a interface como tipo e instancia a implementação
            Aula01_ICadastro cadastroImpl = new Aula01_CadastroImpl();
            // O objeto acima precisa de um nome para ser registrado
            String nomeDoObjeto = "rmi://localhost//cadastrar";

            // Registra o objeto acima no servidor de registros
            LocateRegistry.createRegistry(1099);
            Naming.rebind(nomeDoObjeto, cadastroImpl); // Cria o vínculo entre o nomeDoObjeto e o objeto
        
        }catch(RemoteException | MalformedURLException e)
        {System.err.println("Excecao: " + e.toString());}
        
        // Aviso para o usuário
        System.out.println("\n---------- Servidor Ativo! ----------");
    }
}