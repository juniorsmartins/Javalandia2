package com.java.redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public final class Aula03_socket_serverThread extends Thread // Pegar herança da classe Thread
{
    // Atributo de Instância
    private final Socket socket;
    // Construtor
    public Aula03_socket_serverThread(Socket conexao)
    {socket = conexao;}
    
    // Metodo Driver
    public static void main(String[] args) throws IOException
    {
        // Criar servidor
        ServerSocket server = new ServerSocket(55002);
        
        // Aviso
        System.out.println("Servidor Ativo!");
        
        // Loop infinito
        while(true)
        {
            // Ouvir conexao por método bloqueante
            Socket conexao = server.accept();

            // Aviso de conexao
            System.out.println("\nServidor estabelece conexao com cliente!");
            
            // Criar objeto servidor e startar a thread responsável pela conexao
            Aula03_socket_serverThread servTh = new Aula03_socket_serverThread(conexao);
            servTh.start(); // Ativa o método Run
        }
    }
    
    @Override
    public void run()
    {
        try
        {
            // Cria referencia para o canal de entrada de dados
            DataInputStream dataIn = new DataInputStream(socket.getInputStream());
            // Recebe a mensagem
            String message = dataIn.readUTF();
            
            // Mostra mensagem
            System.out.println("Mensagem recebida: " + message);
            
            // Trata a mensagem
            String messageAlter = message.trim().toLowerCase().replace("o", "x");
            
            // Mostra mensagem alterada
            System.out.println("Mensagem alterada: " + messageAlter);
            
            // Cria referencia para o canal de saída de dados
            DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
            // Devolve a mensagem
            dataOut.writeUTF(messageAlter);
            
        }catch(IOException ioe)
        {ioe.printStackTrace();}
    }
}