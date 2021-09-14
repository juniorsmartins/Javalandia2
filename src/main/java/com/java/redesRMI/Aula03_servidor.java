package com.java.redesRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Aula03_servidor implements Aula03_validador
{
    // Construtor default
    public Aula03_servidor(){};
    
    @Override
    public boolean validarCPF(String cpf)
    {
        // Criar código para validar CPF
        return true;
    }
    
    // O método main é responsável por criar uma instância da implementação do objeto remoto e exportá-lo para o servidor de registros e
    // vincular essa instância a um nome no servidor de registros que servirá como representação do recurso de rede.
    public static void main(String[] args)
    {
        try
        {
            // Criar instância da implementação do objeto remoto
            Aula03_servidor objeto = new Aula03_servidor();
            
            // O método estático UnicastRemoteObject.exportObject exporta o objeto para receber chamadas de métodos remotos em 
            // uma porta TCP anônima e retorna um stub para o objeto remoto. O método exportObject inicia a escuta na porta TCP 
            // conforme o segundo parâmetro em um novo socket que passa a receber invocaç˜oes remotas.
            Aula03_validador stub = (Aula03_validador) UnicastRemoteObject.exportObject(objeto, 0);

            // O método estático LocateRegistry.createRegistry contém argumentos e retorna um stub que implementa a interface 
            // remota java.rmi.registry.Registry e faz uma instância de um servidor de registros no servidor local, na porta 
            // TCP 1099 (padr˜ao). Em seguida, o método bind é invocado pelo stub registro para ligar o stub do objeto remoto 
            // ao nome ”validador”no registro.
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.bind("validador", stub);
            
            // Aviso para o usuário
            System.out.println("Servidor pronto!");
            
        }catch(Exception e)
        {
            System.err.println("Excecao: " + e.toString());
            e.printStackTrace();
        }
    }
}