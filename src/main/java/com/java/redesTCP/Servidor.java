package com.java.redesTCP;

import com.java.redesTCP.Pessoa;
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.logging.Level; 
import static java.lang.System.*; 

public final class Servidor extends Thread
{
    // Conexao como atributo de instancia para cada objeto thread 
    public Socket connection; 
     
    // Construtor parametrizado em conexao 
    public Servidor(Socket conn) 
    {connection = conn;} 
     
    // Metodo sobreescrito especifico de Threads 
    @Override 
    public void run() 
    { 
        try 
        { 
            // Estabelece canal de entrada de dados 
            ObjectInputStream canalEntrada = new ObjectInputStream(connection.getInputStream()); 
 
            // Recebe o objeto, mas precisa de casting para converter 
            Pessoa pessoaServer = new Pessoa(); 
            pessoaServer = (Pessoa) canalEntrada.readObject(); 
 
            // Mensagens no console do servidor 
            out.println("Nome: " + pessoaServer.getNome()); 
            out.println("Idade: " + pessoaServer.getIdade()); 
             
            // Processa as informacoes (transforma nome em maiúsculo e insere mensagem para retornar) 
            pessoaServer.setNome(pessoaServer.getNome().toUpperCase()); 
            String frase = "\nServiço conectado com sucesso! \nNome: " + pessoaServer.getNome()  
                    + "\nIdade: " + pessoaServer.getIdade() + "\nPode enviar mais!"; 
            pessoaServer.setMensagem(frase); 
             
            // Mensagem no console do servidor 
            out.println("Dados processados e retornados para o cliente!"); 
             
            // Estabelece canal de saida de dados 
            ObjectOutputStream channelOut = new ObjectOutputStream(connection.getOutputStream()); 
             
            // Retorna objeto após processado 
            channelOut.writeObject(pessoaServer); 
             
            // Fecha canais de entrada e saida e conexao 
            canalEntrada.close(); 
            channelOut.close(); 
            connection.close(); 
        } 
        catch (ClassNotFoundException ex) 
        {java.util.logging.Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);} 
        catch(IOException iee) 
        {iee.toString();} 
    } 
 
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    { 
        try 
        { 
            // Estabelece porta de acesso ao servidor 
            ServerSocket server = new ServerSocket(53321); 
             
            // Cria loop infinito para manter o servidor apto a receber conexoes ininterruptamente 
            while(true) 
            { 
                // Metodo accept bloquea o fluxo continuo do software ate estabelecer conexao com cliente (aguarda ate firmar) 
                Socket connection = server.accept(); 
                               
                // Instancia o servidor com conexao estabelecida 
                Servidor servidor = new Servidor(connection); 
                               
                // Imprime aviso no console do servidor 
                out.println("\nConexão estabelecida com cliente!"); 
 
                // Inicializa o método run do servidor 
                servidor.start(); 
            } 
        } 
        catch(IOException ioe) 
        {} 
    } 
}